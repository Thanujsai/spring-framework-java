package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearchImpl;
import com.spring.basics.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {
		
    private static Logger LOGGER =  LoggerFactory.getLogger(ScopeApplication.class);
		//what are the beans? -> beans are objects that are managed by spring framework
		//what are the dependencies of a bean? -> @autowired components are beans
		//where to search for beans?
		public static void main(String[] args) {
      ApplicationContext applicationContext = SpringApplication.run(
          DemoApplication.class, args);

      PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
      PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
      
      LOGGER.info("{}", personDao);
      LOGGER.info("{}", personDao.getJdbcConnection());
      
      LOGGER.info("{}", personDao2);
      LOGGER.info("{}", personDao2.getJdbcConnection());
    }

}