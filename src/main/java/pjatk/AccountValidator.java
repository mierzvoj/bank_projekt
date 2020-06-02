package pjatk;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.*;
import javax.validation.*;

public class AccountValidator implements ConstraintValidator<AccountNo, String> {
private String someVar;

    @Override
    public void initialize(AccountNo constraintAnnotation) {
        int someVar = constraintAnnotation.key();

    }

    @Override
    public boolean isValid(String AccountNo, ConstraintValidatorContext constraintValidatorContext) {
        String regex = "\\d+";
        return AccountNo.matches(regex) == true && AccountNo.length() <= 26;


    }

}
