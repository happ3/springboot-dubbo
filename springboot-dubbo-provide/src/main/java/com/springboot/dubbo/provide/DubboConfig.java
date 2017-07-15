package com.springboot.dubbo.provide;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration  
@PropertySource("classpath:dubbo.properties")  
@ImportResource({"classpath:*.xml" }) 
public class DubboConfig {

}
