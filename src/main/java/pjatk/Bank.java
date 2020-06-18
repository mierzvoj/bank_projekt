package pjatk;

import java.math.*;
import java.util.*;
import java.util.ArrayList;


public class Bank {
    String bankId;
    User user;
    Account account;
    public List<Account> accList = new ArrayList<>();

    public Bank(String bankId, List<Account> accList) {
        this.bankId = bankId;
        this.accList = accList;
        this.user = user;
        this.account = account;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public List<Account> getAccList() {
        return accList;
    }

    public void setAccList(List<Account> accList) {
        this.accList = accList;
    }

    public void addAcc(User user, String accountNumber, BigDecimal accBalance){
        Account myAcc = new Account(user, accountNumber, accBalance );
        accList.add(myAcc);

    }
}
