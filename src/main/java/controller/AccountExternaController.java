/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.AccountExternalEntity;
import entity.TransactionAccountExtEntity;
import entity.TransactionLogEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import repository.AccountExternalRepository;
import repository.TransactionLogRepository;
import service.AccountService;

/**
 *
 * @author DELL
 */
@RestController
public class AccountExternaController {
    
    @Autowired
    AccountExternalRepository accountRepo;
    @Autowired
    TransactionLogRepository transactionLogRepo;
    @Autowired
    AccountService accountService;
    
    @RequestMapping(value = "/account",method = RequestMethod.GET)
    public Object accountList(){
        List<AccountExternalEntity> accountList=(List<AccountExternalEntity>) accountRepo.findAll();
        return accountList;
    }
    
    @RequestMapping(value = "/account",method = RequestMethod.POST)
    public Object updateAccount(@RequestBody TransactionAccountExtEntity transactionAccountExt){
        AccountExternalEntity newAccount=new AccountExternalEntity();
        List<AccountExternalEntity> accountList=(List<AccountExternalEntity>) accountRepo.findAll();
        for(AccountExternalEntity acc:accountList){
            if(acc.getAccountNo().equals(transactionAccountExt.getAccountNo())&&acc.getAccountName().equals(transactionAccountExt.getAccountName())
                    &&acc.getBank().equals(transactionAccountExt.getBank())&&acc.getBranch().equals(transactionAccountExt.getBranch())){
                newAccount=accountService.deposit(acc, transactionAccountExt.getAmount());
                accountRepo.save(newAccount);
                TransactionLogEntity log= new TransactionLogEntity("tranfer money External",transactionAccountExt.getAmount(),
                                          transactionAccountExt.getFromAccount(),transactionAccountExt.getFee(),transactionAccountExt.getContent(),LocalDate.now(),newAccount);
                transactionLogRepo.save(log);
            }
        }
        return newAccount;
    }

}
