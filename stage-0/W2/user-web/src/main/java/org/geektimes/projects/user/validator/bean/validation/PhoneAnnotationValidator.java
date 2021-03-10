package org.geektimes.projects.user.validator.bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author Geoffrey
 */
public class PhoneAnnotationValidator implements ConstraintValidator<Phone, String> {

    private static final Pattern PHONE = Pattern.compile("^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$");

    @Override
    public void initialize(Phone phone) {
        
    }

    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {
    	if (phone == null || phone.length() != 11) {
    	        return false;
    	}
        return PHONE.matcher(phone).matches();
    }
}
