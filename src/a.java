package io.reflectoring.awshelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsHelloWorldApplication {

	public static void main(String[] args) {
		printl("hello");
		SpringApplication.run(AwsHelloWorldApplication.class, args);
	}

}
