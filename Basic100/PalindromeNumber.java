package Basic100;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static boolean isPalindrome(int num) {
        String og = Integer.toString(num);
        StringBuilder rev = new StringBuilder();

        while (num != 0) {
            int rem = num % 10;
            rev.append(rem);
            num /= 10;
        }
        return og.equals(rev.toString());
    }
}
