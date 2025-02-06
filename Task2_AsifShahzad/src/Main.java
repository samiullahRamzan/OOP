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
        int input;
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