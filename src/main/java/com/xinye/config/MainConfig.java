package com.xinye.config;

import com.xinye.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 这是一个配置类 ,告诉 Spring 这是一个 配置类
 *
 * @author daiwei04@xinye.com
 * @since 2021/1/12 20:11
 */
@Configuration
@ComponentScan(value = "com.xinye")
public class MainConfig {

    @Bean(value = "person")
    public Person getPerson() {
        return new Person("jojo", 21);
    }

}
