package com.app.basics.base;

import java.lang.System;

/**
 * Created by HankGreen on 2017/11/30.
 * 该类内的每一个生成的 Fragment 都将保存在内存之中，
 * 因此适用于那些相对静态的页，数量也比较少的那种；
 * 如果需要处理有很多页，并且数据动态性较大、占用内存较多的情况，
 * 应该使用FragmentStatePagerAdapter。
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\fH\u0016J,\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0003R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/app/basics/base/BaseFragmentAdapter;", "Landroid/support/v4/app/FragmentPagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "fragmentList", "", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V", "mTitles", "", "(Landroid/support/v4/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "getCount", "", "getItem", "position", "getPageTitle", "", "setFragments", "", "fragments", "basics_debug"})
public final class BaseFragmentAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private java.util.List<? extends android.support.v4.app.Fragment> fragmentList;
    private java.util.List<java.lang.String> mTitles;
    
    @android.annotation.SuppressLint(value = {"CommitTransaction"})
    private final void setFragments(android.support.v4.app.FragmentManager fm, java.util.List<? extends android.support.v4.app.Fragment> fragments, java.util.List<java.lang.String> mTitles) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    public BaseFragmentAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.support.v4.app.Fragment> fragmentList) {
        super(null);
    }
    
    public BaseFragmentAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.support.v4.app.Fragment> fragmentList, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> mTitles) {
        super(null);
    }
}