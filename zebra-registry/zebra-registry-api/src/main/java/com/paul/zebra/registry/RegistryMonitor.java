package com.paul.zebra.registry;

import java.util.List;

/**
 * 注册中心监视器
 * @author xiaotiantian
 * @create 2018-04-11 17:21
 */
public interface RegistryMonitor {

    /**
     * 返回发布者地址列表
     * @return
     */
    List<String> listPublisherHosts();

    /**
     * 返回订阅者地址列表
     * @return
     */
    List<String> listSubscriberAddress();

    /**
     * 查找指定服务提供者的所有地址并返回
     * @param group
     * @param serviceProviderName
     * @param version
     * @return
     */
    List<String> listAddressesByService(String group, String serviceProviderName, String version);

    /**
     * 查找指定节点（通过主机名和端口）提供所有的服务并返回
     * @param host
     * @param port
     * @return
     */
    List<String> listServicesByAddress(String host, int port);
}
