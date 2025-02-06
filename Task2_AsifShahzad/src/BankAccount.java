public class BankAccount {
    private double balance;
    private String name;
    private int total_deposits=0;
    private int total_withdraw=0;

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            total_deposits++; // Increment deposit count
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    void withdraw(double amount){
        if(amount>0&&amount<=balance){
            balance-=amount;
            total_withdraw++;
            System.out.println("Withdraw: " + amount);
        }else {
            System.out.println("withdraw amount must be positive or less than equal to balance!");
        }
    }

    public int getTotal_deposits() {
        return total_deposits;
    }

    public int getTotal_withdraw() {
        return total_withdraw;
    }

    void accountInfo(){
        System.out.println("Account Title:"+name);
        System.out.println("Total deposits:"+total_deposits);
        System.out.println("Total withdraw:"+total_withdraw);
        System.out.println("Balance:"+balance);
    }

    void displayMenu(){
        // Displaying the menu
        System.out.println("\n===== Bank Menu =====");
        System.out.println("Press 1: To Deposit an amount");
        System.out.println("Press 2: To Withdraw an amount");
        System.out.println("Press 3: To View the current balance");
        System.out.println("Press 4: To Close this program");
    }


}
