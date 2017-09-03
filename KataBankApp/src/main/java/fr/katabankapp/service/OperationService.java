package fr.katabankapp.service;

import fr.katabankapp.entites.Account;

public interface OperationService {

    //To make a deposit in the account
    public boolean deposit (Account account, double amount);

    //To make a withdrawal for the account
    public boolean retrive (Account account, double amount);

    //To print operations history for the account
    public void history (Account account);
}
