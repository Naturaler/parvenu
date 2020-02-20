package com.yrx.parvenu.income.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by r.x on 2020/2/20.
 */
@Configuration
@Import(com.yrx.parvenu.core.config.MongoConfig.class)
public class MongoConfig {

}
