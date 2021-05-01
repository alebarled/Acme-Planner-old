package acme.features.manager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.tasks.Task;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Manager;
import acme.framework.services.AbstractDeleteService;

@Service
public class ManagerTaskDeleteService implements AbstractDeleteService<Manager, Task>{

	@Autowired
	protected ManagerTaskRepository managerTaskRepository;
	
	@Override
	public boolean authorise(final Request<Task> request) {
		assert request !=null;
		return true;
	}


	@Override
	public void delete(final Request<Task> request, final Task entity) {
		assert request != null;
		assert entity != null;	
				
		this.managerTaskRepository.delete(entity);
		
	}


	@Override
	public void bind(final Request<Task> request, final Task entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}


	@Override
	public void unbind(final Request<Task> request, final Task entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
	}


	@Override
	public Task findOne(final Request<Task> request) {
		assert request != null;

		Task result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.managerTaskRepository.findOneTaskById(id);

		return result;
	}


	@Override
	public void validate(final Request<Task> request, final Task entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		
		
	}



}
