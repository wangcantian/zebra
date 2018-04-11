package com.paul.zebra.common.util;

/**
 * @author xiaotiantian
 * @create 2018-04-11 17:53
 */
public class SystemPropertyUtil {

    public static String get(String key, String defVal) {
        if (key == null) {
            throw new NullPointerException("key");
        }
        if (key.isEmpty()) {
            throw new IllegalArgumentException("key must not be empty");
        }
        
    }
}
