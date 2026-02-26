package views;
import java.util.Scanner;

public class LoginView {
    Scanner scan = new Scanner(System.in);


        public void show() {
        while(true) {
            System.out.println("Welcome to the Bank!");
            System.out.println("Please login.\n");
            System.out.print("email: ");
            
            email = scan.next();

            System.out.println("password: ");
        }
    }
}

// System.out.print("\033[H\033[2J"); clear terminal
