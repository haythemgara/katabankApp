package fr.katabankapp.service;

import fr.katabankapp.entities.Account;

/**
 * Interface of Business Service
 * @author Haythem
 */
public interface BusinessService {


    /**
     * Method for processing operation
     * @param account
     */
    public void processing(Account account);
}
