package lab2P;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String email) {
        User user = findByEmail(email);
        if (user != null) {
            users.remove(user);
        }
    }

    public void updateUser(String email, String newName, String newRole) {
        User user = findByEmail(email);
        if (user != null) {
            user.setName(newName);
            user.setRole(newRole);
        }
    }

    private User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }
}