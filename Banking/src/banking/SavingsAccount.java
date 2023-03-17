/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author hkbarca
 */
public class SavingsAccount extends Account {

    public SavingsAccount() {
    }

    public static int getCounter() {
        return SavingsAccount.counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public Client getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    @Override
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

}
