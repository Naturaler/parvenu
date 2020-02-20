package com.yrx.parvenu.core.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;

/**
 * Created by r.x on 2020/2/20.
 */
@Configuration
public class MongoConfig {
    @Value("${spring.data.mongodb.uri}")
    private String connectionUrl;

    @Bean
    public ConnectionString connectionString() {
        return new ConnectionString(connectionUrl);
    }

    @Bean
    public MongoDbFactory mongoDbFactory(@Autowired ConnectionString connectionString) {
        return new SimpleMongoClientDbFactory(connectionString);
    }

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost");
    }

    @Bean
    public MongoTemplate mongoTemplate(@Autowired MongoDbFactory mongoDbFactory) {
        return new MongoTemplate(mongoDbFactory);
    }

}
