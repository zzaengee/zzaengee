// 사용자 정의 자료형 - 멤버 필드, 멤버 메소드
/*
class Person {
		String name;
		int age;
		void disp() { System.out.print(name+"님의 나이는 "+age+"세입니다.");
}
Person p1->객체 = new Person()->생성자; -> 객체 생성
p1.name = "홍길동";
p2.age = 15;
p1.disp();
 */

//생성자
/*
 -객체를 만들때(생성할 때) 무조건 호출되는 메소드
 -클래스의 이름과 동일한 메소드
 -객체 생성시 불려가는 메소드로 변환형이 없다(void조차 없다)
 -멤버필드의 초기값을 넣어줄 때 사용
 -생성자를 정의하지 않으면 JVM이 알아서 생성자를 만든다 (매개변수도 없고, 내용도 정의되지 않은 생성자)
 -만약, 생성자를 정의하면, JVM은 생성자를 만들지 않고, 정의한 생성자만 가지고 있게 된다
 -메소드처럼 계속 호출하지 못하고 객체 생성시에만 사용한다
 -오버로딩이 가능하다 
 
 */
public class Exam06_10 {
	public static void main(String[] args) {

	}

}
