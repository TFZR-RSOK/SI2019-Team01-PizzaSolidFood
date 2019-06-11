package com.psf.psfrest;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@EnableEmailTools
public class PsfRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsfRestApplication.class, args);

		// Creating one thread which will check which users obtained enough points and making them premium users
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// Making runnable for PremiumUsersCheck
		Runnable runnable = new PremiumUsersCheck();

		// Executing thread
		executorService.execute(runnable);
	}
}
