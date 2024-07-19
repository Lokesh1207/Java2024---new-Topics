package Basic100;

public class AmstrongNumber2 {
    public static void main(String[] args) {
        int start = 100;
        int end = 1000;
        for (int i = start; i <= end; i++) {
            if (isAmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isAmstrong(int num) {
        int original = num;
        int len = Integer.toString(num).length();
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, len);
            num = num / 10;
        }
        if (sum == original) {
            return true;
        }
        return false;
    }
}

