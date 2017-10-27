package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data JPA repository for the Department entity.
 */
@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
