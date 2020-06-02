package pjatk;

import pjatk.Account;
import pjatk.Bank;
import pjatk.User;
import java.util.Optional;

import java.math.*;
import java.util.*;

public class BankService {

    Bank bank;



    public BankService(Bank bank) {

        this.bank = bank;


    }

    public Optional<Account> getAccountForUser(User user) {
        return bank.accList.stream().filter(acc -> acc.getUser().equals(user)).findFirst();
    }

    public BigDecimal accountBalance(User user) {

        return getAccountForUser(user).get().getAccBalance();
    }

}