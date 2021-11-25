package com.xatu.jorsoe.hospital.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Renke
 * @DateTime: 2021/11/25 14:22
 * @Description: TODO
 */

@Configuration
@MapperScan("com.xatu.jorsoe.hospital.mapper")
public class HospConfig {
}