package acme.features.administrador.threshold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.spamConfig.SpamConfig;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractUpdateService;

@Service
public class AdministratorThresholdUpdateService implements AbstractUpdateService<Administrator, SpamConfig>{

	//Internal state ---------------------------------------------------------------
	@Autowired
	AdmimistratorThresholdRepository repository;
	
	@Override
	public SpamConfig findOne(final Request<SpamConfig> request) {
		assert request != null;
		final int id = request.getModel().getInteger("id");
		return this.repository.findOneSpamConfigById(id);
	}

	
	@Override
	public boolean authorise(final Request<SpamConfig> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<SpamConfig> request, final SpamConfig entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
		
	}

	@Override
	public void unbind(final Request<SpamConfig> request, final SpamConfig entity, final Model model) {
		//NotUsed
	}

	

	@Override
	public void validate(final Request<SpamConfig> request, final SpamConfig entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
		
		
	}

	@Override
	public void update(final Request<SpamConfig> request, final SpamConfig entity) {
		assert request != null;
		assert entity != null;
		this.repository.save(entity);
		
	}

	
}
