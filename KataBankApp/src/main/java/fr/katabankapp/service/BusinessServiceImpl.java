package fr.katabankapp.service;

import fr.katabankapp.entites.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BusinessServiceImpl implements BusinessService {

    //to call operations (deposit, retrive, history)
    OperationService operationService= new OperationServiceImpl();

    /**
     *
     * @param account
     * @exception InputMismatchException
     */
    @Override
    public void processing(Account account) {

        try {

            Scanner sc = new Scanner(System.in);
            int operation;

            do {
                System.out.println("Please choose an operation : ");

                operation = sc.nextInt();

                switch (operation) {
                    case 1: { //deposit
                        System.out.println("Introduce the amount to save ");
                        double amount = sc.nextDouble();
                        operationService.deposit(account, amount);
                        break;
                    }
                    case 2: { //withdrawal
                        System.out.println("Introduce the amount to retrive ");
                        double amount = sc.nextDouble();
                        operationService.retrive(account, amount);
                        break;
                    }
                    case 3: { //history
                        operationService.history(account);
                        break;
                    }
                    case 0:
                        System.exit(0);
                }
            }while (operation !=0);
        }catch (InputMismatchException e) {
            //when introducing a string
            System.out.println("Error : Please introduce a numeric value !");
            this.processing(account);
        }
    }
}
