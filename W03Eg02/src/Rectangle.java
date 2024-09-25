public class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float calculateArea(){
        return  length * width;
    }

    public float calculatePerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "Length: " + length + " .Width: " + width + " .Area: " + calculateArea() + ".Perimeter: " + calculatePerimeter();
    }
}