package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Account;
import com.Techwave.Hospital.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountDAO implements IAccountDAO {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        List<Account> list = accountRepository.findAll();
        return list;
    }

    @Override
    public Account getByAccountID(int accountID) {
        Account account = accountRepository.findById(accountID).get();
        return account;
    }

    @Override
    public String insertAccount(Account account) {
        accountRepository.save(account);
        return "Account created";
    }

    @Override
    public String updateAccount(Account account, int accountID) {
        Account oldAccount = accountRepository.findById(accountID).get();

        if (oldAccount == null)
            return "No account found";
        else {
            oldAccount.setFirstName(account.getFirstName());
            oldAccount.setLastName(account.getLastName());
            oldAccount.setDateOfBirth(account.getDateOfBirth());
            oldAccount.setDateOfCreation(account.getDateOfCreation());
            oldAccount.setEmail(account.getEmail());
            oldAccount.setPhone(account.getPhone());
            oldAccount.setGender(account.getGender());
            oldAccount.setAddress(account.getAddress());
            accountRepository.save(oldAccount);
            return "Changes saved";
        }
    }

    @Override
    public String updatePassword(Account account, int accountID) {
        Account oldAccount = accountRepository.findById(accountID).get();

        if (oldAccount == null)
            return "No account found";
        else {
            oldAccount.setPassword(account.getPassword());
            accountRepository.save(oldAccount);
            return "Changes saved";
        }
    }
}
