package BinarySearch;

public class Leetcode1095 {

	public static void main(String[] args) {

	}

	static int search(int arr[], int target) {
		int peak = findPeakElement(arr);
		int firstTry = orderAgnoBS(arr, target, 0, peak);
		if (firstTry != -1) {
			return firstTry;
		}
		return orderAgnoBS(arr, target, peak + 1, arr.length - 1);
	}

	static int findPeakElement(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (nums[mid] > nums[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	static int orderAgnoBS(int arr[], int target, int start, int end) {

		boolean isAsc = (arr[start] < arr[end]);

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				}

				else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				}

				else {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

}
