package com.lenfu.utils;

import java.util.UUID;

/**
 * Created By Len Fu on  2018/1/9
 */
public class StringUtils {

    public static String UUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static boolean isEmpty(String str){
        return org.springframework.util.StringUtils.isEmpty(str);
    }
}
