package com.windyoffice.bean;


import com.windyoffice.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigTest {

    @Test
    public void testGetBean(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
/*        Person person=applicationContext.getBean(Person.class);
        System.out.println(person);*/
        String [] beanNames=applicationContext.getBeanNamesForType(Person.class);
        for (String beanName :beanNames){
            System.out.println(beanName);
        }
        Person person=applicationContext.getBean(Person.class);
        //spring Bean 默认是单实例
     /*   Person person1=applicationContext.getBean(Person.class);
        Person person2=applicationContext.getBean(Person.class);
        System.out.println(person1==person2);*/
    }
}
