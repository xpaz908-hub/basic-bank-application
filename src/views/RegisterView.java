package views;

import java.util.Scanner;

import users.Customer;
import util.*;

public class RegisterView {
    private Scanner scan;

    public RegisterView(Scanner scan) {
        this.scan = scan;
    }
    public void show() {
        while (true) { 
            Console.clearTerminal();
            System.out.println("Register for a new account.\n");
            System.out.print("Enter your name: ");
            String name = scan.next();
            System.out.print("Enter a password: ");
            String password = scan.next();

            try {
                createAccount(name, password);
                break;
            } catch (Exception e) {
                System.out.println("Error creating account: " + e.getMessage());
            }
        }   
    }
    private void createAccount(String name, String password) {
        FileIO.createFile(Customer.customerDatabase);
        int newId = IdGenerator.generateRandomID();
        Customer newCustomer = new Customer(name, null, password, newId, null);
        FileIO.writeFile(Customer.customerDatabase, FileIO.getCustomerData(newCustomer));
        System.out.println("Account created successfully!\nPress Enter to return to the main menu.");
        returnToMainMenu();
    }
    private void returnToMainMenu() {
        scan.nextLine(); // Consume the newline left by nextDouble()
        while (true) { 
            if (scan.nextLine().isEmpty()) {
                new WelcomeView(scan).show();
                break;
            } else
                System.out.println("Invalid input, press ENTER.");
        }
    }
}