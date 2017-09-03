package fr.katabankapp.service;

import fr.katabankapp.entities.Account;

/**
 * Interface of operation service
 * @author Haythem
 */
public interface OperationService {
    /**
     * To make a deposit in the account
     * @param account
     * @param amount
     * @return Boolean
     */
    public boolean deposit (Account account, double amount);

    /**
     * To make a withdrawal for the account
     * @param account
     * @param amount
     * @return Boolean
     */
    public boolean retrive (Account account, double amount);

    /**
     * To print operations history for the account
     * @param account
     */
    public void history (Account account);
}
