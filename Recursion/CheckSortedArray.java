package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,5,2,4,3};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr , int i) {
        if(arr.length == 0) return false;
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i + 1] && isSorted(arr , i + 1);
    }
}
