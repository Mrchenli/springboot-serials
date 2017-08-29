package io.mrchenli.springboot.charpter11schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Charpter11ScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Charpter11ScheduleApplication.class, args);
	}
}
