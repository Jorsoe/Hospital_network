package com.xatu.jorsoe.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: Renke
 * @DateTime: 2021/11/25 11:33
 * @Description: TODO 医院挂号项目启动类
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.xatu")
public class ServiceHospitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHospitalApplication.class, args);
    }
}