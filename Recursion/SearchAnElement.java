package Recursion;

import java.util.ArrayList;

public class SearchAnElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1, 3, 2};
        int target = 1;
        System.out.println(findAllIndex(arr, target, 0, new ArrayList<Integer>()));
    }

    static int searchtarget(int[] arr, int target, int i) {
        if (arr.length == 0 || i == arr.length) return -1;
        return (arr[i] == target) ? i : searchtarget(arr, target, i + 1);
    }

    static ArrayList<Integer> findAllIndex(int arr[], int target, int i, ArrayList<Integer> list) {
        if (arr.length == 0 || i == arr.length) return list;
        if (arr[i] == target) list.add(i);
        return findAllIndex(arr, target, i + 1, list);
    }
}
