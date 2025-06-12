public class Square extends Shape {
    private double size;

    public Square(String colour, double size) {
        super(colour);
        this.size = size;
    }

    @Override
    double calcArea() {
        return getSize()*getSize();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
