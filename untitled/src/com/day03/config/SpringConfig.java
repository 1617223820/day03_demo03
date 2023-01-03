package com.day03.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类代替xml配置文件
@ComponentScan(basePackages = {"com.day03"})//扫描到配置类,该行代码作用与配置文件中：<context:component-scan base-package="com.day03"></context:component-scan>功能一样
public class SpringConfig {
}
