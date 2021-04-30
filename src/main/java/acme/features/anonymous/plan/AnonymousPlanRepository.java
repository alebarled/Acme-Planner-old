///*
// * AnonymousShoutRepository.java
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
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import acme.entities.plans.Plan;
//import acme.framework.repositories.AbstractRepository;
//
//@Repository
//public interface AnonymousPlanRepository extends AbstractRepository {
//	
//	@Query("select p from Plan p join fetch p.tasks WHERE p.id = ?1 AND p.isPublic = true AND p.executionEnd > CURRENT_TIMESTAMP")
//	Plan findOnePlanById(int id);
//
//	@Query("select p from Plan p WHERE p.isPublic = true AND p.executionEnd > CURRENT_TIMESTAMP")
//	Collection<Plan> findMany();
//
//}
