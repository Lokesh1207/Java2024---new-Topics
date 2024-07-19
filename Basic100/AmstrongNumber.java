package Basic100;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        if (isAmstrong(num)) {
            System.out.println("Amstrong Number");
        } else {
            System.out.println("Not a Amstrong Number");
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

