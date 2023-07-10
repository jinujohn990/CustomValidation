package com.jinu.validation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class DesignationValidator implements ConstraintValidator<DesignationValidation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.equalsIgnoreCase("Assistannt System Engineer") || value.equalsIgnoreCase("System Engineer")
				|| value.equalsIgnoreCase("Architect");
	}

}
