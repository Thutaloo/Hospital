package com.Techwave.Hospital.dao;

import com.Techwave.Hospital.pojo.Account;

import java.util.List;

public interface IAccountDAO {
    List<Account> getAllAccounts();

    Account getByAccountID(int accountID);

    String insertAccount(Account account);

    String updateAccount(Account account, int accountID);

    String updatePassword(Account account, int accountID);
}
