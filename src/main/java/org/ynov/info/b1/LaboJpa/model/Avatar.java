/**
 * 
 */
package org.ynov.info.b1.LaboJpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Avatar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private int credits;

	@OneToMany(mappedBy = "avatar", fetch = FetchType.EAGER)
	private List<Equipement> equipement;

}
