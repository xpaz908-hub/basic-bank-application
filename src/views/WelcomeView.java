package views;
import java.util.Scanner;
import util.*;
import users.*;

public class WelcomeView {
    private Scanner scan;
    private boolean running = true;

    public WelcomeView(Scanner scan) {
        this.scan = scan;
    }
    public void show() {
        Console.clearTerminal();
        System.out.println("Welcome to BankStation!");
        while(running) {
            System.out.println("Please select an option:\n");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("-> ");

            String input = scan.nextLine();
            switch (input) {
                case "1":
                    // login view
                    running = false;
                    break;
                case "2":
                    new RegisterView(scan).show();
                    running = false;
                    break;
                    case "3":
                    System.out.print("\nThank you for using BankStation!");
                    System.exit(0);
                default:
                    Console.clearTerminal();
                    System.out.println("Not a valid choice, please try again.\n");
            }
        }
    }
}
