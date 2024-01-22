package com.jk.bulk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BulkProcessDataApplication {

	public static void main(String[] args) {

		System.out.println("------------Project Started----------");
		System.exit(SpringApplication.exit(SpringApplication.run(BulkProcessDataApplication.class, args)));

	}

}
