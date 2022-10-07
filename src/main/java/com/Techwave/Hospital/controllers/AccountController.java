package com.Techwave.Hospital.controllers;

import com.Techwave.Hospital.dao.AccountDAO;
import com.Techwave.Hospital.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountDAO accountDAO;

    @PutMapping("/updateAccount/{accountID}")
    public String updateAccount(@RequestBody Account account, @PathVariable("accountID") int accountID) {
        return accountDAO.updateAccount(account, accountID);
    }

    @PutMapping("/updatePassword/{accountID}")
    public String updatePassword(@RequestBody Account account, @PathVariable("accountID") int accountID) {
        return accountDAO.updatePassword(account, accountID);
    }
}
