package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//what are the beans? -> beans are objects that are managed by spring framework
		//what are the dependencies of a bean? -> @autowired components are beans
		//where to search for beans?
		System.out.println("application start");
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		//spring application context maintains all the beans
		int[] arr = new int[]{1,3,5,4,2};
		System.out.println(binarySearch.binarySearch(arr, 3));
	}

}