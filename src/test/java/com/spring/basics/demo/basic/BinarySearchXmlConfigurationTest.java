package com.spring.basics.demo.basic;


import static org.junit.Assert.assertEquals;

import com.spring.basics.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml") //using xml application context
public class BinarySearchXmlConfigurationTest {
  
  @Autowired
  BinarySearchImpl binarySearch;
  
  @Test
  public void testBinarySearch() {
    int[] arr = new int[]{1,2,3,4,5};
    int result = binarySearch.binarySearch(arr, 4);
    assertEquals(3, result);
  }

}
