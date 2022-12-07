package com.example.demo;

import com.dongtaidaili.bin.Student;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClassName(String.valueOf(Student.class));
        beanDefinition.setBeanClass(Student.class);
        beanDefinition.setScope("prototype");
        annotationConfigApplicationContext.registerBeanDefinition("student",beanDefinition);

        Object student = annotationConfigApplicationContext.getBean("student");

        AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(annotationConfigApplicationContext);
        annotatedBeanDefinitionReader.register(Student.class);
        System.out.println();;

    }


}
