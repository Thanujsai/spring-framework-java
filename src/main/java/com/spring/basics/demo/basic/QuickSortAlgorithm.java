package com.spring.basics.demo.basic;

import com.spring.basics.demo.basic.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//earlier only bubble sort had this @Component, now both have it, so now we have 2 beans of same type, to avoid this we can use @Primary on one of them
@Component
//@Primary
@Qualifier("quick") // to give a specific name to this bean
public class QuickSortAlgorithm implements SortAlgorithm {

  public int[] sort(int[] numbers){
    //login for bubble sort
    
    return numbers;
  }
}

// When multiple beans of the same type exist, Spring faces ambiguity during dependency injection.
// Example error:
// Parameter 0 of constructor in com.spring.basics.demo.BinarySearchImpl required a single bean, but 2 were found:
//   - bubbleSortAlgorithm: defined in BubbleSortAlgorithm.class
//   - quickSortAlgorithm: defined in QuickSortAlgorithm.class
//
// To resolve this, we can annotate one of the classes with @Primary to mark it as the default bean.
