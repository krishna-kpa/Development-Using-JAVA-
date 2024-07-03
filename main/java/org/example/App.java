package org.example;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");

        //One object is created for the singleton scope.
        Alien obj1 = (Alien) context.getBean("alien");
        obj1.setAge(12);
        obj1.getAge();

        Alien obj2 = (Alien) context.getBean("alien");
        obj2.getAge();


        // Two(can be more) objects created for prototype scope.
        Laptop obj3 = (Laptop) context.getBean("lap");
        obj3.setPrice(12);
        obj3.getPrice();

        Laptop obj4 = (Laptop) context.getBean("lap");
        obj4.getPrice();
    }
}
