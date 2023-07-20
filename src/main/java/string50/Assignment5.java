package string50;

/*
 Q5. Simple Reverse
Solved
feature icon
Using hints is now penalty free
Use Hint
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.
*/
public class Assignment5 {

	public static String solve(String A) {

		int n = A.length();

//      String res = "";
//FIRST APPROACH // TLE as concatination take O(n)  TC, so intotal it is O(n2)
//Time complexity O(n*n)
//      for(int i = n-1; i >=0; i--){
//          res+=A.charAt(i);
//      }
//      return res;

//SECOND APPROACH
//StringBuilder res = new StringBuilder();
//// Time complexity O(n*1)
//for(int i=n-1; i >= 0; i--){
//   res= res.append(A.charAt(i));
//}

//return res.toString();
		char arr[] = A.toCharArray();

		int si = 0;
		int li = n - 1;
		while (si < li) {
			char temp = arr[si];

			arr[si] = arr[li];
			arr[li] = temp;
			si++;
			li--;
		}

		return new String(arr);

	}

	public static void main(String[] args) {
		System.out.println(solve("scalar"));
	}
}
