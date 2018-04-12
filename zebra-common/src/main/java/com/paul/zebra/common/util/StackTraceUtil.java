package com.paul.zebra.common.util;

import java.io.*;

/**
 * @author xiaotiantian
 * @create 2018-04-12 14:55
 */
public final class StackTraceUtil {

    public static String stackTrace(Throwable t) {
        if (t == null) {
            return "null";
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        t.printStackTrace(new PrintStream(out));
        try {
            return new String(out.toByteArray());
        } finally {
            try {
                out.close();
            } catch (IOException e) { }
        }
    }

    private StackTraceUtil() { }
}
