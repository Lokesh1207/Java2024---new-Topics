package Recursion;

public class ReverseNumber {
    static void rev(int n) {
        if (n == 0) return;
        int rem = n % 10;
        System.out.println(rem);
        rev(n / 10);
    }

    public static void main(String[] args) {
        rev(34512);
    }
}
