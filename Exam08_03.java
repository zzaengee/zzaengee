//지역중첩 클래스

class Outer03 {
	private int a;
	private static int b;
	
	static { b=20; }
	
	public Outer03() { a=10; }
	
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	class Inner03 {
		private int c;
		public Inner03() {
			c = 10;
		}
		public void disp_in() {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " +c);
		}
	}
}
public class Exam08_03 {

	public static void main(String[] args) {


	}

}
