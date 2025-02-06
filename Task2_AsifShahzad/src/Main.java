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

        BankAccount account=new BankAccount();
        account.name=name;
        account.balance=amount;

        System.out.println("Press 1 to 4");
        int input=scanner.nextInt();

        if(input==1){
            System.out.println("Enter amount you want to deposit:");
            amount=scanner.nextDouble();
            account.deposit(amount);
        }else if(input==2){
            System.out.println("Enter amount you want to withdraw:");
            amount=scanner.nextDouble();
            account.withdraw(amount);
        }else if(input==3){
            System.out.println("current balance:"+account.balance);
        }else{
            System.out.println("Invalid choice! Program is terminated");
            return;
        }

        scanner.close();
    }
}