package users;
import java.util.ArrayList;
import accounts.Account;

public class Customer extends User {
    private ArrayList<Account> customerAccounts;  

    public Customer(String name, String email, String password, int id, ArrayList<Account> customerAccounts) {
        super(name, email, password, id);
        this.customerAccounts = customerAccounts;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void changePassword(String newPassword) {
        super.changePassword(newPassword);
    }
}
