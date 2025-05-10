public class Account {
    private int accountId;
    private String cnic;
    private String name;
    private int age;
    private double balance;

//    for existing account
    public Account(int accountId) {
        this.accountId = accountId;
    }
//    for new account


    public Account(String cnic, String name, int age) {
        setAge(age);
        setName(name);
        setCnic(cnic);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 20) {
            System.out.println("Account cannot be created for age below 20");
            return;  // Do not create an account if age is less than 20
        } else if (age < 25) {
            balance = 50000; // Initial balance for age between 20-25
        } else if (age < 30) {
            balance = 25000; // Initial balance for age between 25-30
        } else if (age <= 35) {
            balance = 10000; // Initial balance for age between 30-35
        } else {
            balance = 0; // No initial balance for people above 35
        }
        this.age = age;  // Set age only after balance is set
    }
    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

}
