package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class SpringBootDemo
{
    public static void main( String[] args ) {
        ApplicationContext context = SpringApplication.run(SpringBootDemo.class,args);
    }
}
