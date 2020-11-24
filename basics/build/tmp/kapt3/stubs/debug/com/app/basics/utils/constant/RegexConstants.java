package com.app.basics.utils.constant;

import java.lang.System;

/**
 * Created by HankGreen on 2017/5/14.
 * 正则相关常量
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/app/basics/utils/constant/RegexConstants;", "", "()V", "REGEX_BLANK_LINE", "", "REGEX_DATE", "REGEX_DOUBLE_BYTE_CHAR", "REGEX_EMAIL", "REGEX_ID_CARD15", "REGEX_ID_CARD18", "REGEX_INTEGER", "REGEX_IP", "REGEX_MOBILE_EXACT", "REGEX_MOBILE_SIMPLE", "REGEX_NEGATIVE_FLOAT", "REGEX_NEGATIVE_INTEGER", "REGEX_NOT_NEGATIVE_INTEGER", "REGEX_NOT_POSITIVE_INTEGER", "REGEX_POSITIVE_FLOAT", "REGEX_POSITIVE_INTEGER", "REGEX_TEL", "REGEX_TENCENT_NUM", "REGEX_URL", "REGEX_USERNAME", "REGEX_ZH", "REGEX_ZIP_CODE", "basics_debug"})
public final class RegexConstants {
    
    /**
     * 正则：手机号（简单）
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";
    
    /**
     * 正则：手机号（精确）
     *
     * 移动：134(0-8)、135、136、137、138、139、147、150、151、152、157、158、159、178、182、183、184、187、188
     *
     * 联通：130、131、132、145、155、156、175、176、185、186
     *
     * 电信：133、153、173、177、180、181、189
     *
     * 全球星：1349
     *
     * 虚拟运营商：170
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_MOBILE_EXACT = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|(147))\\d{8}$";
    
    /**
     * 正则：电话号码
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_TEL = "^0\\d{2,3}[- ]?\\d{7,8}";
    
    /**
     * 正则：身份证号码15位
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_ID_CARD15 = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$";
    
    /**
     * 正则：身份证号码18位
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_ID_CARD18 = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9Xx])$";
    
    /**
     * 正则：邮箱
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
    
    /**
     * 正则：URL
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_URL = "[a-zA-z]+://[^\\s]*";
    
    /**
     * 正则：汉字
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_ZH = "^[\\u4e00-\\u9fa5]+$";
    
    /**
     * 正则：用户名，取值范围为a-z,A-Z,0-9,"_",汉字，不能以"_"结尾,用户名必须是6-20位
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_USERNAME = "^[\\w\\u4e00-\\u9fa5]{6,20}(?<!_)$";
    
    /**
     * 正则：yyyy-MM-dd格式的日期校验，已考虑平闰年
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_DATE = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";
    
    /**
     * 正则：IP地址
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_IP = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
    
    /**
     * 正则：双字节字符(包括汉字在内)
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_DOUBLE_BYTE_CHAR = "[^\\x00-\\xff]";
    
    /**
     * 正则：空白行
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_BLANK_LINE = "\\n\\s*\\r";
    
    /**
     * 正则：QQ号
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_TENCENT_NUM = "[1-9][0-9]{4,}";
    
    /**
     * 正则：中国邮政编码
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_ZIP_CODE = "[1-9]\\d{5}(?!\\d)";
    
    /**
     * 正则：正整数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$";
    
    /**
     * 正则：负整数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_NEGATIVE_INTEGER = "^-[1-9]\\d*$";
    
    /**
     * 正则：整数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_INTEGER = "^-?[1-9]\\d*$";
    
    /**
     * 正则：非负整数(正整数 + 0)
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_NOT_NEGATIVE_INTEGER = "^[1-9]\\d*|0$";
    
    /**
     * 正则：非正整数（负整数 + 0）
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_NOT_POSITIVE_INTEGER = "^-[1-9]\\d*|0$";
    
    /**
     * 正则：正浮点数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_POSITIVE_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
    
    /**
     * 正则：负浮点数
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGEX_NEGATIVE_FLOAT = "^-[1-9]\\d*\\.\\d*|-0\\.\\d*[1-9]\\d*$";
    public static final com.app.basics.utils.constant.RegexConstants INSTANCE = null;
    
    private RegexConstants() {
        super();
    }
}