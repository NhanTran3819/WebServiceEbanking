/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.AccountExternalEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class AccountService {
    
    public AccountExternalEntity deposit(AccountExternalEntity acc,double amount){
        double balance=acc.getBalance()+amount;
        acc.setBalance(balance);
        return acc;
    }
}
