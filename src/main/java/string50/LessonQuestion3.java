package string50;

// Given a char[] say whether it is a palindrome.

public class LessonQuestion3 {

	public static boolean checkPalindrome(char ch[]) {

		int fi = 0;
		int li = ch.length - 1;

		while (fi < li) {
			if (ch[fi] != ch[li]) {
				return false;
			}
			fi++;
			li--;
		}
		return true;
	}

	public static void main(String[] args) {
//		char ch[] = { 'b', 'a', 'd', 'a', 'm', 'b', 'e', 'c' };
		char ch[] = { 'r', 'a', 'd', 'a', 'r' };
		System.out.println((checkPalindrome(ch)));

	}

}
