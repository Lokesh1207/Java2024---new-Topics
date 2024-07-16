package SlidingWindow;

public class MaxSumSubarray {

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 2, 1, 7, 8, 1, 2, 8, 1, 0 };
		System.out.println("Maximum Sum in the Subarray is: " + findMaxSum(arr, 3));
	}

	private static int findMaxSum(int[] arr, int k) {
		int maxValue = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (i >= k - 1) {
				maxValue = Math.max(maxValue, currentSum);
				currentSum -= arr[i - (k - 1)];
			}
		}
		return maxValue;
	}

}

/* Note: This type is for fixed length where k is given.
 *  right - left + 1 gives the current window size.
 */