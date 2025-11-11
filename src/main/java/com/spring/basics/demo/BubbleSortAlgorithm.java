package com.spring.basics.demo;

import org.springframework.stereotype.Component;

//spring will be able to find this class because of the @Component annotation
@Component//by declaring this we are asking spring to manage this class, spring creates a bean for it
public class BubbleSortAlgorithm implements SortAlgorithm{
  public int[] sort(int[] numbers){
    //login for bubble sort
    
    return numbers;
  }

}
