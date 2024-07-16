package Problems;

import java.util.*;

public class Problem2 {
	public static void moveZeroes(int[] nums) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				list.add(nums[i]);
			}
		}
		System.out.println(list);
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == 0) {
				list.add(nums[j]);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int input[]= {0,1,0,3,12};
		moveZeroes(input);

	}

}
