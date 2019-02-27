package com.next.apps.service;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		DataSourceAutoConfiguration.class, 
		DataSourceTransactionManagerAutoConfiguration.class, 
		HibernateJpaAutoConfiguration.class})
@Configuration
public class TestConfig 
{

}