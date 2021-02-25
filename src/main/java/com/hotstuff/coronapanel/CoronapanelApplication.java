package com.hotstuff.coronapanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronapanelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronapanelApplication.class, args);
	}

}
