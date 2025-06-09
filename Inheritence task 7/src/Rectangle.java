public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(boolean filled, COLOUR colour, double length, double width) {
        super(filled, colour);
        setLength(length);
        setWidth(width);
    }

    public Rectangle(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
