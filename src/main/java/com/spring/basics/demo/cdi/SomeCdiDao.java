package com.spring.basics.demo.cdi;

import javax.inject.Named;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiDao {
  
  public int[] getData() {
    return new int[] {12,34,56,78,90};
  }

}
