package com.springboot.dubbo.consume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dubbo.provide.ExampleService;

@RestController  
@RequestMapping("/user") 
public class DemoController {

	
	
	@Autowired  
    private ExampleService exampleService;
	
	
	@RequestMapping("/getUserById")  
    public Object getUserById(@RequestParam("id")Integer id) { 
		exampleService.setName();
        return null;  
    }  
}
