package com.xuhua.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: XuHua
 * @Description: 启动类
 * @Date: Created in 14:38 2019/4/30
 */

@EnableDiscoveryClient
//@SpringBootApplication(scanBasePackages = "com.xuhua.common.exception.advice")
@SpringBootApplication
@ComponentScan(basePackages={"com.xuhua.**"})//扫描接口
@MapperScan("com.xuhua.item.mapper")
public class FItem {
    public static void main(String[] args) {
        SpringApplication.run(FItem.class,args);
    }
}
