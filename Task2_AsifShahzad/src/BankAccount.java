public class BankAccount {
    double balance;
    String name;

    void deposit(double amount){
        balance+=amount;
    }

    void withdraw(double amount){
        balance-=amount;
    }


}
