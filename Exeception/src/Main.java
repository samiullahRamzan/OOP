import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime Exception
        Scanner scanner=new Scanner(System.in);
        String[] users=new String[]{"Sami","Ahmad","Abdullah","Yasmeen","Shout"};

//      Let's handle runtime error, JVM wil throw runtime error .
        try{
            System.out.println("Enter index:");
            int index=scanner.nextInt();
            System.out.println("Here is user:\t"+users[2]);
            System.out.println("Here is sami");
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException exp){
            System.out.println("exp occured");
            System.out.println(exp.getMessage());
        }finally {
            System.out.println("this will run at the end: it must be run");
        }

//     Now we will try throw error on our own..
       Employee employee=new Employee(45,"Samiullah");

       try{
           employee.setId(-10);
           System.out.println("Here is employee id:"+employee.getId());
       }catch (IllegalArgumentException exp){
           System.out.println("exp occured");
           System.out.print(exp.getMessage());
       }

    }
}