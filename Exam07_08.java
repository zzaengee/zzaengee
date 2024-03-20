class A08{
	private final int a = 10; //객체 생성시 값 할당, 객체 생성 구문이나 일반 구문에서 값 할당
							 //값 변경 불가
	private static int b;
	static {
		System.out.println("static 구문 실행");
	}
	{ 
		System.out.println("일반구문 () 실행"); 
	}
	public A08() {
		System.out.println("생성자 A08() 실행");
	}
	public A08(int a) {
		System.out.println("생성자 A08(int a) 실행");
	}
}
public class Exam07_08 {

	public static void main(String[] args) {
		A08 ap = new A08();
		A08 bp = new A08(100);
	}

}

/*
static 구문 실행
일반구문 () 실행
생성자 A08() 실행
일반구문 () 실행
생성자 A08(int a) 실행

*/
