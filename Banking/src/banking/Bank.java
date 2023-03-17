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
public class Bank {

    private String bankNumber;
    private String address;
    private ArrayList<Client> clientList;

    public Bank(String bankNumber, String address, ArrayList<Client> clientList) {
        this.bankNumber = bankNumber;
        this.address = address;
        this.clientList = clientList;
    }

    public Bank() {
    }

    public void addClient(Client newClient) {
        this.clientList.add(newClient);

    }

    public void displayClientAccounts(int ClientAccounts) {
        Client c = getClient(ClientAccounts);
        c.displayAccounts();
    }

    public void displayClientList() {
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i));
        }
    }

    public Client getClient(int clientId) {
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getClientId() == clientId) {
                return clientList.get(i);
            }
        }
        return null;
    }

    public Account getClientAccount(int account, int account1) {
        Client c = getClient(account);
        Account a = c.getAccount(account1);
        return a;
    }

    public void displayAllAccounts() {
        for (int i = 0; i < clientList.size(); i++) {
            clientList.get(i).displayAccounts();
        }
    }

    public void displayAllTransaction() {
        for (int i = 0; i < clientList.size(); i++) {
            Client c = clientList.get(i);
            for (int j = 0; j < c.getAccountList().size(); j++) {
                Account a = c.getAccountList().get(j);
                a.displayAllTransaction();
            }
        }
    }

    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Client> getClientList() {
        return this.clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

}
