package util;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static String getDatabase() {
        return "/Users/xpeezy/Desktop/CS/VS code proj/OOP practice/bank/customer_database.txt";
    }
    public static void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) 
                System.out.println("\nFile " + filename + " created at " + file.getAbsolutePath());
            else
                System.out.println("\nWriting to " + filename + "...");
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(content);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void deleteFile(String filename) {
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File " + filename + " deleted.");
        } else {
            System.out.println("Failed to delete file.");
        }
    }
    public static boolean searchInt(String filename, int searchNumber) {
        try (java.util.Scanner scanner = new java.util.Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(String.valueOf(searchNumber)))
                    return true;
            }
        } catch (IOException e) {
            System.out.println("Error searching file: " + e.getMessage());
        }
        return false;
    }
    public static String formatCustomerData(String name, String password, int id) {
            return    "-------------------------------------\n"
            + Utils.getCurrentTimeAndDate() + "\n"
            + "-------------------------------------\n"
            + "Name: " + name + "\n"
            + "Password: " + password + "\n"
            + "ID #: " + id + "\n";
    }
}