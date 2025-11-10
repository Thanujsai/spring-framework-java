package com.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//what are the beans? -> beans are objects that are managed by spring framework
		//what are the dependencies of a bean? -> @autowired components are beans
		//where to search for beans?
		System.out.println("application start");
		SpringApplication.run(DemoApplication.class, args);
				
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());//this is where im changing the algo not in the binary search impl => more flexible => loosely coupled
		
		int[] arr = new int[]{1,3,5,4,2};
		System.out.println(binarySearch.binarySearch(arr, 3));
	}

}
