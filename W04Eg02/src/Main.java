public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Circle circle = new Circle();
        Quad quad = new Quad();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Polygon polygon = new Polygon();

        drawing.drawShape(circle);
        drawing.drawShape(quad);

    }
}