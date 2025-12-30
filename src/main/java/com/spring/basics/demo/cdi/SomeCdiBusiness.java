package com.spring.basics.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {
  
  @Inject //since we have a setter, spring can use setter injection as well to inject the dependency
  SomeCdiDao someCDIDao;

  public SomeCdiDao getSomeCDIDao() {
    return someCDIDao;
  }

  public void setSomeCDIDao(SomeCdiDao someCDIDao) {
    this.someCDIDao = someCDIDao;
  }
}
