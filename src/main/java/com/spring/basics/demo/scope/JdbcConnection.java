package com.spring.basics.demo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)//in all places where jdbc connection is used it uses the proxy => whereever jdbc connection is used it creates an new instance of it
public class JdbcConnection {
  public JdbcConnection(){
    System.out.println("JDBC Connection");
  }
}
