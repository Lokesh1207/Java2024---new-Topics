package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(findSum(123));
    }

    static int findSum(int n) {
        if (n < 10) {
            return n;
        }
//        int rem = n % 10;
        return (n % 10) * findSum(n / 10);
    }
}
