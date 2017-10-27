package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data JPA repository for the Location entity.
 */
@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Location, Long> {

}
