public class Rectangle {
    // Object Variables
    private double length;
    private double width;
    private double area;
    // Class Variables
    private static double totalArea = 0;
    private static int numOfRect = 0;

    // Constructor Methods
    public Rectangle(double length_input, double width_input) {
        length = length_input;
        width = width_input;
        area = length * width;
        totalArea += area;
        numOfRect++;
    }

    public Rectangle(double length_input) {
        length = length_input;
        width = length_input;
        calcArea();
        totalArea += area;
        numOfRect++;
    }

    public Rectangle() {
        length = 0;
        width = 0;
        area = 0;
        numOfRect++;
    }

    private void calcArea(){
        area=length*width;
    }

    private void updateTotalArea(){
        totalArea-=area;
        calcArea();
        totalArea+=area;
    }

    public double getArea() {
        return area;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public static double getTotalArea() {
        return totalArea;
    }

    public static int getNumOfRect() {
        return numOfRect;
    }

    public void setLength(double length) {
        this.length = length;
        updateTotalArea();
    }

    public void setWidth(double width) {
        this.width = width;
        updateTotalArea();
    }
}
