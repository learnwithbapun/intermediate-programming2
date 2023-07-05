package recurssion53;
//WAP to print fibonaci series  
public class LessonQuestion3 {
	
	public static  int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		int n1 = fibo(n-1) + fibo(n-2);
		
		return n1;
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(7));
	}

}
