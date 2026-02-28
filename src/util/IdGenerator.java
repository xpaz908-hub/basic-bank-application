package util;
import users.Customer;

public class IdGenerator {
        public static int generateRandomID() {      //*  RECURSION!?!?!??!!!
        if (FileIO.searchInt(Customer.customerDatabase, (int)(Math.random() * 10000))) {
            return generateRandomID();
        } else {
            return (int)(Math.random() * 10000);
        }
    }
}
