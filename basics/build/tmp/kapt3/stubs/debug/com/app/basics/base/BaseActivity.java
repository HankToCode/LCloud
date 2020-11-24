package com.app.basics.base;

import java.lang.System;

/**
 * @author HankGreen
 * created: 2017/10/25
 * desc:BaseActivity基类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0014J\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u001e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J/\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00132\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 2\b\b\u0001\u0010!\u001a\u00020\"H\u0016\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u000fH&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/app/basics/base/BaseActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "mLayoutStatusView", "Lcom/classic/common/MultipleStatusView;", "getMLayoutStatusView", "()Lcom/classic/common/MultipleStatusView;", "setMLayoutStatusView", "(Lcom/classic/common/MultipleStatusView;)V", "mRetryClickListener", "Landroid/view/View$OnClickListener;", "getMRetryClickListener", "()Landroid/view/View$OnClickListener;", "initData", "", "initListener", "initView", "layoutId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "perms", "", "", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "start", "basics_debug"})
public abstract class BaseActivity extends android.support.v7.app.AppCompatActivity implements pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks {
    
    /**
     * 多种状态的 View 的切换
     */
    @org.jetbrains.annotations.Nullable()
    private com.classic.common.MultipleStatusView mLayoutStatusView;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener mRetryClickListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    protected final com.classic.common.MultipleStatusView getMLayoutStatusView() {
        return null;
    }
    
    protected final void setMLayoutStatusView(@org.jetbrains.annotations.Nullable()
    com.classic.common.MultipleStatusView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListener() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.View.OnClickListener getMRetryClickListener() {
        return null;
    }
    
    /**
     * 加载布局
     */
    public abstract int layoutId();
    
    /**
     * 初始化数据
     */
    public abstract void initData();
    
    /**
     * 初始化 View
     */
    public abstract void initView();
    
    /**
     * 开始请求
     */
    public abstract void start();
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    /**
     * 重写要申请权限的Activity或者Fragment的onRequestPermissionsResult()方法，
     * 在里面调用EasyPermissions.onRequestPermissionsResult()，实现回调。
     *
     * @param requestCode  权限请求的识别码
     * @param permissions  申请的权限
     * @param grantResults 授权结果
     */
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    @io.reactivex.annotations.NonNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    @io.reactivex.annotations.NonNull()
    int[] grantResults) {
    }
    
    /**
     * 当权限被成功申请的时候执行回调
     *
     * @param requestCode 权限请求的识别码
     * @param perms       申请的权限的名字
     */
    @java.lang.Override()
    public void onPermissionsGranted(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    /**
     * 当权限申请失败的时候执行的回调
     *
     * @param requestCode 权限请求的识别码
     * @param perms       申请的权限的名字
     */
    @java.lang.Override()
    public void onPermissionsDenied(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    public BaseActivity() {
        super();
    }
}