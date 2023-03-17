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
public class Client {

    private static int counter;
    private int clientId;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accountList;

    public Client(int clientId, String firstName, String lastName, ArrayList<Account> accountList) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountList = accountList;
    }

    public Client() {
        counter++;
        this.clientId = counter;
        this.firstName = "";
        this.lastName = "";
        this.accountList = new ArrayList<Account>();
    }

    public Client(String fname, String lname) {
        counter++;
        this.clientId = counter;
        this.firstName = fname;
        this.lastName = lname;
        this.accountList = new ArrayList<Account>();
    }

    public void addAccount(Account newAccount) {
        this.accountList.add(newAccount);
    }

    public Account getAccount(int account) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber() == account) {
                return accountList.get(i);
            }
        }
        return null;
    }

    public void displayAccounts() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i));
        }
    }

    public static int getCounter() {
        return Client.counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

}
