package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearchImpl;
import com.spring.basics.demo.xml.XmlPersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLContextApplication {
  public static void main(String[] args) {
   try(ClassPathXmlApplicationContext applicationContext = 
       new ClassPathXmlApplicationContext("applicationContext.xml"))  { //Load applicationContext.xml, create all beans defined in it, and manage them.
     XmlPersonDAO personDao = 
         applicationContext.getBean(XmlPersonDAO.class);
     
      System.out.println(personDao);
      System.out.println(personDao.getXmlJdbcConnection());
     System.out.println(personDao.getJdbcConnection());

   }
  }
}
