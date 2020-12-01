package com.app.basics.base;

import java.lang.System;

/**
 * @author HankGreen
 * created: 2017/10/25
 * desc:
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\'J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u001e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\u001e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\f2\u000e\b\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\b\b\u0001\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\u001a\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006*"}, d2 = {"Lcom/app/basics/base/BaseFragment;", "Landroid/support/v4/app/Fragment;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "hasLoadData", "", "isViewPrepare", "mRetryClickListener", "Landroid/view/View$OnClickListener;", "getMRetryClickListener", "()Landroid/view/View$OnClickListener;", "getLayoutId", "", "initView", "", "lazyLoad", "lazyLoadDataIfPrepared", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPermissionsDenied", "requestCode", "perms", "", "", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "setUserVisibleHint", "isVisibleToUser", "basics_debug"})
public abstract class BaseFragment extends android.support.v4.app.Fragment implements pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks {
    
    /**
     * 视图是否加载完毕
     */
    private boolean isViewPrepare;
    
    /**
     * 数据是否加载过了
     */
    private boolean hasLoadData;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener mRetryClickListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void lazyLoadDataIfPrepared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.View.OnClickListener getMRetryClickListener() {
        return null;
    }
    
    /**
     * 加载布局
     */
    @android.support.annotation.LayoutRes()
    public abstract int getLayoutId();
    
    /**
     * 初始化 ViewI
     */
    public abstract void initView();
    
    /**
     * 懒加载
     */
    public abstract void lazyLoad();
    
    @java.lang.Override()
    public void onDestroy() {
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
    
    public BaseFragment() {
        super();
    }
}