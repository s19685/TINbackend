package tin.projectasks.Constraints;

import tin.projectasks.Models.Entity.Assignment;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DatesValidator implements ConstraintValidator<ValiDATES, Assignment> {

    @Override
    public void initialize(ValiDATES constraintAnnotation) {
    }

    @Override
    public boolean isValid(Assignment assignment, ConstraintValidatorContext constraintValidatorContext) {
        return assignment.getDateFrom().isBefore(assignment.getDateTo());
    }
}
