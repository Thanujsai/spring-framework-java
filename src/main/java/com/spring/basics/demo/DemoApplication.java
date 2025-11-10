package com.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("application start");
		SpringApplication.run(DemoApplication.class, args);
				
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();//this is where im changing the algo not in the binary search impl => more flexible => loosely coupled
		BinarySearchImpl binarySearch = new BinarySearchImpl(bubbleSortAlgorithm);
		
		int[] arr = new int[]{1,3,5,4,2};
		System.out.println(binarySearch.binarySearch(arr, 3));
	}

}
