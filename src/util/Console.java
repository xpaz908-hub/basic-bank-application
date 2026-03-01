package util;
import java.time.LocalDateTime;

public class Console {
    public static void clearTerminal() {
        System.out.print("\033[H\033[2J");
    }
    public static void divider() {
        System.out.println("-------------------------------------");
    }
    public static LocalDateTime getCurrentTimeAndDate() {return LocalDateTime.now();}
}
