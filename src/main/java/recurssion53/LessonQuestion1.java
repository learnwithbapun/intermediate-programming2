package recurssion53;


//SUM of n numbers 

public class LessonQuestion1 {
	
	public static  int sum(int n) {
		if(n <= 1) {
			return n;
		}
		
		
		return sum(n-1) + n;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(3));
	}

}
