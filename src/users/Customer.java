package users;
import java.util.ArrayList;

public class Customer extends User {

    private ArrayList<Account> customerAccounts;    

    public Customer(String name, String email, String password, int id, ArrayList<Account> customerAccounts) {
        super(name, email, password, id);
        this.customerAccounts = customerAccounts;
    }
}
