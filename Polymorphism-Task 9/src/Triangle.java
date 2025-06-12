public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String colour, double base, double height) {
        super(colour);
        setBase(base);
        setHeight(height);
    }

    @Override
    double calcArea() {
        return 0.5*getBase()*getHeight();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
