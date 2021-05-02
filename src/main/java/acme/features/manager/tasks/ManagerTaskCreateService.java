package acme.features.manager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.roles.Manager;
import acme.entities.tasks.Task;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractCreateService;

@Service
public class ManagerTaskCreateService implements AbstractCreateService<Manager, Task> {
	
	@Autowired
	protected ManagerTaskRepository repository;
	
	

	@Override
	public boolean authorise(final Request<Task> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Task> request, final Task entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		
		request.bind(entity, errors);
		
	}

	@Override
	public void unbind(final Request<Task> request, final Task entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		
		request.unbind(entity, model, "title", "executionStart", "executionEnd", "workload", "description", "isPublic", "link");
		
	}

	@Override
	public Task instantiate(final Request<Task> request) {
		
		assert request != null;
		final Task t = new Task();
		t.setManager(this.repository.findManagerById(request.getPrincipal().getActiveRoleId()));

		return t;
	}

	@Override
	public void validate(final Request<Task> request, final Task entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		if (!errors.hasErrors("executionStart") && !errors.hasErrors("executionEnd")) {
			errors.state(request, entity.getExecutionStart().before(entity.getExecutionEnd()), "executionEnd", "acme.validators.validdates");
			
			if(!errors.hasErrors("workload")) {
				final boolean res =  entity.getPeriod() >= entity.getWorkload();
				errors.state(request, res, "workload", "acme.validators.validworkload");
			}
		}
			
		if(!errors.hasErrors("workload")) {
			final float workLoadDecimals = entity.getWorkload() - entity.getWorkload().intValue();
			final boolean res = entity.getWorkload() >= 0 && workLoadDecimals <= 0.59;
			errors.state(request, res, "workload", "acme.validators.validworkload");
		}
		}
		
		

	@Override
	public void create(final Request<Task> request, final Task entity) {
		assert request != null;
		assert entity != null;
		
		this.repository.save(entity);
		
	}

}
