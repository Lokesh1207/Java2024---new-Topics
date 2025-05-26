package Cognizant_HR;

import java.util.ArrayList;
import java.util.List;

public class LCM {
    public static void main(String[] args) {
        System.out.println(findLcm(3, 10));
    }

    static int findLcm(int n1, int n2) {
        int max = n1 > n2 ? n1 : n2;//10
        int lcm = max;//10
        while (true) {
            if ((lcm % n1 == 0) && (lcm % n2 == 0)) {
                return lcm;
            }
            lcm++;
        }
        //return -1;
    }
}
