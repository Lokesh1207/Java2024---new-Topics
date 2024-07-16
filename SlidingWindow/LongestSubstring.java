package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String s = "cadbzabcd";
		System.out.println(findSolution(s));
	}

	private static int findSolution(String s) {

		char arr[] = s.toCharArray();
		
		int l = 0;
		int r = 0;
		int maxLen = 0;

		Set<Character> set = new HashSet<>();
		
		while (r < arr.length) {
			if (!set.contains(arr[r])) {
				set.add(arr[r]);
				maxLen = Math.max(maxLen, r - l + 1);
				r++;
			}

			else {
				set.remove(arr[l]);
				l++;
			}
			
		}
		return maxLen;
	}
}
