package Basic100;

import java.util.Scanner;

public class SumofNNaturalNumbers3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
