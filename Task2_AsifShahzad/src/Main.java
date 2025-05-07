import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       create a scanner class
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a name:");
        String name=scanner.nextLine();

        System.out.println("Enter amount:");
        double amount=scanner.nextDouble();

        System.out.println("Name:"+name);
        System.out.println("Amount:"+amount);

        BankAccount account=new BankAccount(amount,name);

        account.account();

        account.accountInfo();
        System.out.println("Account balance before deduction:"+account.getBalance());
        account.deductAnnualFee();
        System.out.println("Account balance after deduction:"+account.getBalance());

        int input;
        int input2;
        account.displayMenu();

        do{
            System.out.print("Enter your choice: ");
            input=scanner.nextInt();
            if(input==1){
                System.out.println("Enter amount you want to deposit:");
                amount=scanner.nextDouble();
                account.deposit(amount);
            }else if(input==2){
                System.out.println("Enter amount you want to withdraw:");
                amount=scanner.nextDouble();
                if(account.getBalance()>50000&&account.getBalance()-amount<50000){
                    System.out.println("Are you sure you want to withdraw,it would make your balance below 50,000");
                    System.out.print("Enter your choice: ");
                    System.out.println("Press 1 to continue and 0 to abort");
                    input2=scanner.nextInt();
                    if(input2==0){
                        continue;
                    }
                }
                account.withdraw(amount);
            }else if(input==3){
                System.out.println("current balance:"+account.getBalance());
            }else if(input==4){
                System.out.println("Program is terminated");
                System.out.println("======End=====");
            }else{
                System.out.println("Invalid choice!");
            }

        }while(input != 4);

        account.accountInfo();

        scanner.close();
    }
}