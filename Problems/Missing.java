package Problems;

import java.util.*;

public class Missing {
	static public int firstMissingPositive(int[] nums) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        Arrays.sort(nums);
        int start = 1;
        int end = nums[nums.length - 1];
        // Populate the TreeMap with counts of positive integers
        for (int num : nums) {
            if (num > 0)
                hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        // Iterate through the TreeMap to find the first missing positive integer
        while (start <= end) {
            if (!hm.containsKey(start))
                return start;
            start++;
        }
        // If all positive integers are present, return end + 1
        return end + 1;
    }
	public static void main(String[] args) {
		int nums[] = { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));

	}

}
