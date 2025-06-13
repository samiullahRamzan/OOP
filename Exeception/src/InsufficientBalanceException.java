public class InsufficientBalanceException extends Exception{
    private int id;

    public InsufficientBalanceException( int id,String message) {
        super(message);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
