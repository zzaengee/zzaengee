//static중첩클래스

class Outer02 {
	private int a;
	private static int b;
	
	static {
		b=20;
	}
	
	public Outer02() {
		a=10;
	}
	
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static class Inner02 {
		private int c;
		public Inner02() {
			c = 10;
		}
		public void disp2() {
			//System.out.println("a = " + a); -> 바깥클래스의 static 멤버만 사용 가능
			System.out.println("b = " + b);
			System.out.println("c = " +c);
		}
		class Inner01_in{
			
		}
	}
}

public class Exam08_02 {

	public static void main(String[] args) {
		Outer02.Inner02 oi = new Outer02.Inner02();
	}

}
