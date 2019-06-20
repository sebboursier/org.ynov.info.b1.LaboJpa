/**
 * 
 */
package org.ynov.info.b1.LaboJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ynov.info.b1.LaboJpa.repository.AvatarRepository;

/**
 * @author sebbo
 *
 */
@RestController
@RequestMapping("board")
public class ExpeditionBoardController {

	@Autowired
	private AvatarRepository avatarRepository;

	@GetMapping("/shedule/{id}")
	public Boolean sheduleExpedition(@PathVariable int id, @RequestParam("avatar") int[] avatarIds) {
		System.out.println("##### sheduleExpedition - Start #####");

		System.out.println("ID de la mission : " + id);
		System.out.print("Avatars : ");
		for (int avatarId : avatarIds) {
			System.out.print(avatarId + ", ");
		}
		System.out.println("");

		System.out.println("##### sheduleExpedition - End #####");
		return false;
	}

}
