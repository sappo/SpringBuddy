package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data JPA repository for the Country entity.
 */
@RepositoryRestResource
public interface CountryRepository extends JpaRepository<Country, Long> {

}
