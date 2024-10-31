package Algarithms.FastAndSlowPointers;

public class HappyNumber {
    public static boolean isHappyNumber(int n) {

        if (n == 1) {
            return true;
        }

        int slowPoint = n;
        int fastPoint = SumOfSquaredDigits.sumOfSquaredDigits(n);

        while (slowPoint != fastPoint) {
            fastPoint = SumOfSquaredDigits.sumOfSquaredDigits(fastPoint);
            fastPoint = SumOfSquaredDigits.sumOfSquaredDigits(fastPoint);

            if (fastPoint == 1) {
                return true;
            }
            slowPoint = SumOfSquaredDigits.sumOfSquaredDigits(slowPoint);
        }

        return false;

    }

    public static void main(String[] args) {
        int[] a = { 1, 5, 19, 25, 7 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + 1 + "." + "\tInput Number:" + a[i]);
            System.out.println("\t Is Happy number: " + isHappyNumber(a[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }
}
