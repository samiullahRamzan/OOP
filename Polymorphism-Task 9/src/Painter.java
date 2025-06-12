public class Painter {
    static final double PAINTING_RATE;

    static {
        PAINTING_RATE=678;
    }

    public static double calcPaintingCost(Shape shape){
        return shape.calcArea()*PAINTING_RATE;
    }
}
