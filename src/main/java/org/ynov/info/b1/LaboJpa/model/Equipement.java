/**
 * 
 */
package org.ynov.info.b1.LaboJpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author sebbo
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Equipement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private int lvl;

	@ManyToOne
	private Avatar avatar;

}
