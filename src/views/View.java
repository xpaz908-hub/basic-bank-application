package views;

import java.util.Scanner;

public abstract class View {

    protected Scanner scan;

    protected View(Scanner scan) {
        this.scan = scan;
    }
    public void show() {};
    public void show(View parent) {};
    protected void returnToWelcomeView() {
        scan.nextLine(); // Consume the newline left by nextDouble()
        while (true) {
            if (scan.nextLine().isEmpty()) {
                new WelcomeView(scan).show();
                break;
            } 
            else {
                System.out.println("Invalid input, press ENTER.");
            }
        }
    }
}
