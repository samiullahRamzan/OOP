public class Circle extends Shape{
    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }



    @Override
    double calcArea() {
        return 3.14*(radius*radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

