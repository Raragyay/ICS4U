import java.util.Scanner;

public class Dragon {
    private String name;
    private double price;
    private int health;
    private boolean herbivore;

    private int dragonCount;

    public Dragon(String n,double p,int hea,boolean her){
        name=n;
        price=p;
        health=hea;
        herbivore=her;

        dragonCount++;
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    public double getPrice() {
        return price;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDragonCount() {
        return dragonCount;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n;
        double p;
        int hea;
        boolean her;
        System.out.println("What is the name of Dragon 1?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 1 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 1 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 1 a herbivore?");
        her = sc.nextBoolean();
        Dragon d1 = new Dragon(n,p,hea,her);
        System.out.println("What is the name of Dragon 2?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 2 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 2 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 2 a herbivore?");
        her = sc.nextBoolean();
        Dragon d2 = new Dragon(n,p,hea,her);
        System.out.println("What is the name of Dragon 3?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 3 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 3 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 3 a herbivore?");
        her = sc.nextBoolean();
        Dragon d3 = new Dragon(n,p,hea,her);
    }
}
