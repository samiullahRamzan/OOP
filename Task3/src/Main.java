public class Main {
    public static void main(String[] args) {
//       Circle circle=new Circle(3);
//
//       System.out.println("Area of a circle:"+ circle.calculateArea());
//       System.out.println("Perimeter of a circle:"+ circle.calculatePerimeter());

//        Employee e1=new Employee();
//
//        Employee e2=new Employee("3510311752741","SAMI ULLAH");
//        System.out.println(e2.getCnic());
//        System.out.println(e2.getName());
//
//        System.out.println("--------------------------------------------");
//        Employee e3=new Employee("3510311752741","SAMI ULLAH",56788);
//        System.out.println(e3.getCnic());
//        System.out.println(e3.getName());
//        System.out.println(e3.getSalary());


        // Creating an account with an existing accountId
        Account account = new Account(676786);
        System.out.println("Account ID: " + account.getAccountId());

        // Creating a new account with CNIC, name, and age
        Account newAccount = new Account("1234567890123", "Samiullah", 22);  // Valid age for creating account
        System.out.println("New Account Balance: " + newAccount.getBalance());

        // Trying to create an account with an age below 20 (will not be created)
        Account invalidAccount = new Account("9876543210123", "Ali", 18);  // Invalid age for creating account
        System.out.println("Invalid Account Balance: " + invalidAccount.getBalance());  // Balance should not be set

    }
}