package com.example.securityMaven.appConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
@Value("${spring.datasource.username}")
    private String dataBaseUserName;
@Value("${spring.datasource.password}")
    private String dataBasePassword;

}
