public class MethodOverloading {
    public static int add(int x, int y) {
        return x + y;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static double add(int x, double y)
    {
        return x + y;
    }

    // Main Code
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add("abc", "def"));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1,2.3));
    }
}
