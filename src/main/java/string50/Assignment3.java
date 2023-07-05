package string50;


/*
 * 
 * 
 * Q3. Toggle Case


Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.

You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.



Problem Constraints
1 <= N <= 105

A[i] ∈ ['a'-'z', 'A'-'Z']



Input Format
First and only argument is a character string A.



Output Format
Return a character string.



Example Input
Input 1:

 A = "Hello" 
Input 2:

 A = "tHiSiSaStRiNg" 


Example Output
Output 1:

 hELLO 
Output 2:

 ThIsIsAsTrInG 


Example Explanation
Explanation 1:

 'H' changes to 'h'
 'e' changes to 'E'
 'l' changes to 'L'
 'l' changes to 'L'
 'o' changes to 'O'
Explanation 2:

 "tHiSiSaStRiNg" changes to "ThIsIsAsTrInG".
*/
public class Assignment3 {

	public String solve(String A) {
		char ch[] = A.toCharArray();
		int n = ch.length;
		for (int i = 0; i < n; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] += 32;
			} else {
				ch[i] -= 32;
			}
		}
		return new String(ch);
	}
	
	/*
	 *  int n = A.length();
        char ch[]= A.toCharArray();


        for(int i=0; i < n; i++){
          ch[i] = (char)(ch[i]^(1 << 5));
        }

        return new String(ch);
    }
}

	 */

}
