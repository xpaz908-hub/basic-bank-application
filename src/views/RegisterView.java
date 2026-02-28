package views;

import java.util.Scanner;
import util.Util;

public class RegisterView {
    private Scanner scan = new Scanner(System.in);

    public void show() {
        Util.clearTerminal();
        System.out.println("Register for a new account.\n");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter a password: ");
        String password = scan.nextLine();
        System.out.print("Enter a minimum deposit: ");
        double deposit = scan.nextDouble();

        try {
            createAccount(name, password, deposit);
        } catch (Exception e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
    }

    private void createAccount(String name, String password, double deposit) {
        // create account and save to file
    }
}
