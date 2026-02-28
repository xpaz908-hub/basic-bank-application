package core;
import java.util.Scanner;
import views.*;
import users.*;

public class Core {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User currentUser = null; // Placeholder
        WelcomeView welcomeView = new WelcomeView(scan, currentUser);
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