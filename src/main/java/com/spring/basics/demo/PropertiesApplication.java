package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearchImpl;
import com.spring.basics.demo.properties.SomeExternalService;
import com.spring.basics.demo.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
//load in app.properties
@PropertySource("classpath:app.properties")
public class PropertiesApplication {
  
  private static Logger LOGGER =  LoggerFactory.getLogger(XMLContextApplication.class);
  public static void main(String[] args) {
   try(AnnotationConfigApplicationContext applicationContext = 
       new AnnotationConfigApplicationContext(PropertiesApplication.class))  { //Load applicationContext.xml, create all beans defined in it, and manage them.
     
     SomeExternalService someExternalService = 
         applicationContext.getBean(SomeExternalService.class);

     System.out.println(someExternalService);

   }
  }
}
