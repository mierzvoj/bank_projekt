package pjatk;

import java.util.*;
import java.util.ArrayList;


public class Bank {
    String bankId;
    public List<Bank> accList = new ArrayList<>();

    public Bank(String bankId, List<Bank> accList) {
        this.bankId = bankId;
        this.accList = accList;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public List<Bank> getAccList() {
        return accList;
    }

    public void setAccList(List<Bank> accList) {
        this.accList = accList;
    }
}
