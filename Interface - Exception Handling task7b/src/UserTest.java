import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        InMemoryUserService inMemoryUserService=new InMemoryUserService();

        User user1=new User(1,"Samiullah",true);
        User user2=new User(2,"Abdullah",true);
        User user4=new User(3,"Ahmad",false);

        try{
            inMemoryUserService.addUser(user1);
            inMemoryUserService.addUser(user2);
            inMemoryUserService.addUser(user4);
        }catch (UserAlreadyExistException exp){
            System.out.println("exception occurred on this user: "+exp.getId());
            System.out.println("Exception purpose: "+exp.getMessage());
        }

        User user3=new User(2,"Suleman",false);

        inMemoryUserService.updateUser(user3);
//      inMemoryUserService.deleteUser(2);

        inMemoryUserService.blockUser(2);
        inMemoryUserService.unblockUser(2);

        try{
            User user=inMemoryUserService.getUser(3);
            System.out.println("getting user name:"+user.getName());
        }catch (UserAccountIsBlockedException exp){
            System.out.println(exp.getMessage());
        }finally {
            System.out.println("---------------------------");
        }

        ArrayList<User> users=inMemoryUserService.getAllUsers();

        for (User user:users){

            System.out.println("user id: "+user.getId());
            System.out.println("user name: "+user.getName());
            System.out.println("user block/unblock: "+user.isStatus());
            System.out.println("---------------------------------");
        }

    }
}
