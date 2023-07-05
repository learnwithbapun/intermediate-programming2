package recurssion53;

//WAP to print from 1to n using recurssion  
public class LessonQuestion4 {

	public static void printt(int n) {
		if (n == 1) {
			System.out.print(1+" ");
			return;
		}
		printt(n - 1);
		System.out.print(n+" ");

	}

	public static void main(String[] args) {
		printt(9);
	}

}
