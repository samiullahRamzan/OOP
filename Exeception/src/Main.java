import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Runtime Exception
        Scanner scanner=new Scanner(System.in);
        String[] users=new String[]{"Sami","Ahmad","Abdullah","Yasmeen","Shout"};

//      Let's handle runtime error, we
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
    }
}