package de.detim.codegen.awespring.persistence.repositories;

import de.detim.codegen.awespring.persistence.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Spring Data JPA repository for the Job entity.
 */
@RepositoryRestResource
public interface JobRepository extends JpaRepository<Job, Long> {
    @Query("select distinct job from Job job left join fetch job.tasks")
    List<Job> findAllWithEagerRelationships();

    @Query("select job from Job job left join fetch job.tasks where job.id =:id")
    Job findOneWithEagerRelationships(@Param("id") Long id);

}
