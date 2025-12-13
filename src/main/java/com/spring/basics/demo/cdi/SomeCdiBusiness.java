package com.spring.basics.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
  
  @Autowired //since we have a setter, spring can use setter injection as well to inject the dependency
  SomeCdiDao someCDIDao;

  public SomeCdiDao getSomeCDIDao() {
    return someCDIDao;
  }

  public void setSomeCDIDao(SomeCdiDao someCDIDao) {
    this.someCDIDao = someCDIDao;
  }
}
