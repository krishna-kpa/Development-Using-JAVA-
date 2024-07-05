package org.example.config;
import org.example.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AppConfig {
    @Bean(name="alien1")
    @Scope("prototype")
    public Alien alien(@Qualifier("desktop") Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setcom(com);
        return obj;
    }


    @Bean
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}
