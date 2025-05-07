import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private String name;
    private int total_deposits=0;
    private int total_withdraw=0;
    private String accountType;
    private ArrayList<String> options=new ArrayList<>();
    private final double SMS_ALERT_FEE=2000;
    private final double DEBIT_CARD_FEE=5000;


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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    void deposit(double amount){
        if (amount > 0 && balance<100000) {
            balance += amount;
            total_deposits++; // Increment deposit count
            System.out.println("Deposited: " + amount);
        }else if(balance>=100000){
            // new strategy implementation
            balance+=(amount+amount/100);
            total_deposits++; // Increment deposit count
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    void withdraw(double amount){
        if(amount>0&&amount<=balance){

            if(balance-amount<50000){
                // implemented a new strategy
                System.out.println("Deduction 2% when balance is less than 50000");
                double deductionamount=amount+amount*2/100;
                balance-=deductionamount;
                total_withdraw++;
                System.out.println("Withdraw: " + amount);
            }else{
                balance-=amount;
                total_withdraw++;
                System.out.println("Withdraw: " + amount);
            }

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

    void account(){
        System.out.println("Bank account is opened successfully!");
        System.out.println("Do you want to subscribe optional services? Press 1 and 2 or both");
        System.out.println("1:Debit card");
        System.out.println("2:SMS alert");
        System.out.println("3:Both");
//      input choice
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();

        if(choice==1){
            options.add("Debit Card");
        }else if(choice==2){
            options.add("SMS alert");
        }else{
            options.add("Debit Card");
            options.add("SMS alert");
        }

        if(balance>=3000000){
            setAccountType("Premium");
        }else{
            setAccountType("Standard");
        }

    }

    void deductAnnualFee(){
        LocalDate currentDate=LocalDate.now();

        if(currentDate.getMonthValue()==12 && currentDate.getDayOfMonth()==31 && getAccountType().equals("Standard")){
            if(options.contains("Debit Card")&&options.contains("SMS alert")){
                balance-=DEBIT_CARD_FEE+SMS_ALERT_FEE;
            }else if(options.contains("SMS alert")){
                balance-=SMS_ALERT_FEE;
            }else{
                balance-=DEBIT_CARD_FEE;
            }
        }
    }

    void accountInfo(){
        System.out.println("Account Title:"+name);
        System.out.println("Total deposits:"+total_deposits);
        System.out.println("Total withdraw:"+total_withdraw);
        System.out.println("Balance:"+balance);
        System.out.println("Account Type:"+accountType);
        System.out.println("Subscribed optional services");
        for(String opt:options){
            System.out.println(opt);
        }
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
