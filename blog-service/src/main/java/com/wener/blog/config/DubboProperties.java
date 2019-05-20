package com.wener.blog.config;



public class DubboProperties {
    public static final String DUBBO_PREFIX = "dubbo";

    /**
     * 消费者配置开关 默认关闭（暂未生效）
     */
    private boolean consumerTrigger;
    /**
     * 生产者配置开关 默认关闭（暂未生效）
     */
    private boolean providerTrigger;
    /**
     * applicationName
     */
    private String applicationName;
    /**
     * 注册中心地址
     */
    private String registryAddress;
    /**
     * 启动时是否检查注册中心
     */
    private boolean registryCheck = false;
    /**
     * 协议 默认：dubbo
     */
    private String protocol = "dubbo";
    /**
     * 端口 默认 20800
     */
    private int port = 20800;
    /**
     * HOST
     */
    private String host;
    /**
     * dubbo 线程数, 默认 200
     */
    private int threads = 200;
    /**
     * 重试次数 默认不重试
     */
    private int retries = 0;
    /**
     * consumerCheck 默认不检查
     */
    private boolean consumerCheck = false;
    /**
     * 消费者过滤器 多个用,隔开
     */
    private String consumerFilter;
    /**
     * 提供者者过滤器 多个用,隔开
     */
    private String providerFilter;
    /**
     * providerCheck 默认不检查
     */
    private boolean providerCheck = false;
    /**
     * group
     */
    private String group;
    /**
     * 超时时间
     */
    private int timeout;

    //…………省略getter/setter
}  