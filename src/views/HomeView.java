package views;
import java.util.Scanner;
import users.*;
import util.*;

public class HomeView extends View {
   User currentCustomer;

     public HomeView(Scanner scan, User currentCustomer) {
        super(scan);
        this.currentCustomer = currentCustomer;
     }
     @Override
     public View show() {
        Utils.clearTerminal();
        while(true)
        {
            System.out.println("Welcome to your account, " + currentCustomer.getName() + "!");
            System.out.println("1. View Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Logout");
            System.out.print("Choose an option: ");
            String choice = viewScanner.nextLine();

            switch (choice) {
                case "1" -> System.out.println("Viewing account...");
                case "2" -> System.out.println("Depositing...");
                case "3" -> System.out.println("Withdrawing...");
                case "4" -> System.out.println("Transferring...");
                case "5" -> {
                    return new WelcomeView(viewScanner);
                }
                case "6" -> System.out.println(currentCustomer.getId() + " - " + currentCustomer.getName() + " - " + currentCustomer.getPassword()); //! Debugging line
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
     }
}
