/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banking;

/**
 *
 * @author hkbarca
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b = new Bank();

        int option = UserInputManager.retrieveUserOption();

        while (option != 0) {
            if (option == 0) {
                System.exit(0);
            }

            if (option == 1) {
                addNewClient(b);
            }
            if (option == 2) {
                addNewAccount(b);
            }
            if (option == 3) {
                executeTransaction(b, option);
            }
            if (option == 4) {
                Account retrieveAccountType = UserInputManager.retrieveAccountType();
            }
            if (option == 5) {
                int c = UserInputManager.retrieveClientId();
                int a = UserInputManager.retrieveAccountNumber();
                Account acc = b.getClient(c).getAccount(a);
                acc.displayAllTransaction();
            }
            if (option == 6) {
                b.displayClientList();
            }
            if (option == 7) {
                int cId = UserInputManager.retrieveClientId();
                b.displayClientAccounts(cId);
            }

        }

    }

    public Banking() {
    }

    private static void addNewClient(Bank bank) {
        Client c = UserInputManager.retrieveClientInfo();
        bank.addClient(c);
    }

    private static void addNewAccount(Bank rbc) {
        int cId = UserInputManager.retrieveClientId();
        Client c = rbc.getClient(cId);
        Account a = UserInputManager.retrieveAccountType();
        c.addAccount(a);
    }

    private static void executeTransaction(Bank Trans, int Trans1) {
        int cId = UserInputManager.retrieveClientId();
        Client c = Trans.getClient(cId);
        int accountNum = UserInputManager.retrieveAccountNumber();
        Account acc = c.getAccount(accountNum);

        double a = UserInputManager.retrieveAccountNumber();

        if (Trans1 == 3) {
            acc.deposit(a);
        } else if (Trans1 == 4) {
            acc.withdraw(a);
        }
    }

}
