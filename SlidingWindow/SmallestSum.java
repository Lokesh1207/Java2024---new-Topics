package SlidingWindow;

public class SmallestSum {

	private static int findSmallestSum(int[] arr, int targetSum) {

		int minWindowSize = Integer.MAX_VALUE;
		int currentSum = 0;
		int start = 0;
		for (int end = 0; end < arr.length; end++) {
			currentSum += arr[end];
			while (currentSum >= targetSum) {
				minWindowSize = Math.min(minWindowSize, end - start + 1);
				currentSum -= arr[start];
				start++;
			}
		}
		return minWindowSize;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 4, 2, 2, 7, 8, 1, 2, 8, 10 };
		int targetSum = 8;
		System.out.println(findSmallestSum(arr, targetSum));
	}
}
