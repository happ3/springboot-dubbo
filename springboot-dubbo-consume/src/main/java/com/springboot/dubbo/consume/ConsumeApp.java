package com.springboot.dubbo.consume;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ConsumeApp 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "消费者" );
        SpringApplication.run(ConsumeApp.class, args);  
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
