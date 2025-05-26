package Recursion;

public class Example1 {
    public static void main(String[] args) {
        concept(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funrev(int n) {
        if (n == 0) {
            return;
        }
        funrev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    static void concept(int n) {
        if (n == 0) return;
        System.out.println(n);
        concept(--n); // --n vs n-- ,here n-- wont work.
    }
}
