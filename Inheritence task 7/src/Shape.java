public class Shape {
    private boolean filled;
    private COLOUR colour;

    public Shape(boolean filled, COLOUR colour) {
        this.filled = filled;
        this.colour = colour;
    }

    public Shape(){

    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public COLOUR getColour() {
        return colour;
    }

    public void setColour(COLOUR colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                ", colour=" + colour +
                '}';
    }
}
