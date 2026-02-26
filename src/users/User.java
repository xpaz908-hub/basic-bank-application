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
        return name;
    }
    protected String getEmail() {
        return email;
    }
    protected String getPassword() {
        return password;
    }
    protected int getId() {
        return id;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setEmail(String email) {
        this.email = email;
    }
    protected void setPassword(String password) {
        this.password = password;
    }
    protected void setId(int id) {
        this.id = id;
    }
}
