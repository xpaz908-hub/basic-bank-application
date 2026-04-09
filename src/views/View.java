package views;

import java.util.Scanner;

public abstract class View {

    protected Scanner viewScanner;

    protected View(Scanner mainScanner) {
        viewScanner = mainScanner;
    }
    public abstract View show();
    public Scanner getScanner() {
        return viewScanner;
    }
}
