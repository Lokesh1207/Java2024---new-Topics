package Recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 1, 2, 3};
        int s = 0;
        int e = arr.length - 1;
        int target = 6;
        System.out.println(findTarget(arr, target, s, e));
    }

    static int findTarget(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == target) return m;
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return findTarget(arr, target, s, m - 1);// 1st half
            } else {
                return findTarget(arr, target, m + 1, e);//2nd half
            }
        }
        if (target >= arr[m]) {
            return findTarget(arr, target, m + 1, e);//2nd half
        }
        return findTarget(arr, target, s, m - 1);//1st half
    }
}
