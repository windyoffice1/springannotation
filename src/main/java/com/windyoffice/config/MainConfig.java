package com.windyoffice.config;


import com.windyoffice.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    //给容器中注册
    @Bean
    public Person person(){
        return new Person("李四",20);
    }
}
