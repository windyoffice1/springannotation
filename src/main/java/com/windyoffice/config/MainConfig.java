package com.windyoffice.config;


import com.windyoffice.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sun.awt.SunHints;

@Configuration
@ComponentScan("com.windyoffice")
public class MainConfig {

    //给容器中注册一个Bean 类型为方法返回值类型 ，ID为方法名
    @Bean(name = "person02")
    public Person person(){
        return new Person("李四",20);
    }
}
