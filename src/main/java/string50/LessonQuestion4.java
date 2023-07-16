package string50;

// Given a String calculate the length of longest Palindrome  substring.

public class LessonQuestion4 {

	public static int checkPalindrome(char ch[]) {

		// ODD LENGTH SUBSTRING
		int n = ch.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int len = expand(ch, i, i);
			max = Math.max(max, len);
		}

		// EVEN LENGTH SUBSTRING

		for (int i = 0; i < n - 1; i++) {
			int len = expand(ch, i, i + 1);
			max = Math.max(max, len);
		}

		return 0;
	}

	private static int expand(char[] ch, int i, int i2) {
		int n = ch.length;
		while (i >= 0 && i2 < n && ch[i] == ch[i2]) {
			i--;
			i2++;

		}

		return (i2 - i - 1);
	}

	public static void main(String[] args) {
		char ch[] = { 'x', 'b', 'd', 'y', 'z', 'z', 'y', 'd', 'b', 'd', 'b', 'd', 'y', 'z', 'y', 'd', 'x' };
		System.out.println(ch.length);
		System.out.println(checkPalindrome(ch));

	}

}
