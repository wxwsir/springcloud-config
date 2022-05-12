package com.wxw.springcloud;/**
 * @author by xxz
 * @date 2022/5/9
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description

 * @author by xxz

 * @date 2022/5/9

 * @throws
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain84.class, args);
    }
}

