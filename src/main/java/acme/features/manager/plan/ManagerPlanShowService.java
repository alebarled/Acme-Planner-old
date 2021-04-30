///*
// * AuthenticatedPlanShowService.java
// *
// * Copyright (C) 2012-2021 Rafael Corchuelo.
// *
// * In keeping with the traditional purpose of furthering education and research, it is
// * the policy of the copyright owner to permit non-commercial use and redistribution of
// * this software. It has been tested carefully, but it is not guaranteed for any particular
// * purposes. The copyright owner does not offer any warranties or representations, nor do
// * they accept any liabilities with respect to them.
// */
//
//package acme.features.manager.plan;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import acme.entities.plans.Plan;
//import acme.framework.components.Model;
//import acme.framework.components.Request;
//import acme.framework.entities.Manager;
//import acme.framework.services.AbstractShowService;
//
//@Service
//public class ManagerPlanShowService implements AbstractShowService<Manager, Plan> {
//
//	// Internal state ---------------------------------------------------------
//
//	@Autowired
//	protected ManagerPlanRepository repository;
//
//	// AbstractShowService<Manager, Plan> interface --------------
//
//
//	@Override
//	public boolean authorise(final Request<Plan> request) {
//		assert request != null;
//
//		return true;
//	}
//
//	@Override
//	public void unbind(final Request<Plan> request, final Plan entity, final Model model) {
//		assert request != null;
//
//		request.unbind(entity, model, "tasks", "executionStart", "executionEnd","isPublic","manager.userAccount.username");
//	}
//
//	@Override
//	public Plan findOne(final Request<Plan> request) {
//		assert request != null;
//
//		Plan result;
//		int id;
//
//		id = request.getModel().getInteger("id");
//		result = this.repository.findOnePlanById(id);
//
//		return result;
//	}
//
//}
