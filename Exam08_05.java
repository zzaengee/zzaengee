/*상속 : extends 
- Object : 모든 클래스는 Object 클래스를 상속받고 있다.
- toString
- 상속 관계, 포함 관계
- super, super()
- 오버라이드
- 메소드에서 final을 사용하는 경우
- 클래스에서 final을 사용하는 경우
 */

//* document(API)
//* 자바에서 생략가능한 코드
/* 
- import java.lang.*
- default 생성자 
- this 예약어
- 0번째 매개변수( 직접 쓰면 안됨 )
- 접근제한자 package는 쓰지 않는다. -> default
- extends Oject
- 객체명.toString() -> 객체명만 써도 가능 
	ex) String a = "aaa"; a출력하면 aaa 출력 -> a.toString
- super() :
 */

// 자바 클래스는 Object 클래스를 상속 받고 있음.
class A05 extends Object{
	public String toString() {
		return "A05클래스입니다." ;
	}
	
}
public class Exam08_05 {

	public static void main(String[] args) {
		A05 ap = new A05();
		
		System.out.println("ap.getClass = " + ap.getClass());
		System.out.println("ap.toString = " +ap.toString());
		System.out.println("ap = "+ ap);
		
		/*
		 	ap.getClass = class A05
			ap.toString = A05클래스입니다.
			ap = A05클래스입니다.  -> 객체 뒤 toString이 자동으로 붙음

		 */
	}

}
