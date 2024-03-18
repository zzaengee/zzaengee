//재귀 호출 -> 끝나는 지점 지정 필수
public class Exam06_06 {
	public static void main(String[] args) {
		int res = sum(10);
		System.out.println("1~10까지의 합: " + res);
	}
	
	public static int sum(int a) {
		if (a == 5) return a;
		return a+ sum(a+1);
	}
}
