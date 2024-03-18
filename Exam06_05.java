import java.util.*;

public class Exam06_05 {
	public static void main(String[] args) {
		int i = inputnum();
		int j = inputnum();
		
		int result = compare(i, j);
		System.out.print(result);
	}

	
	public static int inputnum() {
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력: ");
		int a = s.nextInt();
		return a;
	}
	
	public static int compare(int n1, int n2) {
		if (abs(n1) > abs(n2)) return n1-n2;
		else return n2-n1;
	}
	
	public static int abs(int t) {
		if (t<0) return t*(-1);
		else return t;
	}
}
