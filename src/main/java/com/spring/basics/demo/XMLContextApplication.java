package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearchImpl;
import com.spring.basics.demo.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLContextApplication {
  
  private static Logger LOGGER =  LoggerFactory.getLogger(XMLContextApplication.class);
  public static void main(String[] args) {
   try(ClassPathXmlApplicationContext applicationContext = 
       new ClassPathXmlApplicationContext("applicationContext.xml"))  { //Load applicationContext.xml, create all beans defined in it, and manage them.
     
     LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames()); //[xmlJdbcConnection, jdbcConnection, xmlPersonDAO]
     XmlPersonDAO personDao = 
         applicationContext.getBean(XmlPersonDAO.class);
     
     System.out.println(personDao);
     System.out.println(personDao.getXmlJdbcConnection());
     System.out.println(personDao.getJdbcConnection());

   }
  }
}
