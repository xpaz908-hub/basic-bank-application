package views;
import java.util.Scanner;
import util.*;

public class RegisterView extends View {

    public RegisterView(Scanner scan) {
        super(scan);
    }
    @Override
    public void show() {
        while (true) { 
            Console.clearTerminal();
            System.out.println("Register for a new account.\n");
            System.out.print("Enter your name: ");
            String name = scan.next();
            System.out.print("Enter a password: ");
            String password = scan.next();

            try {
                AuthService.createAccount(name, password);
            } catch (Exception e) {
                System.out.println("Error creating account: " + e.getMessage());
            }
            System.out.println("Account created successfully!\n\nPress Enter to log in.");
            super.returnToWelcomeView();
        }   
    }
}

//TODO: add input validation, error handling, and password hashing as well as go back functionality