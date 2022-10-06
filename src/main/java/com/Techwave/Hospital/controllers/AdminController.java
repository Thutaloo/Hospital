package com.Techwave.Hospital.controllers;

import com.Techwave.Hospital.dao.AccountDAO;
import com.Techwave.Hospital.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AccountDAO accountDAO;

    @GetMapping("/getAllAccounts")
    public List<Account> getAllAccounts() {
        List<Account> list = accountDAO.getAllAccounts();
        return list;
    }

    @GetMapping("/getByID/{accountID}")
    public Account getAccountByID(@PathVariable("accountID") int accountID) {
        return accountDAO.getByAccountID(accountID);
    }

    @PostMapping("/addAccount")
    public String addAccount(@RequestBody Account account) {
        return accountDAO.insertAccount(account);
    }

    @PutMapping("/updateAccount/{accountID}")
    public String updateAccount(@RequestBody Account account, @PathVariable("accountID") int accountID) {
        return accountDAO.updateAccount(account, accountID);
    }

    @PutMapping("/updatePassword/{accountID}")
    public String updatePassword(@RequestBody Account account, @PathVariable("accountID") int accountID) {
        return accountDAO.updatePassword(account, accountID);
    }
}
