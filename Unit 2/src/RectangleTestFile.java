public class RectangleTestFile {
    public static void main(String[] args) {
        System.out.println("Hello, there are " + Rectangle.getNumOfRect() + " Rectangle objects currently.");
        Rectangle rect1 = new Rectangle(3.5);
        System.out.println("You've just created rect1! rect1 has an area of " + rect1.getArea());
        System.out.println("There are " + Rectangle.getNumOfRect() + " Rectangle objects currently.");
        System.out.println("The total amount of area is: " + Rectangle.getTotalArea());
        Rectangle rect2 = new Rectangle(10, 20);
        System.out.println("\nYou've just created rect2! rect2 has an area of " + rect2.getArea());
        System.out.println("There are " + Rectangle.getNumOfRect() + " Rectangle objects currently.");
        System.out.println("The total amount of area is: " + Rectangle.getTotalArea());
        Rectangle rect3 = new Rectangle();
        System.out.println("\nYou've just created rect3! rect3 has an area of " + rect3.getArea());
        System.out.println("There are " + Rectangle.getNumOfRect() + " Rectangle objects currently.");
        System.out.println("The total amount of area is: " + Rectangle.getTotalArea());
        System.out.println("\nLet's change the length of rect3 to 50 and the width of rect3 to 20!");
        rect3.setLength(50);
        rect3.setWidth(20);
        System.out.println("There are still " + Rectangle.getNumOfRect() + " Rectangle objects currently.");
        System.out.println("However the total amount of area is now: " + Rectangle.getTotalArea());
    }
}