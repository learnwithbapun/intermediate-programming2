package string50;

/*
 * 
 * 
 *Q4. Count Sort



Problem Description
Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 105


Input Format
The first argument is an integer array A.


Output Format
Return an integer array that is the sorted array A.


Example Input
Input 1:
A = [1, 3, 1]
Input 2:
A = [4, 2, 1, 3]


Example Output
Output 1:
[1, 1, 3]
Output 2:
[1, 2, 3, 4]


Example Explanation
For Input 1:
The array in sorted order is [1, 1, 3].
For Input 2:
The array in sorted order is [1, 2, 3, 4].
*/
public class Assignment4 {

	public int[] solve(int[] A) {

		int n = A.length;

		// Maximum element in ARRAY

		int max = A[0];
		for (int i = 0; i < n; i++) {
			if (A[i] > max) {
				max = A[i];

			}
		}

		// CREATING the FREQUENCY ARRAY

		int freq[] = new int[max + 1];

		for (int i = 0; i < n; i++) {
			freq[A[i]]++;
		}

		int k = 0;
		for (int l = 0; l <= max; l++) {
			for (int m = 0; m < freq[l]; m++) {
				A[k] = l;
				k++;
			}
		}

		return A;

	}
}
