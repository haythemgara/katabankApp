package fr.katabankapp.service;

import fr.katabankapp.entities.Account;

/**
 * Interface of operation service
 *
 * @author Haythem
 */
public interface OperationService {
    /**
     * To make a deposit in the account
     *
     * @param account the user account
     * @param amount  the amount to save
     * @return true if the deposit succeeded
     */
    public boolean deposit(Account account, double amount);

    /**
     * To make a withdrawal for the account
     *
     * @param account the user account
     * @param amount  the amount to be withdrawn
     * @return true if the withdrawal succeeded
     */
    public boolean retrive(Account account, double amount);

    /**
     * To print operations history for the account
     *
     * @param account the user account
     */
    public void history(Account account);
}
