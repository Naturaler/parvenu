package com.yrx.parvenu.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by r.x on 2020/2/20.
 */
@Configuration
@MapperScan("com.yrx.parvenu.core.dao")
public class MybatisConfig {
}
