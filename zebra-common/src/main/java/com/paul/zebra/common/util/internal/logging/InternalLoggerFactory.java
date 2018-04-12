package com.paul.zebra.common.util.internal.logging;

import java.util.Date;

/**
 * @author xiaotiantian
 * @create 2018-04-12 11:49
 */
public abstract class InternalLoggerFactory {

    private static volatile InternalLoggerFactory defaultFactory =
            newDefaultInstance(InternalLoggerFactory.class.getName());

    private static InternalLoggerFactory newDefaultInstance(String name) {
        return null;
    }

    public static InternalLoggerFactory getDefaultFactory() {
        return defaultFactory;
    }

    /**
     * 更改默认工厂
     */
    public static void setDefaultFactory(InternalLoggerFactory defaultFactory) {
        if (defaultFactory == null) {
            throw new NullPointerException("defaultFactory");
        }
        InternalLoggerFactory.defaultFactory = defaultFactory;
    }

    /**
     * 通过类的类名创建一个新的记录器实例
     */
    public static InternalLogger getInstance(Class<?> clazz) {
        return getInstance(clazz.getName());
    }

    /**
     * 通过特殊的名称创建一个新的记录器实例
     */
    public static InternalLogger getInstance(String name) {
        return getDefaultFactory().newInstance(name);
    }

    /**
     * 通过特殊的名称创建一个新的记录器实例
     */
    protected abstract InternalLogger newInstance(String name);
}
