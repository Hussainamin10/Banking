/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author hkbarca
 */
public interface UserInputManager {


    public static int retrieveAccountNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        int accountNumber = sc.nextInt();
        return accountNumber;
    }

    public static Account retrieveAccountType() {
        Account account = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please chose the account type desired:\nA.Checking\nB.Savings\n\nEnter you choice:");
        String accountType = sc.nextLine();
        if (accountType.equalsIgnoreCase("A")) {
            System.out.println("Checking");
            account = new CheckingAccount();
        } else if (accountType.equalsIgnoreCase("B")) {
            System.out.println("Savings");
            account = new SavingsAccount();
        }
        return account;

    }

    public static int retrieveClientId() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your clientId number:");
        int clientIdNumber = sc.nextInt();

        return clientIdNumber;
    }

    public static Client retrieveClientInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String fName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lName = sc.nextLine();
        Client client = new Client(0, fName, lName, null);
        return client;
    }

    public static double retrieveTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the amount desired: $");
        double amount = sc.nextDouble();
        return amount;
    }

    public static int retrieveUserOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose one of the 7 options:\n"
                + "[0] Exit program \n"
                + "[1] Add a new Client  \n"
                + "[2] Create a new Account \n"
                + "[3] Make a Deposit             \n"
                + "[4] Make a Withdrawal \n"
                + "[5] List Account Transactions  \n"
                + "[6] List Clients\n"
                + "[7] List Client Accounts\n\n"
                + "Please enter you choice: ");

        int option = sc.nextInt();

        return option;
    }

}
