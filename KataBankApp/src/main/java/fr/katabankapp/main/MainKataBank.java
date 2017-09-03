package fr.katabankapp.main;

import fr.katabankapp.entites.Account;
import fr.katabankapp.entites.Operation;
import fr.katabankapp.entites.User;
import fr.katabankapp.service.BusinessService;
import fr.katabankapp.service.BusinessServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainKataBank {

    public static void main(String[] args) {

        // instanciate the service
        BusinessService businessService= new BusinessServiceImpl();

        // Create a user
        User user= new User();
        user.setFirstName("GARA");
        user.setLastName("HAYTHEM");
        user.setLogin("SG_GARA");
        user.setPwd("SG_PW$2017");

        // Create an account.
        Account account= new Account();
        account.setAccountNumber("001");
        account.setBalance(0);
        account.setOpeningDate(LocalDate.of(2011,3,25));
        account.setOperations(new ArrayList<Operation>());

        //adding account to user
        user.setAccount(account);

        // main
        System.out.println("* * * * KATA BANK * * * * ");
        System.out.println("* * * * WELCOME  " +user.getLastName()+" "+user.getFirstName() + "  * * * *");
        System.out.println("1 : To make a deposit in your account. ");
        System.out.println("2 : To make a withdrawal from your account. ");
        System.out.println("3 : To see the history of your operations. ");
        System.out.println("0 : To exit. ");

        // doing operations
        businessService.processing(account);
    }

}
