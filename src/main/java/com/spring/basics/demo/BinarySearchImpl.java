package com.spring.basics.demo;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;

public class BinarySearchImpl {
  //sorting an array
  //search the array
  //return the result
  
  private SortAlgorithm sortAlgorithm;//this is a dependency of BSI
  //BSI is depended on sortAlgorithm

  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {//constructor used for the user to use their own algo => loosely coupled
    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearch(int[] arr, int num){
    
//    BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//    int[] sortedArr = bubbleSortAlgorithm.sort(arr);    //in order to change the algo to say quicksort i need to come to this method and change it -> not practical -> tightly coupled
    int[] sortedArr = sortAlgorithm.sort(arr);//loosely coupled, user can choose their own algo
    System.out.println(sortAlgorithm);
    System.out.println(sortAlgorithm);
    return 3;
  }

}
