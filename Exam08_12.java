class A12{}
interface B12{}

//클래스는 클래스를 상속받을 수 있다
class C12 extends A12{}
//클래스는 인터페이스를 상속받을 수 있다
class D12 implements B12{}
//클래스는 클래스를 상속받고 인터페이스를 상속받을 수 있다
class E12  extends A12 implements B12{}
//인터페이스는 인터페이스를 상속받을 수 있다
interface F12 extends B12{}
//인터페이스는 인터페이스를 다중상속받을 수 있다
interface G12 extends B12, F12{}
//인터페이스는 클래스를 상속받을 수 없다!
//클래스는 인터페이스를 다중 상속받을 수 있다
class H12 implements B12, F12{}
//클래스는 클래스를 상속받고, 인터페이스를 다중 상속받을 수 있다.
class I12 extends A12 implements B12, F12, G12{}

public class Exam08_12 {
	public static void main(String[] args) {

	}

}
