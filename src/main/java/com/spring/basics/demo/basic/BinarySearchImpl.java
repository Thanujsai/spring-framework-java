package com.spring.basics.demo.basic;

import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import javax.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //since it has business logic in it
// this is to tell Spring that this class is a Bean
// Beans are objects that are managed by the Spring framework
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//new bean whenever requested
public class BinarySearchImpl {
  
  private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

  // sorting an array
  // search the array
  // return the result

  // autowiring is the process where Spring identifies the dependencies,
  // finds the matching beans, and automatically populates them.
  @Autowired // to tell Spring that sortAlgorithm is a dependency
  @Qualifier("bubble") // to specify which bean to inject when multiple beans of the same type exist
  private SortAlgorithm sortAlgorithm; //if we dont have any primary dependency then we can name the variable same as the class name, with this the class will be injected(say SortAlgorithm bubbleSortAlgorithm)
  // this is a dependency of BinarySearchImpl
  // BinarySearchImpl depends on SortAlgorithm
  
  // Note: Spring automatically injects an instance of SortAlgorithm here.
  // When the application starts, Spring looks for a Bean that implements
  // the SortAlgorithm interface (e.g., BubbleSortAlgorithm or QuickSortAlgorithm)
  // and assigns it to this variable.

  // constructor or setter injection can also be used for injecting dependencies,
  // but it's more common to use field injection with @Autowired.
  // This avoids writing boilerplate code for constructors or setters.

  public int binarySearch(int[] arr, int num) {

    // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
    // int[] sortedArr = bubbleSortAlgorithm.sort(arr);
    // → This approach is tightly coupled because if we want to use a different 
    // algorithm (like QuickSort), we would need to modify this code directly.
    // → Not practical.

    // The below approach is loosely coupled, because the user (or Spring)
    // can choose which sorting algorithm Bean to inject.
    int[] sortedArr = sortAlgorithm.sort(arr);

    System.out.println(sortAlgorithm);
    System.out.println(sortAlgorithm);
    return 3;
  }
  
  @PostConstruct // method to be executed after the bean's construction and dependency injection
  public void postConstruct() {
    logger.info("Post Construct method called for " + this);
  }
  
  @PreDestroy // method to be executed before the bean is destroyed
  public void preDestroy() {
    logger.info("Pre Destroy method called for " + this);
  }

//  @PreDestroy is called automatically only for singleton beans. For prototype beans, Spring creates the bean but does not manage its destruction, so @PreDestroy is not invoked unless handled manually.`
}
