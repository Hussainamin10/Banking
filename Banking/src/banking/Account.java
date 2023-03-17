/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author hkbarca
 */
public class Account {

    protected static int counter;
    protected int accountNumber;
    protected double balance;
    protected Client owner;
    protected ArrayList<Transaction> transactions;
    protected String type;

    public Account(int accountNumber, double balance, Client owner, ArrayList<Transaction> transactions, String type) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.transactions = transactions;
        this.type = type;
    }

    public Account() {

    }

    public Account(String account) {
        Account.counter++;
        this.accountNumber = counter;
        this.balance = 0.0;
        this.owner = null;
        this.transactions = new ArrayList<Transaction>();
        this.type = type;
    }

    public double deposit(double depositAmount) {
        Transaction a = new Transaction("Deposit", depositAmount);
        addTransaction(a);
        return this.balance;

    }

    public double withdraw(double withdrawAmount) {
        Transaction b = new Transaction("Withdraw", withdrawAmount);
        addTransaction(b);
        return this.balance;

    }

    public void addTransaction(Transaction newTransaction) {
        transactions.add(newTransaction);
    }

    public void displayAllTransaction() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }

    }

    public static int getCounter() {
        return Account.counter;
    }

    public static void setCounter(int counter) {
        Account.counter = counter;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
