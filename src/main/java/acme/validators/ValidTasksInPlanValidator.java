package acme.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import acme.entities.plans.Plan;
import acme.entities.tasks.Task;

public class ValidTasksInPlanValidator implements ConstraintValidator<ValidTasksInPlan,Plan>{
	
	@Override
    public void initialize(final ValidTasksInPlan constraint) {
    }
 
    @Override
    public boolean isValid(final Plan plan, final ConstraintValidatorContext context) {
        boolean result = true;
        if(plan.getIsPublic()) {
	        for(final Task task : plan.getTasks()) {
	        	if(!task.getIsPublic()) {
	        		result = false;
	        	}
	        }
        }
        return result;
    }
	


}
