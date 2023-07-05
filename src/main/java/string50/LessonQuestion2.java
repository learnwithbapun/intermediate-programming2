package string50;


// Given a char[] which contains only lowercase letter . Sort the given char[] in alphabetical order

public class LessonQuestion2 {

	public static void sortString(char ch[]) {

	//AS size count of alphabets is 26
		int freq[] = new int[26];

		int n = ch.length;

		//storing all the character with index 
		for (int i = 0; i < n; i++) {
			int index = ch[i] - 'a';
			freq[index]++;
//			freq[ch[i]-'a']++;
		}

		
		int k = 0;
		for (char c = 'a'; c < 'z'; c++) {
			for (int i = 0; i < freq[c - 'a']; i++) {
				ch[k] = c;
				k++;

			}
		}
		
		//freq[c - 'a'] means count of value of that alphabet 

		for (int i = 0; i < freq.length; i++) {
			System.out.print(freq[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

	}

	public static void main(String[] args) {
		char ch1[] = { 'b', 'a', 'c', 'd', 'a', 'b', 'e', 'c' };
		sortString(ch1);
	}

}
