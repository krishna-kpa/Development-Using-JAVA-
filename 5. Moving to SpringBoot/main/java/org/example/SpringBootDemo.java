package org.example;

/**
 * Hello world!
 *
 */

import org.example.model.Laptop;
import org.example.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo
{
    public static void main( String[] args )
    {
        ApplicationContext context  = SpringApplication.run(SpringBootDemo.class);

        LaptopService lapService = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);
        lapService.addLaptop(laptop);

        Laptop laptop2 = context.getBean(Laptop.class);
        lapService.addLaptop(laptop2);
    }
}
