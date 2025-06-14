import java.util.ArrayList;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userID);
    User getUser(int userID) throws UserAccountIsBlockedException;
    void unblockUser(int userID);
    void blockUser(int userID);
    ArrayList<User> getAllUsers();
}
