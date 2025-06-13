public class Account {
    private int id;
    private String title;
    private double balance;

    public Account(int id, String title, double balance) {
        this.id = id;
        this.title = title;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<=0)
            throw new InvalidAmountException(amount+" is invalid value");

        if(amount>balance)
            throw new InsufficientBalanceException(this.id,"Insufficient balance");


        balance-=amount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
