public class Main {
    public static void main(String[] args) {
//       Circle circle=new Circle(3);
//
//       System.out.println("Area of a circle:"+ circle.calculateArea());
//       System.out.println("Perimeter of a circle:"+ circle.calculatePerimeter());

        Employee e1=new Employee();

        Employee e2=new Employee("3510311752741","SAMI ULLAH");
        System.out.println(e2.getCnic());
        System.out.println(e2.getName());

        System.out.println("--------------------------------------------");
        Employee e3=new Employee("3510311752741","SAMI ULLAH",56788);
        System.out.println(e3.getCnic());
        System.out.println(e3.getName());
        System.out.println(e3.getSalary());




    }
}