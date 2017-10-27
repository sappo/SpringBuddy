package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * Spring Data JPA repository for the Employee entity.
 */
@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
