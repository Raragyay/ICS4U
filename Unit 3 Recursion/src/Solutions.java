public class Solutions {
    public int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1);
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n == 0) return 0;
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);

    }

    public int count8(int n) {
        if (n == 0) return 0;
        if (n % 10 == 8 && (n / 10) % 10 == 8) return 2 + count8(n / 10);
        return (n % 10 == 8 ? 1 : 0) + count8(n / 10);

    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.length() == 0) return 0;
        return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
    }

    public int countHi(String str) {
        if (str.length() == 0 || str.length() == 1) return 0;
        return (str.substring(0, 2).equals("hi") ? 1 : 0) + countHi(str.substring(1));
    }

    public String changeXY(String str) {
        if (str.length() == 0) return "";
        return (str.substring(0, 1).equals("x") ? "y" : str.substring(0, 1)) + changeXY(str.substring(1));
    }

    public String changePi(String str) {
        if (str.length() == 0 || str.length() == 1) return str;
        return str.substring(0, 2).equals("pi") ? "3.14" + changePi(str.substring(2)) : str.substring(0, 1) + changePi(str.substring(1));
    }

    public String noX(String str) {
        if (str.length() == 0) return str;
        return (str.charAt(0) == 'x' ? "" : str.substring(0, 1)) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        return nums[index] == 6 || array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        return (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);
    }

    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) return false;
        return nums[index] * 10 == nums[index + 1] || array220(nums, index + 1);
    }

    public String allStar(String str) {
        if (str.length() == 1 || str.length() == 0) return str;
        return str.substring(0, 1) + "*" + allStar(str.substring(1));
    }

    public String pairStar(String str) {
        if (str.length() == 0 || str.length() == 1) return str;
        if (str.charAt(0) == str.charAt(1)) {
            if (str.length() == 2) return str.substring(0, 1) + "*" + str.substring(1, 2);
            if (str.charAt(1) == str.charAt(2))
                return str.substring(0, 1) + "*" + str.substring(1, 2) + "*" + pairStar(str.substring(2));
            return str.substring(0, 1) + "*" + str.substring(1, 2) + pairStar(str.substring(2));
        } else {
            return str.substring(0, 1) + pairStar(str.substring(1));
        }
    }

    public String endX(String str) {
        if (str.length() == 0) return str;
        return str.charAt(0) == 'x' ? endX(str.substring(1)) + "x" : str.substring(0, 1) + endX(str.substring(1));
    }

    public int countPairs(String str) {
        if (str.length() == 0 || str.length() == 1 || str.length() == 2) return 0;
        return (str.charAt(0) == str.charAt(2) ? 1 : 0) + countPairs(str.substring(1));
    }

    public int countAbc(String str) {
        if (str.length() < 3) return 0;
        return ((str.substring(0, 3).equals("aba") || str.substring(0, 3).equals("abc")) ? 1 : 0) + countAbc(str.substring(1));
    }

    public int count11(String str) {
        if (str.length() < 2) return 0;
        return ((str.substring(0, 2).equals("11"))) ? 1 + count11(str.substring(2)) : count11(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length() < 2) return str;
        return str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1)) : str.substring(0, 1) + stringClean(str.substring(1));
    }

    public int countHi2(String str) {
        if (str.length() < 3) {
            if (str.length() == 2 && str.equals("hi")) return 1;
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        if (str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        }
        return countHi2(str.substring(1));
    }

    public String parenBit(String str) {
        if (str.charAt(0) == '(') return str.substring(0, 1) + parenBit("~" + str.substring(1));
        if (str.charAt(1) == ')') return ")";
        if (str.charAt(0) == '~') return str.substring(1, 2) + parenBit("~" + str.substring(2));
        return parenBit(str.substring(1));
    }

    public boolean nestParen(String str) {
        if (str.length() % 2 == 1) return false;
        if (str.length() == 0) return true;
        return str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && nestParen(str.substring(1, str.length() - 1));
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n <= 0) return true;
        if (str.length() < sub.length()) return false;
        if (str.substring(0, sub.length()).equals(sub)) return strCopies(str.substring(1), sub, n - 1);
        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.length() <= sub.length()) {
            if (str.equals(sub)) return sub.length();
            return 0;
        }
        if (str.startsWith(sub)) {
            if (str.endsWith(sub)) return str.length();
            return strDist(str.substring(0, str.length() - 1), sub);
        }
        return strDist(str.substring(1), sub);
    }

}
