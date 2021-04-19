package acme.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {ValidDatesPlanValidator.class})
public @interface ValidDatesPlan {
 
    String message() default "{acme.validators.validdatesplan}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
 
}
