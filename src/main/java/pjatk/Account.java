package pjatk;

import java.lang.annotation.*;
import java.math.*;

public class Account implements Annotation {
    public User user;
    public BigDecimal accBalance;
    @AccountNo(key = "-1")
    public String accountNumber;


    public Account(User user, String accountNumber, BigDecimal accBalance) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.accBalance = accBalance;
    }

    public BigDecimal getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(BigDecimal accBalance) {
        this.accBalance = accBalance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accBalance=" + accBalance +
                '}';
    }
}
