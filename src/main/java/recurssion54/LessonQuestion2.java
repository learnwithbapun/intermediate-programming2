package recurssion54;

//GIVEN a , n find a to the power n using recurssion 
public class LessonQuestion2 {

	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();
		System.out.println(pow(12, 1234));
		long end1 = System.currentTimeMillis();
		System.out.println("For bruteforce " + (end1 - start1));

		long start2 = System.currentTimeMillis();
		System.out.println(pow2(12, 1234));
		long end2 = System.currentTimeMillis();
		System.out.println("For bruteforce " + (end2 - start2));
	}

	static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}

		return pow(a, n - 1) * a;
	}

	static int pow2(int a, int n) {
		if (n == 0) {
			return 1;
		}

		if (n % 2 == 0) {
			return pow2(a, n / 2) * pow2(a, n / 2);
		}

		return pow2(a, n / 2) * pow2(a, n / 2) * a;

	}
	

	// Optimise code

}
