package org.iplocator;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IpLocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpLocatorApplication.class, args);
		
		HashMap<String, String> hashm = new HashMap<>();
	}

}
