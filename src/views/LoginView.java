package views;
import java.util.Scanner;
import util.*;
import users.*;

public class LoginView extends View {

    public LoginView(Scanner scan) {
        super(scan);
    }
    @Override
    public View show() {
        Utils.clearTerminal();
        System.out.println("Login to your account. Type 'exit' to go back.\n");
        while (true) {
            try {
                System.out.print("Enter your name: ");
                String name = viewScanner.nextLine();
                Utils.validateInput(name);
                if (name.equalsIgnoreCase("exit")) {
                    return new WelcomeView(viewScanner);
                }
                System.out.print("Enter your password: ");
                String password = viewScanner.nextLine();
                Utils.validateInput(password);
                User authenticatedUser = AuthService.authenticateUser(name, password);
                if (authenticatedUser != null) {
                    return new HomeView(viewScanner, authenticatedUser);
                } else {
                    System.out.println("Invalid credentials. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again.");
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again. Error: " + e.getMessage());
            }
        }
    }
}