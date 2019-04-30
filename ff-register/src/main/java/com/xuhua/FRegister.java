package com.xuhua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: XuHua
 * @Description: 注册中心启动类
 * @Date: Created in 14:20 2019/4/30
 */

@SpringBootApplication
@EnableEurekaServer
public class FRegister {
    public static void main(String[] args) {
        SpringApplication.run(FRegister.class,args);
    }
}
