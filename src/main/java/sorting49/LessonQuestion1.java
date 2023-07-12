package sorting49;

import java.util.Arrays;

/*
 * Array of n integers , you have to delete all the element of the array , for each deletion you have to pay the cost of it.
 *  find the minimum cost possible
 * 
 */
public class LessonQuestion1 {
	
	public static void main(String[] args) {
		int arr[] = { 2, 4, 2, 5, 36, 5 };
		deleteElement(arr);

	}

	public static int[] reverseArr(int arr[]) {

		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void deleteElement(int arr[]) {

		Arrays.sort(arr);// Ascending order TC - nlogn
		// Reverse the array : // O(n)
		reverseArr(arr);
		int n = arr.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += arr[i] * (i + 1);
		} // O(n)

	}

}
