package com.spring.basics.demo.xml;

import com.spring.basics.demo.scope.JdbcConnection;

public class XmlPersonDAO {
  
  XmlJdbcConnection xmlJdbcConnection; //this is a dependency, XmlPersonDAO depends on XmlJdbcConnection
  //dependency injection via setter method
  
  JdbcConnection jdbcConnection;

  public XmlJdbcConnection getXmlJdbcConnection() {
    return xmlJdbcConnection;
  }

  public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
    this.xmlJdbcConnection = xmlJdbcConnection;
  }
  
  public JdbcConnection getJdbcConnection() {
    return jdbcConnection;
  }
  
  public void setJdbcConnection(JdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }
}
