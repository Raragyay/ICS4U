import java.util.Scanner;

public class Sandwich {
    private boolean bacon;
    private boolean lettuce;
    private boolean tomatoes;

    private int sandwichCount=0;

    public Sandwich(boolean b, boolean l, boolean t) {
        bacon = b;
        lettuce = l;
        tomatoes = t;

        sandwichCount++;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomatoes() {
        return tomatoes;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomatoes(boolean tomatoes) {
        this.tomatoes = tomatoes;
    }

    public int getSandwichCount() {
        return sandwichCount;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b, l, t;
        System.out.println("Would you like bacon for Sandwich 1?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 1?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 1?");
        t = sc.nextBoolean();
        Sandwich s1 = new Sandwich(b, l, t);
        System.out.println("Would you like bacon for Sandwich 2?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 2?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 2?");
        t = sc.nextBoolean();
        Sandwich s2 = new Sandwich(b, l, t);
        System.out.println("Would you like bacon for Sandwich 3?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 3?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 3?");
        t = sc.nextBoolean();
        Sandwich s3 = new Sandwich(b, l, t);
    }
}
