package util;
import java.util.Scanner;
import java.io.File;
import users.*;

public class AuthService {
    public static int generateRandomID() {      //*  RECURSION!?!?!??!!!
        int id = (int)(Math.random() * 10000);
        if (FileIO.searchInt(FileIO.getDatabase(), id))
            return generateRandomID();
        else 
            return id;
    }
    public static void createAccount(String name, String password) {
        FileIO.createFile(FileIO.getDatabase());
        int newId = AuthService.generateRandomID();
        FileIO.writeFile(FileIO.getDatabase(), FileIO.formatCustomerData(name, password, newId));
    }
    public static Customer authenticateUser(String name, String password) {
        try (Scanner scan = new Scanner(new File(FileIO.getDatabase()))) {
            String currentName = "";
            String currentPass = "";
            int currentId = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.contains("Name"))
                    currentName = line.substring(6).trim();
                else if (line.contains("Password"))
                    currentPass = line.substring(9).trim();
                else if (line.contains("ID"))
                    currentId = Integer.parseInt(line.substring(5).trim());
                else if (currentName.equals(name) && currentPass.equals(password)) {
                    return new Customer(currentName, null, currentPass, currentId, null);
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred while authenticating: " + e.getMessage());
        }
        return null;
    }
}