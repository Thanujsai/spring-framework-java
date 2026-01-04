package com.spring.basics.demo.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.spring.basics.demo.DemoApplication;
import com.spring.basics.demo.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
  
  @InjectMocks // create an instance of SomeCdiBusiness and inject the mocks created with @Mock into it
  SomeCdiBusiness someCdiBusiness;
  
  @Mock
  SomeCdiDao someCdiDao; //this mock will be created and injected into someCdiBusiness
  
  @Test
  public void testBinarySearch() {
    when(someCdiDao.getData()).thenReturn(new int[] {1,2,3});
    int result = someCdiBusiness.findGreatest();
    assertEquals(3, result);
  }

}
