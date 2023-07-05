package sorting49;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Q3. Factors sort

Problem Description
You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.

Note: You cannot use any extra space


Problem Constraints
1 <= N <= 104
1 <= A[i] <= 104


Input Format
First argument A is an array of integers.


Output Format
Return an array of integers.


Example Input
Input 1:
A = [6, 8, 9]
Input 2:
A = [2, 4, 7]


Example Output
Output 1:
[9, 6, 8]
Output 2:
[2, 7, 4]


Example Explanation
For Input 1:
The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.
For Input 2:
The number 2 has 2 factors, 7 has 2 factors and 4 has 3 factors.

 */
public class Assignment3 {
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
	    public int[] solve(int[] A) {

			   Integer[] arr = new Integer[A.length];
	        for (int i = 0; i < A.length; i++) {
	            arr[i] = A[i];
	        }

	         Arrays.sort(arr, new Comparator<Integer>() {
	            public int compare(Integer a, Integer b) {
					// in case of negetive  == the order will not change 
					// in case of positive  == the order will be reversed
					 
	                int fa = countFactor(a); // 6, 6 -- 4
	                int fb = countFactor(b); // 4,  8 -- 4
	                if(fa!=fb)
	                return fa-fb; // 2
	                else
	                return a-b; // 
	            }
	        });

			  // convert Integer[] to int[]
	int[] ans = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    ans[i] = arr[i];
	}
	     
		 return ans;
	    }
	}
