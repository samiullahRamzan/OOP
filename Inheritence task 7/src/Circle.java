public class Circle extends Shape{
    private double radius;

    public Circle(boolean filled, COLOUR colour, double radius) {
        super(filled, colour);
        setRadius(radius);
    }

    public Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return 3.14*(radius*radius);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Circle{" +
                "radius=" + radius +
                '}';
    }
}
