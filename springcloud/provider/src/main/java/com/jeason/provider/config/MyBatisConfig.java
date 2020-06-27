package com.jeason.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jeason
 * @Description: MyBatis配置类
 * @Date: 2020/6/27 16:40
 */
@Configuration
@MapperScan(basePackages = "com.jeason.provider.mbg.mapper")
public class MyBatisConfig {
}
