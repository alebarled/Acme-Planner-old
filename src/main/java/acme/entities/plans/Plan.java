//package acme.entities.plans;
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.Valid;
//import javax.validation.constraints.NotNull;
//
//import acme.entities.tasks.Task;
//import acme.framework.entities.DomainEntity;
//import acme.framework.entities.Manager;
//import acme.validators.ValidDatesPlan;
//import acme.validators.ValidTasksInPlan;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//@ValidDatesPlan
//@ValidTasksInPlan
//public class Plan extends DomainEntity{
//	
//	// Serialisation identifier -----------------------------------------------
//
//	protected static final long	serialVersionUID	= 1L;
//
//	// Attributes -------------------------------------------------------------
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	@NotNull
//	protected Date executionStart;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	@NotNull
//	protected Date executionEnd;
//	
//	@NotNull
//	protected Boolean isPublic;
//	
//	// Derived attributes -----------------------------------------------------
//
//	public Float totalWorkload() {
//		Float result = 0.0f;
//
//		for(final Task task : this.tasks) {
//			result += task.getWorkload();
//		}
//
//		return result;
//	}
//	
//
//	// Relationships ----------------------------------------------------------
//	
//	@Valid
//	@ManyToMany(fetch = FetchType.EAGER)
//	protected List<Task> tasks;
//
//	@NotNull
//	@Valid
//	@ManyToOne(optional = false)
//	protected Manager manager;
//
//
//}
//	
//	
//
