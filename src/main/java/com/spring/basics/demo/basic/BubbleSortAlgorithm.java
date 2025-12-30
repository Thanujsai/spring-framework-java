package com.spring.basics.demo.basic;

import com.spring.basics.demo.basic.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//spring will be able to find this class because of the @Component annotation
@Service //since this has business logic, we can also use @service
//by declaring @component this we are asking spring to manage this class, spring creates a bean for it
@Qualifier("bubble") // to give a specific name to this bean
public class BubbleSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers){
    //login for bubble sort
    
    return numbers;
  }

}
