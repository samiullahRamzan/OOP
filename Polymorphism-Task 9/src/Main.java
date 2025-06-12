import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printMenu(){
        System.out.println("Press 1, to create Circle");
        System.out.println("Press 2, to create Rectangle");
        System.out.println("Press 3, to create Triangle");
        System.out.println("Press 4, to create Square");
    }

    public static void printInfo(){

    }

    public static void printData(ArrayList<Shape> shapes){
        int TotalCircles=0,TotalRectangles=0,TotalTriangles=0,TotalSquares=0;
        double areaOfCircles=0,areaOfRectangles=0,areaOfTriangles=0,areaOfSquares=0;
        double circlePaintingCost=0,rectanglePaintingCost=0,trianglePaintingCost=0,squarePaintingCost=0;
        double TotalPaintingCost=0;

        for(Shape shape:shapes){

            if(shape instanceof Circle){
                TotalCircles++;
                areaOfCircles+=shape.calcArea();
                circlePaintingCost+=Painter.calcPaintingCost(shape);
            } else if (shape instanceof Rectangle) {
                TotalRectangles++;
                areaOfRectangles+=shape.calcArea();
                rectanglePaintingCost+=Painter.calcPaintingCost(shape);
            }else if (shape instanceof Triangle) {
                TotalTriangles++;
                areaOfTriangles+=shape.calcArea();
                trianglePaintingCost+=Painter.calcPaintingCost(shape);
            }else{  // for square
                TotalSquares++;
                areaOfSquares+=shape.calcArea();
                squarePaintingCost+=Painter.calcPaintingCost(shape);
            }
        }

//      // Here is total painting cost
        TotalPaintingCost=circlePaintingCost+rectanglePaintingCost+trianglePaintingCost+squarePaintingCost;

        // Display total circles info only if there are circles
        if (TotalCircles > 0) {
            System.out.print("Total circles: " + TotalCircles + ",\t" + "Total area of all circles: " + areaOfCircles + ",\t" + "PaintingCost: " + circlePaintingCost);
            System.out.println();
        }

// Display total rectangles info only if there are rectangles
        if (TotalRectangles > 0) {
            System.out.print("Total rectangles: " + TotalRectangles + ",\t" + "Total area of all rectangles: " + areaOfRectangles + ",\t" + "PaintingCost: " + rectanglePaintingCost);
            System.out.println();
        }

// Display total triangles info only if there are triangles
        if (TotalTriangles > 0) {
            System.out.print("Total triangles: " + TotalTriangles + ",\t" + "Total area of all triangles: " + areaOfTriangles + ",\t" + "PaintingCost: " + trianglePaintingCost);
            System.out.println();
        }

// Display total squares info only if there are squares
        if (TotalSquares > 0) {
            System.out.print("Total squares: " + TotalSquares + ",\t" + "Total area of all squares: " + areaOfSquares + ",\t" + "PaintingCost: " + squarePaintingCost);
            System.out.println();
        }

// Display total painting cost
        System.out.println("Total painting cost: " + TotalPaintingCost);


    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Shape> shapes=new ArrayList<>();

        System.out.print("How many shapes you want to create:");
        int maxShapes=scanner.nextInt();
        int inputShapeNumber=0;

        for(int i=0;i<maxShapes;i++){
            System.out.println("Choose "+(i+1)+"st shape type");

            do{
                printMenu();
                inputShapeNumber=scanner.nextInt();
                if(inputShapeNumber<=0||inputShapeNumber>4){
                    System.out.println("Invalid input, Please again enter..");
                }
            }while(inputShapeNumber<=0||inputShapeNumber>4);

            switch (inputShapeNumber){
                case 1:
                    System.out.println("Enter Radius");
                    double radius=scanner.nextDouble();
                    Circle circle=new Circle("Blue",radius);
                    shapes.add(circle);
                    break;
                case 2:
                    System.out.println("Enter Length");
                    double length=scanner.nextDouble();
                    System.out.println("Enter Width");
                    double width=scanner.nextDouble();
                    Rectangle rectangle=new Rectangle("Red",length,width);
                    shapes.add(rectangle);
                    break;
                case 3:
                    System.out.println("Enter Base");
                    double base=scanner.nextDouble();
                    System.out.println("Enter Height");
                    double height=scanner.nextDouble();

                    Triangle triangle=new Triangle("Yellow",base,height);
                    shapes.add(triangle);
                    break;
                default:
                    System.out.println("Enter Size");
                    double size=scanner.nextDouble();

                    Square square=new Square("Orange",size);
                    shapes.add(square);
                    break;
            }


        }

        printData(shapes);
    }
}