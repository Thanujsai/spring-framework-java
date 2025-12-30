package com.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //to make a bean prototype scoped, new instance created every time requested
public class ComponentDao {
  
  @Autowired
  ComponentJdbcConnection jdbcConnection;

  public ComponentJdbcConnection getComponentJdbcConnection() {
    return jdbcConnection;
  }

  public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }
}
