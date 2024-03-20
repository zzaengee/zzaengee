// 접근제한자: 해당하는 멤버나 클래스에 접근하는 범위를 지정
/* -
 private : 같은 클래스 안에서만 접근 가능
 default : package, 적지 않는다. 같은 package 내에서 접근 가능
 protected : 상속관계에서는 public처럼, 상속관계가 아닐때는 default처럼 접근 가능
 public : 어디서든 접근가능( 접근허용자 )
 */

//객체지향언어(OOP) - 은닉화, 상속성, ...
// 은닉화: 멤버를 private오르 만드는 것(외부에서 접근하지 못하게 하는 것)
// prtivate 멤버필드는 setter 메소드와 getter 메소드를 이용하여 간접 접근 허용 -> 캡슐화

/*setter 메소드
 public void setName(String name) {
 	this.name = name;
 }
 */

/*getter 메소드
 public String getName() {
 	return name;
 */

import test.*;

class A01 extends test01{
	void disp() {
		System.out.println("b = " + b);
		//System.out.println("a = " + a); // 상속을 받았지만 private이기 때문에 사용 불가
	}
}

public class Exam07_06 {
	public static void main(String[] args) {
		test01 t1 = new test01();

	}

}
