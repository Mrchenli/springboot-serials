package io.mrchenli.springboot.charpter12async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Charpter12AsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(Charpter12AsyncApplication.class, args);
	}
}
