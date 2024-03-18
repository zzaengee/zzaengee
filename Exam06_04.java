import java.util.*;
import java.io.*;

public class Exam06_04 {
	public static void main(String[] args) throws IOException {
		int su1 = inputSu();
		int su2 = inputSu();
		System.out.print("산술연산자를 입력 : ");
		char op = (char)System.in.read();
		int res = 0;
		switch(op) {
		case '+' : res = sum(su1, su2); break;
		case '-' : res = min(su1, su2); break;
		case '*' : res = mul(su1, su2); break;
		case '/' : res = div(su1, su2); break;
		case '%' : res = mod(su1, su2); break;
		default :
			System.out.println("산술연산자만 가능합니다.");
			System.exit(0);
		}
		
		System.out.printf("%d %c %d = %d\n",su1, op, su2, res);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int min(int a, int b) {
		if (a>b) return a-b;
		else return b-a;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		if (b==0) b = 1;
		return a/b;
	}
	public static int mod(int a, int b) {
		if (b==0) b = 1;
		return a%b;
	}
	
	public static int inputSu() {
		Scanner in = new Scanner(System.in);
		System.out.print("임의의 수를 입력 : ");
		int su = in.nextInt();
		return su;
	}
}
