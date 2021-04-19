package acme.features.authenticated.tasks;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.tasks.Task;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedTaskRepository extends AbstractRepository{

	@Query("select t from Task t where t.executionEnd<:fecha")
	Collection<Task> findMany(Date fecha);
}
