package com.jinu.validation;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class GmailValidator implements ConstraintValidator<Gmail, String> {
	Pattern gmailPattern = Pattern.compile("^[\\w.+\\-]+@gmail\\.com$");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		return gmailPattern.matcher(value).matches();
	}

}
