/*
class Person{
}
class Student extends Person{ //상속관계
	}
class Police extends Person{
	Student s = new Student(); //포함관계
}
*/
class A06{
	int a = 10;
	public void disp() {
		System.out.println("a = " +a);
	}
}
class B06 {
	int b= 20;
	A06 ap = new A06();
	public void disp2() {
		System.out.println("a = " +ap.a);
		System.out.println("b = " +b);
	}
}
class C06{
	int c = 30;
	B06 bp = new B06();
	public void disp3() {
		System.out.println("a = " + bp.ap.a);
		System.out.println("b = " + bp.b);
		System.out.println("c = " + c);
	}
}
public class Exam08_06 {

	public static void main(String[] args) {

	}

}
