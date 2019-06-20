/**
 * 
 */
package org.ynov.info.b1.LaboJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author sebbo
 *
 */
@SpringBootApplication
public class LaboJpa {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(LaboJpa.class);
		springApplication.run(args);
	}

	@Bean
	public CommandLineRunner start() {
		return (args) -> {
			System.out.println("########## START ##########");

			System.out.println("########## END ##########");
		};
	}

}
