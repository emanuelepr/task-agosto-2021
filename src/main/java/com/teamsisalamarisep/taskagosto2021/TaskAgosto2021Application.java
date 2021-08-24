package com.teamsisalamarisep.taskagosto2021;

import com.teamsisalamarisep.taskagosto2021.dao.AutoRepo;
import com.teamsisalamarisep.taskagosto2021.model.Auto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TaskAgosto2021Application {

	public static void main(String[] args) {

		SpringApplication.run(TaskAgosto2021Application.class, args);
	}

	@Bean
	CommandLineRunner runner(AutoRepo repo) {
		return args -> {
			Auto auto = new	Auto(
					"BB000CD",
					"Audi",
					"A1",
					2013,
					LocalDateTime.now()
			);

			repo.insert(auto);
		};
	}
}