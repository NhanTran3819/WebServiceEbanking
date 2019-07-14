/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import org.springframework.stereotype.Component;

/**
 *
 * @author Admin
 */

public class TransactionAccountExtEntity {
    private String accountNo;
    private String accountName;
    private String bank;
    private String branch;
    private double amount;
    private String fromAccount;
    private int fee;
    private String content;

    public TransactionAccountExtEntity() {
    }

    public TransactionAccountExtEntity(String accountNo, String accountName, String bank, String branch, double amount, String fromAccount, int fee, String content) {
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.bank = bank;
        this.branch = branch;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.fee = fee;
        this.content = content;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }
    
    
    @Override
    public String toString(){
        return "Account: "+accountNo+"\n"+
               "Name: "+accountName+"\n"+
               "Bank: "+bank+"\n"+
               "Branch: "+branch+"\n"+
               "Amount: "+amount+"\n"+
               "FromAccount: "+fromAccount+"\n"+
               "Fee: "+fee+"\n"+
               "Content: "+content+"\n";
    }
}
