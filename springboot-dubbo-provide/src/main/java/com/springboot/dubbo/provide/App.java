package com.springboot.dubbo.provide;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "生产者" );
        SpringApplication.run(App.class, args);  
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
