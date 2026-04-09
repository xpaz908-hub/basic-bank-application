package users;

public abstract class User {
    private String name;
    private String email;
    private String password;
    private int id;

    protected User(String name, String email, String password, int id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public int getId() {
        return this.id;
    }
}