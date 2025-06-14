import java.util.ArrayList;

public class InMemoryUserService implements UserService{
    public static ArrayList<User> users=new ArrayList<>();
    @Override
    @Override
    public void addUser(User user) throws UserAlreadyExistException {
        for (User user1 : users) {
            if (user1.equals(user)) {  // Use equals to check if user already exists based on id
                throw new UserAlreadyExistException(user.getId(), "User already exists.");
            }
        }
        users.add(user);  // Add the user if not already in the list
    }

    @Override
    public void updateUser(User user) {
        int i=0;
        for(User user1:users){
            if(user1.getId()==user.getId()){
                users.set(i,user);
                return;
            }
            i++;
        }
    }

    @Override
    public void deleteUser(int userID) {
        int i=0;
        for(User user1:users){
            if(user1.getId()==userID){
                users.remove(i);
                return;
            }
            i++;
        }
    }

    @Override
    public User getUser(int userID) throws UserAccountIsBlockedException {
        for (User user1 : users) {
            if (user1.getId() == userID) {
                if (!user1.isStatus()) {
                    throw new UserAccountIsBlockedException("User is blocked");
                } else {
                    return user1;  // Return the found user
                }
            }
        }
        return null;  // Return null if user is not found
    }

    @Override
    public void unblockUser(int userID) {
        int i=0;
        for(User user1:users){
            if(user1.getId()==userID){
                user1.setStatus(true);
            }
            i++;
        }
    }

    @Override
    public void blockUser(int userID) {
        int i=0;
        for(User user1:users){
            if(user1.getId()==userID){
                user1.setStatus(false);
            }
            i++;
        }
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return users;
    }
}
