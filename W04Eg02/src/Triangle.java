public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle: ");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle: ");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Moving Triangle to (" + x + ", " + y + ").");
    }
}
