package com.paul.zebra.registry;

/**
 * @author xiaotiantian
 * @create 2018-04-11 17:46
 */
public interface RegistryServer extends RegistryMonitor {

    /**
     * 启动注册中心服务器
     */
    void startRegistryServer();

    /**
     * 用于创建默认的注册中心实现
     */
    class Default {

        static {

        }
    }
}
