package Cognizant_HR;

public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD3(10,30));
    }
    static int findGCD(int n1, int n2){
        int min = Math.min(n1,n2);
        int max = 0;
        for(int i = 1; i <= min; i++){
            if(n1 % i == 0 && n2 % i == 0){
                max = Math.max(max, i);
            }
        }
        return max;
    }
    static int findGcd2(int x, int y, int n, int max) {
        //BASE CONDITION
        if (n > Math.min(x, y)) { // if min(100, 25) --> 25, if n goes greater than 25, then return the max.
            return max;
        }
        if (x % n == 0 && y % n == 0) {
            max = Math.max(max, n);
        }
        return findGcd2(x, y, n + 1, max);
    }
    static int findGCD3(int n1 ,int n2){
        int min = n1 < n2 ? n1 : n2;
        while(min >= 2){//min = 10;
            if((n1 % min == 0) && (n2 % min == 0)){
                return min;
            }
            min--;
        }
        return min;
    }
}
