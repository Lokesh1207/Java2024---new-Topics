package Basic100;

public class PrimeFactorsOfNumber {
    public static void main(String[] args) {
        int n = 12;
        primefactors(n);
    }

    private static void primefactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n + " ");
        }
    }
}
