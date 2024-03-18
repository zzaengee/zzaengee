class Person{
	// 멤버필드 : 선언부
	String name;
	int age;
	// 멤버메소드 : 기능, 실행부
	Person(String n, int a){
		name = n;
		age = a;
	}
	void disp() {
		System.out.println(name+"님의 나이는 " + age + "세 입니다.");
	}
}


public class Exam06_11 {
	public static void main(String[] args) {
//		int a;
//		int[] arr = new int[5];//변수 5개가 선언된거와 같은 효과
		Person p1;
//		p1.name = "홍길동";	- 오류발생!! p1객체를 생성하지 않았다.
		p1 = new Person();	//Person()생성자를 이용하여 p1객체를 생성하였다.
		p1.name = "홍길동";
		p1.age = 20;		//객체가 생성되면 해당 멤버에 참조연산자 . 을 이용하여 접근한다
		p1.disp();		
		
		Person p2 = new Person("유재석", 55);
		p2.disp();
	}
}
