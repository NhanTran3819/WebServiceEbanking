/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name="accountExternal")
public class AccountExternalEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accountNo;
    private String accountName;
    private double balance;
    private String bank;
    private String branch;

    @JsonIgnore
    @OneToMany(mappedBy = "accountExternal", fetch = FetchType.EAGER)
    private List<TransactionLogEntity> listTransactionLog;
        
    public AccountExternalEntity() {
    }

    public AccountExternalEntity(String accountNo, String accountName, double balance, String bank, String branch, List<TransactionLogEntity> listTransactionLog) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
        this.bank = bank;
        this.branch = branch;
        this.listTransactionLog = listTransactionLog;
    }

    public AccountExternalEntity(String accountNo, String accountName, double balance, String bank, String branch) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
        this.bank = bank;
        this.branch = branch;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public List<TransactionLogEntity> getListTransactionLog() {
        return listTransactionLog;
    }

    public void setListTransactionLog(List<TransactionLogEntity> listTransactionLog) {
        this.listTransactionLog = listTransactionLog;
    }

    
}
