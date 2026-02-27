package users;

public class Admin extends User {
    public Admin(String name, String email, String password, int id) {
        super(name, email, password, id);
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

/*
Will be used for later

Still have to implement admin features such as creating accounts, deleting accounts, and viewing all accounts.

other features:
- viewing all transactions
*/