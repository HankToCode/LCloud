package com.app.basics.utils;

import java.lang.System;

/**
 * Created by HankGreen on 2017/6/19.
 * 正则相关工具类
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/app/basics/utils/RegexUtil;", "", "()V", "Companion", "basics_debug"})
public final class RegexUtil {
    public static final com.app.basics.utils.RegexUtil.Companion Companion = null;
    
    private RegexUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ&\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J&\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\'\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0014\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u0015\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0016\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001a\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001b\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/app/basics/utils/RegexUtil$Companion;", "", "()V", "getMatches", "", "", "regex", "input", "", "getReplaceAll", "replacement", "getReplaceFirst", "getSplits", "", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "isDate", "", "isEmail", "isIDCard15", "isIDCard18", "isIP", "isMatch", "isMobileExact", "isMobileSimple", "isTel", "isURL", "isUsername", "isZh", "basics_debug"})
    public static final class Companion {
        
        /**
         * 验证手机号（简单）
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isMobileSimple(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证手机号（精确）
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isMobileExact(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证电话号码
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isTel(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证身份证号码15位
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isIDCard15(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证身份证号码18位
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isIDCard18(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证邮箱
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isEmail(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证URL
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isURL(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证汉字
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isZh(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证用户名
         *
         * 取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isUsername(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证yyyy-MM-dd格式的日期校验，已考虑平闰年
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isDate(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 验证IP地址
         *
         * @param input 待验证文本
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isIP(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 判断是否匹配正则
         *
         * @param regex 正则表达式
         * @param input 要匹配的字符串
         * @return `true`: 匹配<br></br>`false`: 不匹配
         */
        public final boolean isMatch(@org.jetbrains.annotations.Nullable()
        java.lang.String regex, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return false;
        }
        
        /**
         * 获取正则匹配的部分
         *
         * @param regex 正则表达式
         * @param input 要匹配的字符串
         * @return 正则匹配的部分
         */
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<java.lang.String> getMatches(@org.jetbrains.annotations.Nullable()
        java.lang.String regex, @org.jetbrains.annotations.Nullable()
        java.lang.CharSequence input) {
            return null;
        }
        
        /**
         * 获取正则匹配分组
         *
         * @param input 要分组的字符串
         * @param regex 正则表达式
         * @return 正则匹配分组
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String[] getSplits(@org.jetbrains.annotations.Nullable()
        java.lang.String input, @org.jetbrains.annotations.Nullable()
        java.lang.String regex) {
            return null;
        }
        
        /**
         * 替换正则匹配的第一部分
         *
         * @param input       要替换的字符串
         * @param regex       正则表达式
         * @param replacement 代替者
         * @return 替换正则匹配的第一部分
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReplaceFirst(@org.jetbrains.annotations.Nullable()
        java.lang.String input, @org.jetbrains.annotations.Nullable()
        java.lang.String regex, @org.jetbrains.annotations.Nullable()
        java.lang.String replacement) {
            return null;
        }
        
        /**
         * 替换所有正则匹配的部分
         *
         * @param input       要替换的字符串
         * @param regex       正则表达式
         * @param replacement 代替者
         * @return 替换所有正则匹配的部分
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReplaceAll(@org.jetbrains.annotations.Nullable()
        java.lang.String input, @org.jetbrains.annotations.Nullable()
        java.lang.String regex, @org.jetbrains.annotations.Nullable()
        java.lang.String replacement) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}