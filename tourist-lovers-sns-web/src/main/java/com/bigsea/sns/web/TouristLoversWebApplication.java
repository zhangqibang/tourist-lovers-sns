package com.bigsea.sns.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.bigsea.sns.model.constant.ProjectConstant;

/**
 * 启动项
 * Created by zhh on 2017/08/15.
 */
@ServletComponentScan	// 为了能让spring能够扫描到自己编写的servlet和filter
@SpringBootApplication(scanBasePackages = {ProjectConstant.BASE_PACKAGE})
public class TouristLoversWebApplication extends WebMvcConfigurerAdapter{
	
	public static void main(String[] args) {
		SpringApplication.run(TouristLoversWebApplication.class, args);
	}
	
}
