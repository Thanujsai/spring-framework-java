package com.spring.basics.demo;

import com.spring.basics.componentscan.ComponentDao;
import com.spring.basics.demo.basic.BinarySearchImpl;
import com.spring.basics.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // when we say @SpringBootApplication, by default it scans the current package and all sub-packages for components
@ComponentScan("com.spring.basics.componentscan") //to specify a different package to scan for components, component scan is like a search
public class ComponentScanApplication {
		
    private static Logger LOGGER =  LoggerFactory.getLogger(ComponentScanApplication.class);
		//what are the beans? -> beans are objects that are managed by spring framework
		//what are the dependencies of a bean? -> @autowired components are beans
		//where to search for beans?
		public static void main(String[] args) {
      ApplicationContext applicationContext = SpringApplication.run(
          DemoApplication.class, args);

      ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
      
      LOGGER.info("{}", componentDao);

    }

}