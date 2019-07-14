/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Admin
 */
@Entity
@Table(name="transactionLog")
public class TransactionLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private String transactionType;
    private double amount;
    private String fromAccount;
    private double fee;
    private String content;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate createDate;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="accountNo")
    private AccountExternalEntity accountExternal;

    public TransactionLogEntity() {
    }

    public TransactionLogEntity(int transactionId, String transactionType, double amount, String fromAccount, double fee, String content, LocalDate createDate, AccountExternalEntity accountExternal) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.fee = fee;
        this.content = content;
        this.createDate = createDate;
        this.accountExternal = accountExternal;
    }

    public TransactionLogEntity(String transactionType, double amount, String fromAccount, double fee, String content, LocalDate createDate, AccountExternalEntity accountExternal) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;

        this.createDate = createDate;
        this.accountExternal = accountExternal;
    }

    public TransactionLogEntity(String transactionType, double amount, String fromAccount, double fee, String content, LocalDate createDate) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.fromAccount = fromAccount;
        this.fee = fee;
        this.content = content;
        this.createDate = createDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public AccountExternalEntity getAccountExternal() {
        return accountExternal;
    }

    public void setAccountExternal(AccountExternalEntity accountExternal) {
        this.accountExternal = accountExternal;
    }

    
}
