package fr.katabankapp.service;

import fr.katabankapp.entities.Account;
import fr.katabankapp.entities.Operation;

import java.time.LocalDate;
import java.util.List;

/**
 * Impl Service of operation
 * @author Haythem
 */
public class OperationServiceImpl implements OperationService {


    @Override
    public boolean deposit(Account account, double amount) {

        if (amount <= 0) {
            System.out.println("Please introduce a positive amount !");
            return false;

        } else if (amount > 999999999) {
            System.out.println("The amount is too large, please call your advisor ! ");
            return false;
        } else {
            Operation operation = new Operation();
            account.setBalance(account.getBalance() + amount);

            // Auto-increment NumOperation
            operation.setNumOperation(account.getOperations().size() + 1);
            operation.setAmount(amount);
            operation.setBalance(account.getBalance());
            operation.setDate(LocalDate.now());
            operation.setType(Operation.TypeOperation.deposit);

            //save operation in account history
            account.getOperations().add(operation);

            System.out.println(amount+" €  has been deposited successfully !");
            return true;
        }

    }

    @Override
    public boolean retrive(Account account, double amount) {

        if (amount > account.getBalance()) {
            System.out.println("Please introduce an amount lower than your balance : <" + account.getBalance());
            return false;
        } else if (amount < 0) {
            System.out.println("Please introduce a positive amount ! ");
            return false;
        } else {
            Operation operation = new Operation();
            account.setBalance(account.getBalance() - amount);

            // Auto-increment NumOperation
            operation.setNumOperation(account.getOperations().size() + 1);
            operation.setAmount(amount);
            operation.setBalance(account.getBalance());
            operation.setDate(LocalDate.now());
            operation.setType(Operation.TypeOperation.withdrawal);

            //save operation in account history
            account.getOperations().add(operation);

            System.out.println(amount+" € was successfully withdrawn ! ");

            return true;
        }
    }


    @Override
    public void history(Account account) {
        List<Operation> allOperations = account.getOperations();
        System.out.println("* * * * * * * * H I S T O R Y * * * * * * * *");
        System.out.println("Num | Operation type | Date      | Amount  | Balance   ");
        allOperations.stream().forEach(operation -> {
            System.out.println(operation.getNumOperation() + "   | " + operation.getType() + "        | "
                    + operation.getDate() + "| " + operation.getAmount() + "    | " + operation.getBalance());
        });
    }
}
