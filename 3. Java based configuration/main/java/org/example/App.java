package org.example;

/**
 * Hello world!
 *
 */
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alienObj = context.getBean("alien1",Alien.class);
        alienObj.code();
        Alien alienObj2 = context.getBean("alien1",Alien.class);
        alienObj2.code();
    }
}
