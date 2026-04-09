package views;
import java.util.Scanner;
import util.*;

public class WelcomeView extends View {
    private String input;

    public WelcomeView(Scanner mainScanner) {
        super(mainScanner);
    }
    @Override
    public View show() {
        Utils.clearTerminal();
        System.out.println("Welcome to BankStation!");
        while(true) {
            System.out.println("Please select an option:\n");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("-> ");
            input = viewScanner.nextLine();

            switch (input) {
                case "1" -> {
                    return new LoginView(viewScanner);
                }
                case "2" -> {
                    System.out.println("test");
                    return new RegisterView(viewScanner);
                }
                case "3" -> {
                    return null;
                }
                default -> {
                    Utils.clearTerminal();
                    System.out.println("Not a valid choice, please try again.\n");
                }
            }
        }
    }
}
