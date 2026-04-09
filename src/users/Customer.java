package users;
import java.util.ArrayList;
import accounts.Account;

public class Customer extends User {
    private ArrayList<Account> customerAccounts;
    private String name;
    private String email;
    private String password;
    private int id;

    public Customer(String name, String email, String password, int id, ArrayList<Account> customerAccounts) {
        super(name, email, password, id);
        this.customerAccounts = customerAccounts;
    }
}
