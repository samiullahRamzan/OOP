public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Teacher t1=new Teacher("Samiullah","Computer Science","Urdu",56.7);  // instance of a object
        Teacher t2=new Teacher(t1);

        t2.setName("ahmad");
        System.out.println(t1.getName());
        System.out.println(t1.getDept());
        System.out.println(t1.getSubject());
        System.out.println(t1.getSalary());

        System.out.println(t2.getName());
    }
}