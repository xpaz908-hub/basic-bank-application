package main;
import java.util.Scanner;
import views.*;
import users.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User currentUser = null; // Placeholder
        View welcomeView = new WelcomeView(scan);
        welcomeView.show();
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