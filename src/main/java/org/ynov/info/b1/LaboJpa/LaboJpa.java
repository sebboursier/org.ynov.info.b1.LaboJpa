/**
 * 
 */
package org.ynov.info.b1.LaboJpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.ynov.info.b1.LaboJpa.model.Avatar;
import org.ynov.info.b1.LaboJpa.repository.AvatarRepository;

/**
 * @author sebbo
 *
 */
@SpringBootApplication
public class LaboJpa {

	@Autowired
	private AvatarRepository avatarRepository;

	public static void main(String[] args) {
		SpringApplication.run(LaboJpa.class);
	}

	@Bean
	public CommandLineRunner start() {
		return (args) -> {
			System.out.println("########## START ##########");

			Avatar newAvatar = new Avatar();
			newAvatar.setName("Dakeyras");

			avatarRepository.save(newAvatar);

			List<Avatar> avatars = avatarRepository.findAll();

			for (Avatar avatar : avatars) {
				System.out.println(avatar);
			}

			System.out.println("########## END ##########");
		};
	}

}
