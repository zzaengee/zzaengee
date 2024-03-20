
class A07{
	int a;
	int b;
	public A07(int k) {
		a = 10;
		b = 20;
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
class B07 extends A07{ 
	int c;
	int b;
	
	public B07() {
		super(1); //부모클래스의 생성자를 호출 -> A07 호출
		c = 30;
		b = 100;
	}
	public B07(int k) {
		this(); //super()와 같이 쓸 수 없음.
	}
	public void disp() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

public class Exam08_07 {
	public static void main(String[] args) {
		B07 ap = new B07();
		ap.disp();
	}
}
