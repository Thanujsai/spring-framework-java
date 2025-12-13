package com.spring.basics.demo;

import com.spring.basics.demo.cdi.SomeCdiBusiness;
import com.spring.basics.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CDIApplication {
  public static Logger LOGGER =  LoggerFactory.getLogger(CDIApplication.class);
  
  public static void main(String[] args){
    ApplicationContext applicationContext = SpringApplication.run(
        CDIApplication.class, args);

    SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
    
    LOGGER.info("{} dao-{}", business, business.getSomeCDIDao());
  }
}
