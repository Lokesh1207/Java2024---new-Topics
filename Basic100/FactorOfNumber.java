package Basic100;

public class FactorOfNumber {
    public static void main(String[] args) {
        int n = 10;
        factors(n);
    }

    private static void factors(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
