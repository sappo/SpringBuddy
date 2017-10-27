package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data JPA repository for the JobHistory entity.
 */
@RepositoryRestResource
public interface JobHistoryRepository extends JpaRepository<JobHistory, Long> {

}
