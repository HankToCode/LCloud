package com.app.cloud.ui.send.activity

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.TypedValue
import androidx.recyclerview.widget.GridLayoutManager
import com.app.basics.base.BaseActivity
import com.app.basics.glide.GlideLoader
import com.app.basics.utils.FileUtils
import com.app.basics.utils.Util
import com.app.cloud.R
import com.app.cloud.ex.clicksJustSeconds
import com.app.cloud.ex.initToolbar
import com.app.cloud.ex.setVisibleOrGone
import com.app.cloud.helper.DialogHelper
import com.app.cloud.mvp.contract.SendingContract
import com.app.cloud.mvp.model.bean.SendingTabBean
import com.app.cloud.mvp.model.bean.WxMessageListBean
import com.app.cloud.mvp.model.bean.WxPhotoOrVideoBean
import com.app.cloud.mvp.model.send.WxMessageListSend
import com.app.cloud.mvp.presenter.SendingPresenter
import com.app.cloud.ui.common.activity.ImageViewPreviewActivity
import com.app.cloud.ui.send.adapter.SendingPhotoOrVideoAdapter
import com.app.cloud.ui.send.adapter.SendingVoiceAdapter
import com.app.cloud.view.GridSpacingItemDecoration
import com.blankj.utilcode.util.SizeUtils
import com.hjq.toast.ToastUtils
import com.lcw.library.imagepicker.ImagePicker
import kotlinx.android.synthetic.main.activity_sending.*
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions
import pub.devrel.easypermissions.PermissionRequest

/**
 * Created by HankGreen on 2020/3/20.
 * desc: 发送界面
 * Tips:onDestroy() 记得mPresenter.detachView()
 */
class SendingActivity : BaseActivity(), SendingContract.View {
    override fun layoutId(): Int = R.layout.activity_sending

    private val mPresenter by lazy { SendingPresenter() }

    private var currentPosition = SendingTabBean.TAB_IMAGE

    private var adapters = mutableListOf<SendingPhotoOrVideoAdapter>()

    private val bean by lazy {
        intent.getSerializableExtra(INTENT_BEAN) as WxMessageListBean
    }

    private val target by lazy { intent.getStringExtra(INTENT_TARGET) }

    private lateinit var imagePhotoOrVideoAdapter: SendingPhotoOrVideoAdapter
    private lateinit var videoPhotoOrVideoAdapter: SendingPhotoOrVideoAdapter
    private lateinit var voiceAdapter: SendingVoiceAdapter


