public class Circle {
    private double radius;
    final double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>0){
            this.radius = radius;
        }else{
            System.out.println("Radius value should be greater than 0");
        }
    }

    public double calculateArea(){
         return PI*(radius*radius);
    }

    public double calculatePerimeter(){
        return 2*PI*radius;
    }
}
