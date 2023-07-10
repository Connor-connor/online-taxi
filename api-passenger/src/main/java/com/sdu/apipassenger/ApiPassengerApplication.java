package com.sdu.apipassenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LHP
 * @date 2023-07-10 0:59
 * @description api-passenger启动类
 */

@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现客户端
@EnableFeignClients // 开启feign客户端
public class ApiPassengerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiPassengerApplication.class);
    }
}
