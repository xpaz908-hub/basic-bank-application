package main;
import java.util.Scanner;
import views.*;

public class Main {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        View currentView = new WelcomeView(mainScanner);
        while (currentView != null) {
            try {
                currentView = currentView.show();
            } catch (Exception e) {
                System.out.println("A critical error occurred: " + e.getMessage() + "\nPlease restart the application.");
                break;
            }
        }
        System.out.print("\nThank you for using BankStation!");
    }
}
/*
basics of a banking system:

- accounts
    - account number
    - balance
    - deposit
    - withdraw
    - transfer
- customers
    - name
    - accounts
- bank
    - customers
        - accounts

program structure:
*/