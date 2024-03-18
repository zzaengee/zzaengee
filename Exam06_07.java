
public class Exam06_07 {

	public static void main(String[] args) {

		System.out.print(factorial(5));
		System.out.println();
		System.out.print(factorial(10));
		System.out.println();
		System.out.print(factorial(15));
		System.out.println();
	}
	
	public static int factorial(int a) {
		if (a==1) return a; 
		return a = a * factorial(a-1);
		
	}
}
