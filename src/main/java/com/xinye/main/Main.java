package com.xinye.main;

import com.xinye.bean.Person;
import com.xinye.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author daiwei04@xinye.com
 * @since 2021/1/12 20:09
 */
public class Main {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println(applicationContext.getBean("person"));
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Object bean = applicationContext.getBean("person");
//        System.out.println(bean);
        IOCTest();
    }

    public static void IOCTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.asList(names));
    }

}
