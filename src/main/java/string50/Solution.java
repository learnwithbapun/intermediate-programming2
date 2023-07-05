package string50;

public class Solution {
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
