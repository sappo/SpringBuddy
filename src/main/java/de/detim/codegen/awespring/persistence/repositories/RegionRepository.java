package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RegionRepository extends CrudRepository<Region, Long> {
}
