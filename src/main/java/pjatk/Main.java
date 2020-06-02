package pjatk;

import javax.validation.*;
import java.awt.print.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("John", "ab123");
        Account a1 = new Account(u1, "123456789_123456789_12345678aa", new BigDecimal("1213669989183"));
        System.out.println(u1 + "and his account No." + a1);

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Account>> validate = validator.validate(a1);
        System.out.println(validate);
    }
}
