package Problems;

import java.util.*;

public class Intersection {
	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> ll1 = new LinkedList<>();
		List<Integer> ll2 = new LinkedList<>();
		for (Integer num : nums1) {
			ll1.add(num);
		}
		for (Integer num : nums2) {
			ll2.add(num);
		}
		Collections.sort(ll1);
		Collections.sort(ll2);
		List<Integer> res = new LinkedList<>();
		int k = 0;
		int j = 0;
		while (k < ll1.size() && j < ll2.size()) {
			if (ll1.get(k).equals(ll2.get(j))) {// In this case, we use .equals() because we're comparing Integer
												// objects, not primitive int values. When we compare ll1.get(k) and
												// ll2.get(j), we're comparing Integer objects representing the same
												// integer values, so .equals() ensures that their contents are the
												// same. Using == here would compare references, which might not give
												// the correct result.
				res.add(ll1.get(k));
				k++;
				j++;
			} else if (ll1.get(k) < ll2.get(j)) {
				k++;
			} else {
				j++;
			}
		}

		int result[] = new int[res.size()];
		int i = 0;
		for (int num : res) {
			result[i] = num;
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };
		int[] result = intersect(nums1, nums2);
		// Since the intersect method returns an array, you cannot directly print it
		// using System.out.println(). Instead, you should convert the array to a string
		// representation before printing.
		// Convert the result array to a string for printing
		System.out.println(Arrays.toString(result));
	}

}
