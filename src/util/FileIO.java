package util;
import java.io.File;
import java.io.FileWriter;
import users.*;

public class FileIO {
    public static void createFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) 
                System.out.println("\nFile " + filename + " created at " + file.getAbsolutePath());
            else
                System.out.println("\nWriting to existing file " + filename);
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
    public static void readFile(String filename) {
        try (java.util.Scanner scanner = new java.util.Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (Exception e) {
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
    public static boolean searchString(String filename, String searchTerm) {
        try (java.util.Scanner scanner = new java.util.Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(searchTerm)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error searching file: " + e.getMessage());
        }
        return false;
    }
    public static boolean searchInt(String filename, int searchNumber) {
        try (java.util.Scanner scanner = new java.util.Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(String.valueOf(searchNumber)))
                    return true;
            }
        } catch (Exception e) {
            System.out.println("Error searching file: " + e.getMessage());
        }
        return false;
    }
    public static String getCustomerData(Customer currentUser) {
            return    "-------------------------------------\n"
            + Console.getCurrentTimeAndDate() + "\n"
            + "-------------------------------------\n"
            + "Name: " + currentUser.getName() + "\n"
            + "Password: " + currentUser.getPassword() + "\n"
            + "ID #: " + currentUser.getId() + "\n\n";
    }
}