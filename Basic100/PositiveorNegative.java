package Basic100;

import java.util.Scanner;

public class PositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
