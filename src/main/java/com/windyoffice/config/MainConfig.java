package com.windyoffice.config;


import com.windyoffice.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan("com.windyoffice")
public class MainConfig {

    //给容器中注册一个Bean 类型为方法返回值类型 ，ID为方法名
    @Scope
    @Bean
    public Person person(){
        System.out.println("给容器中添加person====================");
        return new Person("李四",20);
    }
}
