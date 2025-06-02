import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//      address info
        System.out.println("Enter street address");
        String street_address=scanner.nextLine();
        System.out.println("Enter town");
        String town=scanner.nextLine();
        System.out.println("Enter city");
        String city=scanner.nextLine();
        Address address=new Address(street_address,town,city);

//      Enter your name and cnic, email
        System.out.println("Enter your name");
        String name=scanner.nextLine();
        System.out.println("Enter your cnic");
        String cnic=scanner.nextLine();
        System.out.println("Enter your email");
        String email=scanner.nextLine();
        Student student1=new Student(name,cnic,address);

//      Enter course1 details;
        System.out.println("Enter your course code 1");
        String courseCode1=scanner.nextLine();
        System.out.println("Enter your course title 1");
        String courseTitle1=scanner.nextLine();

//      Enter course1 details;
        System.out.println("Enter your course code 2");
        String courseCode2=scanner.nextLine();
        System.out.println("Enter your course title 2");
        String courseTitle2=scanner.nextLine();

        Course course1=new Course(courseCode1,courseTitle1);
        Course course2=new Course(courseCode2,courseTitle2);

        student1.setEmail(email);
        student1.setCourse1(course1);
        student1.setCourse2(course2);

        //print all instance attributes
        student1.print();

//      make another student 2 object
        Student student2 = new Student("Ali", "12345-6789012-3", student1.getAddress());

//      Optionally set other values (no need to ask user)
        student2.setEmail("ali@example.com");

        Course scourse1 = new Course("CS201", "Data Structures");
        Course scourse2 = new Course("CS202", "OOP");

        student2.setCourse1(scourse1);
        student2.setCourse2(scourse2);

//      Print student2 details
        student2.print();

    }
}