package fr.katabankapp.entities;

import java.io.Serializable;

/**
 * User entity
 * @author Haythem
 */
public class User implements Serializable{

    private String firstName;
    private String lastName;
    private String login;
    private String pwd;

    private Account account;

    //Constructors
    public User() {
    }

    public User(String firstName, String lastName, String login, String pwd, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.pwd = pwd;
        this.account = account;
    }

    //Getters & setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return "User : " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", account = " + account ;
    }
}
