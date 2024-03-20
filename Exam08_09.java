class A09 {
	int a,b;
	public A09() {
		a = 10;
		b = 20;
	}
}

class B09 extends A09 {
	int c;
	public B09() {
		c = 30;
	}
}
public class Exam08_09 {
	public static void main(String[] args) {
		//객체간의 연산은 대입연산만 가능
		// 1. 같은 클래스일때만 가능
		/*
		A09 ap = new A09();
		A09 bp = ap;
		
		ap.a = 100;
		System.out.println("ap.a = " +ap.a);
		System.out.println("bp.a = " +bp.a);
		//ap.a = 100
		//bp.a = 100
		*/
		 // 2. 상속관계일때만 가능
		/* 업캐스팅
		B09 ap = new B09();
		A09 bp = ap; //자식 생성자(객체값)으로 객체가 만들어 지는 것 : 업캐스팅
					 //업캐스팅된 부모객체는 자식클래스가 super로 지정하는 값만 접근 가능
		
		System.out.println("bp.a = " +bp.a);
		System.out.println("bp.b = " +bp.b);
		System.out.println("bp.c = " +bp.c); //-> 에러
		System.out.println("ap.a = " +ap.a);
		System.out.println("ap.b = " +ap.b);
		System.out.println("ap.c = " +ap.c);
		*/
		A09 ap = new B09();
		B09 bp = (B09)ap;
		//부모클래스의 생성자로 자식클래스의 객체가 만들어 지는 것 : 다운캐스팅
		// - 부모클래스의 생성자는 반드시 업캐스팅된 값이어야 한다.
		// - 자식클래스는 부모클래스의 멤버보다 크거나 같다. 따라서 강제형변환을 해야한다.
	}

}
