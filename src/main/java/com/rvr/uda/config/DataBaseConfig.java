package com.rvr.uda.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {
    
    @Value("${spring.datasource.url}")
    private String dbUrl;
    
    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        config.setUsername("blllenmdqjqowf");
        config.setPassword("c41f1e3f59aaa1bd5b889f094c22c1a82b61e17d1804f2b36a7dfa4bc278e765");
        return new HikariDataSource(config);
    }
}
