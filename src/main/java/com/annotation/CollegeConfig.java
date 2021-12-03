package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.annotation")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig 
{
	@Bean
	public College collegeBean()
	{
		College college = new College();
		return college;
	}
}
