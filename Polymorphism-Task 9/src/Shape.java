abstract public class Shape {
    private String colour;
    abstract double calcArea();

    public Shape(String colour) {
        setColour(colour);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
