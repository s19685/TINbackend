package tin.projectasks.Constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DatesValidator.class)
public @interface ValiDATES {
    String message() default "DATE FROM HAVE TO BE BEFORE DATE TO";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}