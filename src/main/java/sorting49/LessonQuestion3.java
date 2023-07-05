package sorting49;

import java.util.Arrays;
import java.util.Comparator;

/*
 * SORT the data in the increasing order of the count of  factors.
 * and if number of factors are equal and sort them in basis of increasing order of their value.
 * 
 */
public class LessonQuestion3 implements Comparator<Integer> {

	public int countFactor(int A) {

		int count = 0;

		for (int i = 1; i * i <= A; i++) {

			if (A % i == 0) {
				if (i == A / i) {
					count++;
				} else {
					count += 2;
				}
			}

		}
		return count;
	}

	/*
	 * public int cmp(int x, int y) {
	 * 
	 * int cx = countFactor(x); int cy = countFactor(y); if (cx < cy) { return -1; }
	 * if (cx > cy) { return 1; } if (x <= y) { return -1; } else { return 1; }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Integer arr[] = { 2, 4, 2, 5, 36, 5 };
		
		Arrays.sort(arr,new LessonQuestion3() );

	}

	@Override
	public int compare(Integer x, Integer y) {
		int cx = countFactor(x);
		int cy = countFactor(y);
		if (cx < cy) {    
			return -1;
		}
		if (cx > cy) {
			return 1;
		}
		if (x <= y) {
			return -1;
		} else {
			return 1;
		}

	}
}
