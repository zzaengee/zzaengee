class A02 {
	int a;
	int b;
	int c;
	int d;
	void disp() {
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	A02() {
		a=10;
		b=20;
	}
	
	A02(int a) {
		//System.out.println("aaa");
		this(); //매개변수 없는 생성자를 호출 단 생성자의 첫줄에서만 사용 가능
		this.a=a;
	}

	A02(int a, int b) {
		this(a);
		this.b = b; //this : 멤버라고 알려주는 키워드, 생략 가능(단, 매개변수와 동일하면 반드시 작성 )
	}
}

public class Exam07_02 {
	public static void main(String[] args) {
		A02 ap = new A02(); // 객체 생성
		A02 bp = new A02(100, 200);
		
		ap.disp();
		bp.disp();
	}

}
