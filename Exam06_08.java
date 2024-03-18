import java.util.*;

public class Exam06_08 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("2의 n승 값 입력: ");
	int num = s.nextInt();
	System.out.print(multi(num));
	}
	
	public static int multi(int a) {
		if (a==0) return 1;
		return 2*multi(a-1);
	}
}
