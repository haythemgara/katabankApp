package fr.katabankapp.entites;

import java.io.Serializable;
import java.time.LocalDate;

public class Operation implements Serializable{

    public enum TypeOperation {deposit,withdrawal ;}

    private int numOperation;
    private double amount;
    private double balance;
    private LocalDate date;
    private TypeOperation type;

    //Constructors
    public Operation() {
        numOperation++;
    }

    public Operation(int numOperation, double amount, double balance, LocalDate date, TypeOperation type) {
        this.numOperation = numOperation;
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.type = type;
    }

    //Getters & setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public int getNumOperation() {
        return numOperation;
    }

    public void setNumOperation(int numOperation) {
        this.numOperation = numOperation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numOperation='" + numOperation + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
