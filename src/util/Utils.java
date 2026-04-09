package util;
import java.time.LocalDateTime;

public class Utils {
    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
    }
    public static void divider() {
        System.out.println("-------------------------------------");
    }
    public static LocalDateTime getCurrentTimeAndDate() {return LocalDateTime.now();}
    public static void validateInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("test");
            throw new IllegalArgumentException("Input cannot be empty.");
        } else if (input.contains(" ")) {
            System.out.println("test");
            throw new IllegalArgumentException("Input cannot contain spaces.");
        } else if (input.length() < 3) {
            throw new IllegalArgumentException("Input must be at least 3 characters long.");
        } else if (input.length() > 20) {
            throw new IllegalArgumentException("Input must be no more than 20 characters long.");
        }
    }
}