    @SuppressLint("SetTextI18n")
    override fun initView() {

        initToolbar(getTitleName())

        imagePhotoOrVideoAdapter = SendingPhotoOrVideoAdapter(SendingTabBean.TAB_IMAGE)
        videoPhotoOrVideoAdapter = SendingPhotoOrVideoAdapter(SendingTabBean.TAB_VIDEO)
        //图片点击事件
        imagePhotoOrVideoAdapter.setOnItemChildClickListener { adapter, view, position ->
            val item = adapter.getItem(position) as WxPhotoOrVideoBean

            if (view.id == R.id.ivImage && item.isAdd) {
                EasyPermissions.requestPermissions(
                    PermissionRequest.Builder(
                        this, CAMERA_PERMISSION_IMAGE,
                        Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE
                    )
                        .setRationale(getString(R.string.permission_of_camera_and_write1))
                        .setPositiveButtonText(getString(R.string.confirm))
                        .setNegativeButtonText(getString(R.string.cancel))
                        .build()
                )
            }
            if (view.id == R.id.ivImage && !item.isAdd) {
                val imageP = ArrayList<String>()
                imageP.addAll(imagePaths!!)
                ImageViewPreviewActivity.startActivity(this@SendingActivity, imageP, position)
            }
        }
        //视频点击事件
        videoPhotoOrVideoAdapter.setOnItemChildClickListener { adapter, view, position ->
            val item = adapter.getItem(position) as WxPhotoOrVideoBean

            if (view.id == R.id.ivImage && item.isAdd) {
                EasyPermissions.requestPermissions(
                    PermissionRequest.Builder(
                        this, CAMERA_PERMISSION_VIDEO,
                        Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE
                    )
                        .setRationale(getString(R.string.permission_of_camera_and_write2))
                        .setPositiveButtonText(getString(R.string.confirm))
                        .setNegativeButtonText(getString(R.string.cancel))
                        .build()
                )
            }
            if (view.id == R.id.ivImage && !item.isAdd) {
                Util.playVideo(this@SendingActivity, item.videoUrl)
            }
        }
        adapters.add(imagePhotoOrVideoAdapter)
        adapters.add(videoPhotoOrVideoAdapter)

        //声频适配器
        voiceAdapter = SendingVoiceAdapter()


        tvPhoto.setOnClickListener { setTabSelection(SendingTabBean.TAB_IMAGE) }
        tvVideo.setOnClickListener { setTabSelection(SendingTabBean.TAB_VIDEO) }

        val layoutManager = GridLayoutManager(this@SendingActivity, 3)
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.addItemDecoration(GridSpacingItemDecoration(3, SizeUtils.dp2px(10f), false))
        //选中
        setTabSelection(currentPosition)

        imagePhotoOrVideoAdapter.refreshData(mutableListOf())
        videoPhotoOrVideoAdapter.refreshData(mutableListOf())
        voiceAdapter.refreshData(mutableListOf())


        //TODO
        //标题
        etTitle.setText(bean.title)
        //内容
        etContent.setText(bean.content)

        //范围
        tvRange.text = bean.wxId
        //时间间隔
        tvInterval.text = "${bean.delayTime}秒"
        //执行时间
        tvTime.text = bean.sendTime

        when (bean.optMethod) {
            WxMessageListBean.OPT_METHOD_ADD, WxMessageListBean.OPT_METHOD_EDIT -> {
                tvResult.setVisibleOrGone(false)

                if (target == WxMessageListSend.TARGET_CHAT) {
                    tvVoice.setVisibleOrGone(true)
                    mRecyclerViewVoice.setVisibleOrGone(true)
                    llInterval.setVisibleOrGone(true)

                } else if (target == WxMessageListSend.TARGET_WECHAT_MOMENTS) {
                    tvVoice.setVisibleOrGone(false)
                    mRecyclerViewVoice.setVisibleOrGone(false)
                    llInterval.setVisibleOrGone(false)

                }


            }
            WxMessageListBean.OPT_METHOD_VIEW -> {//查看
                //发送结果
                tvResult.setVisibleOrGone(true)
                tvResult.text = "发送结果：未知字段，因为这里后端返回了多个成功字段和需求要求不一致"

                etContent.isEnabled = false
                etContent.isFocusable = false
                //表情
                ivExpression.isEnabled = false
                //删除
                ivDelete.isEnabled = false

                //确认按钮
                tvConfirm.text = "再次编辑"

                if (target == WxMessageListSend.TARGET_CHAT) {
                    tvVoice.setVisibleOrGone(true)
                    mRecyclerViewVoice.setVisibleOrGone(true)
                    llInterval.setVisibleOrGone(true)

                } else if (target == WxMessageListSend.TARGET_WECHAT_MOMENTS) {
                    tvVoice.setVisibleOrGone(false)
                    mRecyclerViewVoice.setVisibleOrGone(false)
                    llInterval.setVisibleOrGone(false)

                }

            }
        }

        clicksJustSeconds(ivDelete) {
            DialogHelper.showCommonTipsDialog(
                this@SendingActivity,
                "",
                "确定清空已输入内容吗？",
                "取消",
                "确认",
                {},
                {
                    etContent.setText("")
                })
        }

        clicksJustSeconds(tvConfirm) {
            when (bean.optMethod) {
                WxMessageListBean.OPT_METHOD_ADD, WxMessageListBean.OPT_METHOD_EDIT -> {
                    /*val send = WxSendSend()
                    mPresenter.wxSend(send)*/
                }
                WxMessageListBean.OPT_METHOD_VIEW -> {//查看
                    bean.optMethod = WxMessageListBean.OPT_METHOD_EDIT
                    startActivity(this@SendingActivity, bean, target)

                }
            }
        }
    }

    override fun start() {

    }

    private fun getTitleName(): String {
        when (bean.optMethod) {
            WxMessageListBean.OPT_METHOD_ADD, WxMessageListBean.OPT_METHOD_EDIT -> {
                if (target == WxMessageListSend.TARGET_CHAT) {
                    return "编辑群发"
                } else if (target == WxMessageListSend.TARGET_WECHAT_MOMENTS) {
                    return "编辑朋友圈"
                }
            }
            WxMessageListBean.OPT_METHOD_VIEW -> {//查看
                if (target == WxMessageListSend.TARGET_CHAT) {
                    return "查看群发"
                } else if (target == WxMessageListSend.TARGET_WECHAT_MOMENTS) {
                    return "查看朋友圈"
                }
            }
        }
        return ""
    }

    private fun setTabSelection(position: Int) {

        currentPosition = position

        //切换适配器
        mRecyclerView.adapter = adapters[position]
        mRecyclerView.adapter?.notifyDataSetChanged()
        //更改头部导航栏按钮状态
        changeButtonState(currentPosition)
    }


