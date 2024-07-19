package Basic100;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 5;
        int power = 5;
        System.out.println(n + " ^ " + power + ": " + power(n, power));
    }

    static int power(int n, int power) {
        int res = 1;
        for (int i = 1; i <= power; i++) {
            res *= n;
        }
        return res;
    }
}
