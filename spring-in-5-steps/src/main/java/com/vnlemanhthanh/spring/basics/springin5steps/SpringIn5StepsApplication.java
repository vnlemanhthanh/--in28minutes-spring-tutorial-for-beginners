package com.vnlemanhthanh.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);


		System.out.println(result); 
	}

}
