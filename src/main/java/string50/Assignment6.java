package string50;

/*
 Q6. Reverse the String
Solved
feature icon
Using hints is now penalty free
Use Hint
Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
A = "the sky is blue"
Input 2:
A = "this is ib"


Example Output
Output 1:
"blue is sky the"
Output 2:
"ib is this"    
*/
public class Assignment6 {

	public static String solve(String A) {

		A = A.trim();
		String arr[] = A.split(" ");
		int n = arr.length;

		int si = 0;
		int li = n - 1;

		while (si < li) {
			String temp = arr[si];
			arr[si] = arr[li];
			arr[li] = temp;
			si++;
			li--;
		}

		String res = "";
		for (int i = 0; i < n; i++) {

			if (i != n - 1) {
				res += arr[i] + " ";
			} else {
				res += arr[i]; // TO Handle one last space
			}

		}
		return res;
	}

	public static void main(String[] args) {
		String abc = solve("My name is Bapun");
		System.out.println();
		System.out.println(abc);
	}

}
