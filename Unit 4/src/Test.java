public class Test {
    public static void hailstone(int i) {
        System.out.println(i);
        if (i != 1) hailstone(i % 2 == 0 ? i / 2 : 3 * i + 1);
    }

    public static int count1(int i) {
        if (i == 0) return 0;
        if (i % 10 == 1) {
            if (i / 10 % 10 == 9) return count1(i / 100);
            if (i / 10 % 10 == 5) return 2 + count1(i / 100);
            if (i / 10 % 10 == 3) return 3 + count1(i / 100);
            return 1 + count1(i / 10);
        }
        return count1(i / 10);
    }

    public static void main(String[] args) {
        hailstone(92392139);
    }
}
