public class Main {
    public static void printEachShapeCount(Shape... shapes){
        System.out.println("here is shapes length"+shapes.length);
        int circleCount=0;
        int rectangleCount=0;
        for(Shape shape:shapes){
            if(shape instanceof Rectangle){
                rectangleCount++;
            }else{
                circleCount++;
            }
        }

        System.out.println("Total circle objects:"+circleCount);
        System.out.println("Total rectangle objects:"+rectangleCount);
    }
    public static void main(String[] args) {
//        Employee employee=new Employee(3554,"gujjar","230","43453654645");
//        CommissionEmployee c_employee=new CommissionEmployee(4546,"SAMI","ULLAH","35103-1175274-1",30000,45);
//        System.out.println(employee.toString());
//        System.out.println(c_employee.toString());
//        BasePlusCommissionEmployee basePlus=new BasePlusCommissionEmployee(4546,"SAMI","ULLAH","35103-1175274-1",30000,45,68658);
//        System.out.println(basePlus.toString());
//        System.out.println("--------------------------------");
//        System.out.println("Here is earning of basepluscommission employee:\t"+basePlus.getEarnings());

//          HourlyEmployee hourlyEmployee=new HourlyEmployee("SAMI","ULLAH","35103-2275274-1",56,67868);
//          System.out.println(hourlyEmployee.toString());
//          System.out.println(hourlyEmployee.earnings());

        Shape rectangle=new Rectangle(true,COLOUR.RED,5,5);
        System.out.println("Rectangle area:"+rectangle.getArea());
        System.out.println("Rectangle perimeter:"+rectangle.getPerimeter());
        System.out.println("Rectangle information");
        System.out.println(rectangle.toString());

        System.out.println("-------------------------------------------");

        Shape circle=new Circle(true,COLOUR.BLUE,5);

        System.out.println("Circle area:"+circle.getArea());
        System.out.println("Circle perimeter:"+circle.getPerimeter());
        System.out.println("Circle information");
        System.out.println(circle.toString());

        Shape rectangle1=new Rectangle();


        printEachShapeCount(circle,rectangle,rectangle1);
    }
}