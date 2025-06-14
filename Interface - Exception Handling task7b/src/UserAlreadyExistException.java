public class UserAlreadyExistException extends RuntimeException {
    private int id;
    public UserAlreadyExistException(int userId,String message) {
        super(message);
        setId(userId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
