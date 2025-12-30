package com.spring.basics.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //to make a bean prototype scoped, new instance created every time requested
public class PersonDAO {
  
  @Autowired
  JdbcConnection jdbcConnection;
  
// Spring creates all Spring-managed beans according to their scope
// (singleton beans at startup, prototype beans when requested).
// When it sees @Autowired, it looks for a matching bean by type
// and injects that bean into this field, which is how the value gets populated.

  public JdbcConnection getJdbcConnection() {
    return jdbcConnection;
  }

  public void setJdbcConnection(JdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }
}
