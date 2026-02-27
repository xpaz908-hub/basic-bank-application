package users;

abstract class User {
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
    protected String getName() {
        return this.name;
    }
    protected String getEmail() {
        return this.email;
    }
    protected String getPassword() {
        return this.password;
    }
    protected int getId() {
        return this.id;
    }
    protected void changePassword(String newPassword) {
        this.password = newPassword;
    }
}