/*
6. 중첩클래스
-일반중첩클래스		: 객체생성은 바깥클래스에서 생성 후 사용하거나 바깥클래스 객체를 만들고 그 객체명을 이용해서 객체 생성 
-static중첩클래스	: static중첩클래스를 객체로 만들때는 바깥클래스와 상관없이 독립적으로 만들어 사용
-지역중첩클래스		: 메소드 안에서 선언해서, 그 메소드 안에서만 사용 가능한 클래스
-익명(무명)중첩클래스 : 클래스를 객체화 할 때, 해당 클래스의 메소드 중 전부 또는 일부를 변경하고자 하면 그 변경된 내용을 가진
				  클래스가 임시로 만들어 지는데. 이 클래스가 익명중첩클래스가 된다.
 */

// 일반 중첩 클래스

class Outer01{
	private int a;
	private static int b;
	
	static {
		b=20;
	}
	
	public Outer01() {
		a=10;
	}
	
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	//일반 중첩 클래스
	class Inner01 {
		private int c;
		public Inner01() {
			c = 10;
		}
		public void disp2() {
			disp();		//바깥클래스의 멤버 사용 가능
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " +c);
		}
		class Inner01_in{
			
		}
	}
}
public class Exam08_01 {
	public static void main(String[] args) {
		Outer01 ot = new Outer01();
		ot.disp();
		Outer01.Inner01 oi = ot.new Inner01();
		//일반중첩클래스를 다른 클래스에서 사용할때는 바깥클래스를 먼저 생성하고.
		//그 생성된 객체명에서 일반중첩클래스 객체를 생성해야한다.
		oi.disp2();
	}

}
