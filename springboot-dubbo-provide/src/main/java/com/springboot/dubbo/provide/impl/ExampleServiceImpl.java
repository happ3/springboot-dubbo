package com.springboot.dubbo.provide.impl;

import org.springframework.context.annotation.Configuration;

import com.springboot.dubbo.provide.ExampleService;

@Configuration
public class ExampleServiceImpl implements ExampleService{

	@Override
	public void setName() {
		
		System.out.println("是否ok!11111");
	}

}
