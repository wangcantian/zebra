package com.paul.zebra.common.util;

import com.paul.zebra.common.util.internal.logging.InternalLogger;
import com.paul.zebra.common.util.internal.logging.InternalLoggerFactory;

import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * @author xiaotiantian
 * @create 2018-04-11 17:53
 */
public class SystemPropertyUtil {

    private static final InternalLogger LOGGER = InternalLoggerFactory.getInstance(SystemPropertyUtil.class);

    public static String get(String key, String defVal) {
        if (key == null) {
            throw new NullPointerException("key");
        }
        if (key.isEmpty()) {
            throw new IllegalArgumentException("key must not be empty");
        }

        String value = null;
        try {
            if (System.getSecurityManager() != null) {
                value = System.getProperty(key);
            } else {
                value = AccessController.doPrivileged((PrivilegedAction<String>) () -> System.getProperty(key));
            }
        } catch(Exception e) {
            if (LOGGER.isWarnEnabled()) {
                LOGGER.warn("Unable to retrieve a system property '{}'; default values will be used, {}.", key, StackTraceUtil.stackTrace(e));
            }
        }

        if (value == null) {
            return defVal;
        }

        return value;
    }
}
