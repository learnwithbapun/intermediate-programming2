package string50;

// Given a char[] , toggle every character.(Assume that it contains only letter)

public class LessonQuestion1 {

	public static void toggle(char ch[]) {

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] += 32;
			} else {
				ch[i] -= 32;
			}
		}

	}

	public static void main(String[] args) {
		char ch[] = { 'B', 'a', 'c', 'd', 'a', 'b', 'e', 'c' };

		toggle(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
	}

}
