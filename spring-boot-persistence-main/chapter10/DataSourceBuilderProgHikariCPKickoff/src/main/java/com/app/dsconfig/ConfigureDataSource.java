
package com.app.dsconfig;

import com.zaxxer.hikari.HikariDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigureDataSource {
    @Bean
    public HikariDataSource dataSource() {
        HikariDataSource hds = new HikariDataSource();

        hds.setJdbcUrl("jdbc:mysql://localhost:3306/numbersdb?createDatabaseIfNotExist=true");
        hds.setUsername("numbers");
        hds.setPassword("numbers");
        hds.setConnectionTimeout(50_000);
        hds.setIdleTimeout(300_000);
        hds.setMaxLifetime(900_000);
        hds.setMaximumPoolSize(8);
        hds.setMinimumIdle(8);
        hds.setPoolName("MyPool");
        hds.setConnectionTestQuery("select 1 from dual");
        hds.setAutoCommit(false);

        return hds;
    }
}