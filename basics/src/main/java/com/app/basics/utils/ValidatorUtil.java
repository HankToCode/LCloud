package com.app.basics.utils;

import android.annotation.SuppressLint;

import com.blankj.utilcode.util.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证工具
 */
public class ValidatorUtil {
    /**
     * 正则表达式：验证用户名
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,20}$";

    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";

    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_MOBILE = "^(1)\\d{10}$";
    /**
     * 正则表达式：验证固定电话
     */
    public static final String REGEX_LANDLINE = "^0[0-9]{2,3}[0-9]{8}";
    /**
     * 正则表达式：验证固定电话
     */
    public static final String REGEX_LANDLINE1 = "^0(10|2[0-5789]|\\d{3})\\d{7,8}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String REGEX_CHINESE = "[^\\x00-\\xff]";

    /**
     * 正则表达式：验证身份证
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

    /**
     * 正则表达式：验证URL
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
    /**
     * 正则表达式： 匹配正浮点数
     */
    public static final String REGEX_IS_NUM_FLOAT = "^[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*$";
    /**
     * 正则表达式： 匹配正整数
     */
    public static final String REGEX_IS_NUM = "^[1-9]*[1-9][0-9]*$";
    /**
     * 正则表达式： 匹配正整数
     */
    public static final String REGEX_HAVE_NUM_EN = "^[a-zA-Z0-9]+$";

    public static final String PRICE_DIOS = "#.##";

    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验固定座机
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isLandline(String mobile) {
        return Pattern.matches(REGEX_LANDLINE, mobile);
    }

    /**
     * 校验固定座机
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isLandline1(String mobile) {
        Pattern p1 = Pattern.compile(REGEX_LANDLINE1);
        return p1.matcher(mobile).matches();
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        boolean temp = false;
        Pattern p = Pattern.compile(REGEX_CHINESE);
        Matcher m = p.matcher(chinese);
        if (m.find()) {
            temp = true;
        }
        return temp;
    }

    /**
     * 校验身份证
     *
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    /**
     * 校验匹配正浮点数
     *
     * @param str
     * @return
     */
    public static boolean isNumFloat(String str) {
        return Pattern.matches(REGEX_IS_NUM_FLOAT, str);
    }

    /**
     * 校验匹配正整数
     *
     * @param str
     * @return
     */
    public static boolean isNum(String str) {
        return Pattern.matches(REGEX_IS_NUM, str);
    }

    /**
     * 校验匹配含有正整数
     *
     * @param str
     * @return
     */
    public static boolean haveNumEN(String str) {
        return str.matches(REGEX_HAVE_NUM_EN);
    }

    /**
     * 是否是英文
     *
     * @param charaString
     * @return
     */
    public static boolean isEnglish(String charaString) {
        return charaString.matches("^[a-zA-Z]*");
    }

    /**
     * 保留小数点后两位
     *
     * @param amount
     * @return
     */
    public static String getPriceDios(BigDecimal amount) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(amount);
    }

    public static double getPriceDios(double num, String vail) {
        DecimalFormat format = new DecimalFormat(vail);
        return Double.parseDouble(format.format(num));
    }

    public static boolean isEmojiCharacter(char codePoint) {
        return !((codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) || (codePoint == 0xD) || ((codePoint >= 0x20) && codePoint <= 0xD7FF)) || ((codePoint >= 0xE000) && (codePoint <= 0xFFFD)) || ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));
    }

    /**
     * 特殊字符验证
     *
     * @param str
     * @return
     */
    public static boolean isSpecialCharacter(String str) {
        boolean temp = false;
        Pattern p = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            temp = true;
        }
        return temp;
    }

    /**
     * 保留两位小数点
     *
     * @param bigDecimal
     * @return
     */
    @SuppressLint("DefaultLocale")
    public static String getTwoDecimalPlaces(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            DecimalFormat df = new DecimalFormat("#########0.00");
            return df.format(bigDecimal);
        }
        return "";
    }

    /**
     * 保留两位小数点
     *
     * @param dd
     * @return
     */
    @SuppressLint("DefaultLocale")
    public static String getTwoDecimalPlaces(Double dd) {
        if (dd != null) {
            return getTwoDecimalPlaces(new BigDecimal(String.valueOf(dd)));
        }
        return "";
    }

    /**
     * 货币精确位数
     * out: 12,345,6789.00
     */
    @SuppressLint("DefaultLocale")
    public static String getBigDecimalMoney(Double money) {
        if (money != null) {
            return getBigDecimalMoney(new BigDecimal(money));
        }
        return "";
    }

    /**
     * 货币精确位数
     * out: 12,345,6789.00
     */
    @SuppressLint("DefaultLocale")
    public static String getBigDecimalMoney(BigDecimal money) {
        if (money != null) {
            DecimalFormat df = new DecimalFormat("###,###,##0.00");
            return df.format(money);
        }
        return "";
    }

    /**
     * 使用java正则表达式去掉多余的.与0
     *
     * @param obj
     * @return
     */
    public static String subZeroAndDot(Object obj) {
        String s = String.valueOf(obj);
        if (!StringUtils.isEmpty(s)) {
            if (s.indexOf(".") > 0) {
                s = s.replaceAll("0+?$", "");//去掉多余的0
                s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
            }
        }
        return s;
    }

    /**
     * 至少包含大小写字母及数字中的两种
     * 是否包含
     */
    public static boolean isLetterDigit(String str) {
        boolean isDigit = false;//定义一个boolean值，用来表示是否包含数字
        boolean isLetter = false;//定义一个boolean值，用来表示是否包含字母
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {   //用char包装类中的判断数字的方法判断每一个字符
                isDigit = true;
            } else if (Character.isLetter(str.charAt(i))) {  //用char包装类中的判断字母的方法判断每一个字符
                isLetter = true;
            }
        }
        String regex = "^[a-zA-Z0-9]+$";
        boolean isRight = isDigit && isLetter && str.matches(regex);
        return isRight;
    }

    /**
     * 判断字符串包含表情
     *
     * @param value
     * @return
     */
    public static boolean containsEmoji(String value) {
        boolean flag = false;
        try {
            Pattern p = Pattern
                    .compile("[^\\u0000-\\uFFFF]");
            Matcher m = p.matcher(value);
            flag = m.find();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

}