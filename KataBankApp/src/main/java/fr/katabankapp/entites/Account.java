package fr.katabankapp.entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Account implements Serializable{


    private String accountNumber;
    private double balance;

    private LocalDate openingDate;
    private List<Operation> operations;

    //Constructors
    public Account() {
    }

    public Account(String accountNumber, LocalDate openingDate, List<Operation> operations, double balance) {
        this.accountNumber = accountNumber;
        this.openingDate = openingDate;
        this.operations = operations;
        this.balance = balance;
    }

    //Getters & setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", openingDate=" + openingDate +
                ", operations=" + operations +
                ", balance=" + balance +
                '}';
    }
}

