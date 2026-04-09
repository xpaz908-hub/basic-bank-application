package users;

public class Admin extends User {
    private String name;
    private String email;
    private String password;
    private int id;
    
    public Admin(String name, String email, String password, int id) {
        super(name, email, password, id);
    }
}

/*
Will be used for later

Still have to implement admin features such as creating accounts, deleting accounts, and viewing all accounts.

other features:
- viewing all transactions
*/