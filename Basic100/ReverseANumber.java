package Basic100;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int rem = num % 10;
            sb.append(rem);
            num /= 10;
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
