//인터페이스 _ for 다중상속
/*- 클래스 종류 중 하나
 * 	- 멤버필드 : public static final 멤버필드만 가능 => 상수만 선언 가능
 *  - 멤버메소드 : public abstract 멤버메소드만 가능 => 추상메소드만 가능
 *  - 생성자 : 생성자는 없다
 *  - 중첩클래스 : static
 */	

interface A11{
	//인터페이스 안에서는 멤버필드에 public static final을 안붙혀도 JVM이 알아서 붙혀준다
	public static final int A = 10;
	public static int B = 20;
	public final int C = 30;
	int D = 40;
	//private int E = 50;
	public abstract void disp();
	abstract void disp2();
	public void disp3();// {	System.out.println("aaa"); }
	void disp4();
	
	//A11(){}
	
	static class Inner01{}	
	class Inner02{}
}
public class Exam08_11 {
	public static void main(String[] args) {
		System.out.println("a = " + A11.A);
		//A11.B = 100;
		A11.Inner02 ai = new A11.Inner02();
	}
}
