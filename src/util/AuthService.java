package util;
import users.Customer;

public class AuthService {
    public static int generateRandomID() {      //*  RECURSION!?!?!??!!!
        if (FileIO.searchInt(Customer.customerDatabase, (int)(Math.random() * 10000)))
            return generateRandomID();
        else 
            return (int)(Math.random() * 10000);
    }
    public static void createAccount(String name, String password) {
        FileIO.createFile(Customer.customerDatabase);
        int newId = AuthService.generateRandomID();
        Customer newCustomer = new Customer(name, null, password, newId, null);
        FileIO.writeFile(Customer.customerDatabase, FileIO.getCustomerData(newCustomer));
    }
}