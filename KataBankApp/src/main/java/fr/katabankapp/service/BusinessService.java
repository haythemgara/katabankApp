package fr.katabankapp.service;

import fr.katabankapp.entities.Account;

/**
 * Business Service Interface
 *
 * @author Haythem
 */
public interface BusinessService {


    /**
     * Method for processing operation
     *
     * @param account the account to manage
     */
    public void processing(Account account);
}
