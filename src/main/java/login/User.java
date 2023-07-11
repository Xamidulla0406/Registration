package login;

import java.util.ArrayList;
import java.util.List;

public class User {
    static List<User> users = new ArrayList<>(List.of(
        new User("Hamidulla", "0101"),
        new User("Programmer", "0406")
    ));
    private String username;
    private String password;
    public User() {
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