    /**
     * 更改按钮状态
     */
    private fun changeButtonState(position: Int) {
        when (position) {
            SendingTabBean.TAB_IMAGE -> {
                tvPhoto.isSelected = true
                tvVideo.isSelected = false

                tvPhoto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
                tvVideo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
            }
            SendingTabBean.TAB_VIDEO -> {
                tvPhoto.isSelected = false
                tvVideo.isSelected = true

                tvPhoto.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                tvVideo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
            }
        }

        tvPhotoLine.setVisibleOrGone(tvPhoto.isSelected)
        tvVideoLine.setVisibleOrGone(tvVideo.isSelected)
    }

    /**
     * 获取权限成功，执行下一步操作
     */
    @AfterPermissionGranted(CAMERA_PERMISSION_IMAGE)
    fun openAlbumImage() {
        var arrayList = ArrayList<String>()
        ImagePicker.getInstance()
            .setTitle(getString(R.string.image_selection)) //设置标题
            .showCamera(true) //设置是否显示拍照按钮
            .showImage(true) //设置是否展示图片
            .showVideo(false)
            .setSingleType(true) //设置图片视频不能同时选择
            .setMaxCount(9) //设置最大选择图片数目(默认为1，单选)
            .setImagePaths(arrayList)
            .setImageLoader(GlideLoader()) //设置自定义图片加载器
            .start(
                this,
                REQUEST_SELECT_IMAGES_CODE
            ) //REQEST_SELECT_IMAGES_CODE为Intent调用的requestCode
    }

    @AfterPermissionGranted(CAMERA_PERMISSION_VIDEO)
    fun openAlbumVideo() {
        var arrayList = ArrayList<String>()
        ImagePicker.getInstance()
            .setTitle(getString(R.string.video_selection)) //设置标题
            .showCamera(false) //设置是否显示拍照按钮
            .showImage(false) //设置是否展示图片
            .showVideo(true)
            .setSingleType(true) //设置图片视频不能同时选择
            .setMaxCount(9) //设置最大选择图片数目(默认为1，单选)
            .setImagePaths(arrayList)
            .setImageLoader(GlideLoader()) //设置自定义图片加载器
            .start(
                this,
                REQUEST_SELECT_VIDEOS_CODE
            ) //REQEST_SELECT_IMAGES_CODE为Intent调用的requestCode
    }

    private var imagePaths: MutableList<String>? = null
    private var videoPaths: MutableList<String>? = null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === REQUEST_SELECT_IMAGES_CODE && resultCode === Activity.RESULT_OK) {
            if (data == null) {
                return
            }
            data.getStringArrayListExtra(ImagePicker.EXTRA_SELECT_IMAGES)?.apply {
                this[0]?.apply {
                    var fileSize = FileUtils.getFileSize(this)
                    if (fileSize < 30 * 1024 * 1024) {
                        imagePaths = data.getStringArrayListExtra(ImagePicker.EXTRA_SELECT_IMAGES)
                        //上传成功展示video
                        try {
                            val list = mutableListOf<WxPhotoOrVideoBean>()
                            imagePaths?.forEach {
                                val wxPhotoOrVideoBean = WxPhotoOrVideoBean(it, "", false)
                                list.add(wxPhotoOrVideoBean)
                                imagePhotoOrVideoAdapter.refreshData(list)
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    } else {
                        ToastUtils.show(R.string.upload_video_tip2)
                    }
                }
            }
        }
        if (requestCode === REQUEST_SELECT_VIDEOS_CODE && resultCode === Activity.RESULT_OK) {
            if (data == null) {
                return
            }
            data.getStringArrayListExtra(ImagePicker.EXTRA_SELECT_IMAGES)?.apply {
                this[0]?.apply {
                    var fileSize = FileUtils.getFileSize(this)
                    if (fileSize < 30 * 1024 * 1024) {
                        videoPaths = data.getStringArrayListExtra(ImagePicker.EXTRA_SELECT_IMAGES)
                        //上传成功展示video
                        try {
                            val list = mutableListOf<WxPhotoOrVideoBean>()
                            videoPaths?.forEach {
                                val wxPhotoOrVideoBean = WxPhotoOrVideoBean("", it, false)
                                list.add(wxPhotoOrVideoBean)
                                videoPhotoOrVideoAdapter.refreshData(list)
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    } else {
                        ToastUtils.show(R.string.upload_video_tip2)
                    }
                }
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    companion object {
        private const val INTENT_BEAN = "bean"
        private const val INTENT_TARGET = "target"

        const val CAMERA_PERMISSION_IMAGE = 10000
        const val CAMERA_PERMISSION_VIDEO = 10001
        const val REQUEST_SELECT_IMAGES_CODE = 10002
        const val REQUEST_SELECT_VIDEOS_CODE = 10003

        fun startActivity(
            context: Context,
            bean: WxMessageListBean,
            target: String
        ) {
            val intent = Intent(context, SendingActivity::class.java)
            intent.putExtra(INTENT_BEAN, bean)
            intent.putExtra(INTENT_TARGET, target)
            context.startActivity(intent)
        }
    }
}
