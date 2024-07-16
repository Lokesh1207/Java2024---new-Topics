package SlidingWindow;

public class MaxConsecutive1s {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println(findLongSubArray(arr, 2));

	}

	private static int findLongSubArray(int[] arr, int k) {

		int l = 0;
		int r = 0;
		int zeros = 0;
		int maxLen = Integer.MIN_VALUE; // or 0

		while (r < arr.length) {

			if (arr[r] == 0) {
				zeros++;
			}

			if (zeros > k) {
				if (arr[l] == 0) {
					zeros--;
				}
				l++;
			}

			if (zeros <= k) {
				maxLen = Math.max(maxLen, r - l + 1);
			}

			r++;
		}
		return maxLen;
	}
}
