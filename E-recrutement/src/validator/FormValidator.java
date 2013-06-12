package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import dao.Candidat;

public class FormValidator implements Validator {

	@Override
	public boolean supports(Class arg0) {
		return Candidat.class.equals(arg0);
	}

	@Override
	public void validate(Object obj, Errors e) {
		
		Candidat candidat = (Candidat) obj;
		if (!candidat.getPassword().equals(candidat.getConfirmPassword())) {
			e.rejectValue("confirmPassword", "confirmPassword.notequal");
		}
	
	
	if (!candidat.getEmail().equals(candidat.getConfirmEmail())) {
		e.rejectValue("confirmEmail", "confirmEmail.notequal");
	}
}
}
