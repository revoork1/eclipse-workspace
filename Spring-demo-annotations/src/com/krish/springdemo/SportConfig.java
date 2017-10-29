package com.krish.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.krish.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	

}
