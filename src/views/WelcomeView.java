package views;
import java.util.Scanner;
import util.Util;

public class WelcomeView {
    private Scanner scan = new Scanner(System.in);

        public void show() {
            Util.clearTerminal();
            System.out.println("Welcome to the Bank!");
            while(true) {
                System.out.println("Please select an option:\n");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("-> ");

                String input = scan.nextLine();
                switch (input) {
                    case "1":
                        // login view
                        break;
                    case "2":
                        // register view
                        break;
                    case "3":
                        System.out.print("\nGoodbye!");
                        System.exit(0);
                        default:
                        System.out.print("\033[H\033[2J");
                        System.out.println("Not a valid choice, please try again.\n");
                }
        }
    }
}

// System.out.print("\033[H\033[2J"); clear terminal
