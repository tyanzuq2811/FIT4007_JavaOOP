public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle: ");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Rectangle: ");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Rectangle to (" + x + ", " + y + ").");
    }
}
