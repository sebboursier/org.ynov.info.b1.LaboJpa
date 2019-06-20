/**
 * 
 */
package org.ynov.info.b1.LaboJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.ynov.info.b1.LaboJpa.model.Equipement;

/**
 * @author sebbo
 *
 */
@RepositoryRestResource
public interface EquipementRepository extends JpaRepository<Equipement, Long> {

}
