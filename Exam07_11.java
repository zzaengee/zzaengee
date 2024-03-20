class A10{
	public void disp() {
		System.out.println("A10 클래스의 disp 메소드");
	}
	public void disp2() {
		disp();
		System.out.println("A10클래스의 disp2 메소드 ");
	}
}
public class Exam07_11 {
	public static void main(String[] args) {
		for(int i=0; i<args.length; ++i) {
			System.out.println(args[i]);
		}
		A10 ap =new A10();
		ap.disp(); // 객체 선언했기 때문에 사용가능

		star(); //메인메소드에서 사용할 수 있는 메소드는 static 메소드 뿐
		
	}
	
	public static void star() {
		System.out.println("*****");
	}

}
