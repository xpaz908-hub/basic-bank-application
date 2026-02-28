package views;
import java.util.Scanner;
import util.Util;

public class WelcomeView {
    private Scanner scan = new Scanner(System.in);
    private boolean running = true;

    public void show() {
        Util.clearTerminal();
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
                    running = false;        //?
                    break;
                case "2":
                    // register view
                    break;
                case "3":
                    System.out.print("\nThank you for using BankStation!");
                    System.exit(0);
                default:
                    Util.clearTerminal();
                    System.out.println("Not a valid choice, please try again.\n");
            }
        }
    }
}
