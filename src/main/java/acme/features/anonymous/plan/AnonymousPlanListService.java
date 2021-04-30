///*
// * AnonymousShoutListService.java
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
//package acme.features.anonymous.plan;
//
//import java.util.Collection;
//import java.util.Comparator;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import acme.entities.plans.Plan;
//import acme.framework.components.Model;
//import acme.framework.components.Request;
//import acme.framework.entities.Anonymous;
//import acme.framework.services.AbstractListService;
//
//@Service
//public class AnonymousPlanListService implements AbstractListService<Anonymous, Plan> {
//
//	// Internal state ---------------------------------------------------------
//
//	@Autowired
//	protected AnonymousPlanRepository repository;
//
//
//	// AbstractListService<Anonymous, Plan> interface --------------
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
//		assert entity != null;
//		assert model != null;
//
//		request.unbind(entity, model, "executionStart", "executionEnd","id");
//	}
//
//	@Override
//	public Collection<Plan> findMany(final Request<Plan> request) {
//		assert request != null;
//
//		Collection<Plan> result;
//
//		result = this.repository.findMany();
//		
//		result = result.stream().sorted(Comparator.comparing(Plan::totalWorkload)).collect(Collectors.toList());
//
//		return result;
//	}
//
//}
