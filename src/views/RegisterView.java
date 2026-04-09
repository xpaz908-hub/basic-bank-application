package views;
import java.util.Scanner;
import util.*;

public class RegisterView extends View {
    public RegisterView(Scanner scan) {
        super(scan);
    }
    @Override
    public View show() {
        while (true) { 
            Utils.clearTerminal();
            System.out.println("Register for a new account. Type 'exit' to go back.\n");
            try {
                System.out.print("Enter your name: ");
                String name = viewScanner.nextLine();
                Utils.validateInput(name);
                if (name.equalsIgnoreCase("exit"))
                    return new WelcomeView(viewScanner);
                System.out.print("Enter a password: ");
                String password = viewScanner.nextLine();
                Utils.validateInput(password);
                if (password.equalsIgnoreCase("exit"))
                    return new WelcomeView(viewScanner);
                AuthService.createAccount(name, password);
                System.out.println("Account created successfully!\n\nPress Enter to log in.");
                viewScanner.nextLine();
                return new WelcomeView(viewScanner);
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
        }
    }
}

//TODO: add input validation, error handling, and password hashing as well as go back functionality