// 다형성
/*-멤버필드에 대한 규칙
 * 	-상속관계에서 객체는 대입연산이 가능하다.
 * 	- 업캐스팅: 자식의 생성자로 부모의 객체를 완성시키는 것
 * 			  업캐스팅이 되어도 자식이 만든 멤버필드에는 접근이 불가, 
 * 			  자식클래스에서 super로 접근 가능한 멤버만 사용 가능
 * 	- 다운캐스팅: 부모의 객체가 업캐스팅 되어 있다면, 그 객체로 자식클래스에 객체를 대입연산으로 만들수있음
 * 				이때 자식클래스로 형변환을 해줘야 한다.
 * 
 * -멤버 메소드에 대한 규칙
 * 	- 실제적으로 다형성이라고 부르는 이유
 *  - 업캐스팅된 객체의 메소드 중에 만약 자식이 오버라이드했다면 자식의 메소드를 실행시킨다.
 */
//추상화
/* - 멤버메소드를 선언만 하고, 정의하지 않다. 기존 메소드와 구별이 필요하고 키워드로 abstract
 * - 클래스 안에 추상메소드가 한개라도 있다면 그 클래스는 추상클래스라하고 class에도 abstract
 * - 추상클래스는 생성자를 가지지 않는다. (즉, 객체를 생성할 수 없다)
 * - 추상클래스 객체는 익명중첩클래스를 이용하여 추상메소드를 오버라이드하거나
 *   상속을 받게 해서 상속받은 클래스에서 그 메소드를 오버라이드해줘야한다. 
 */
import java.util.*;

abstract class Protoss{
	public abstract void attack() ;
	public abstract void move() ;
}
class Zelot extends Protoss{
	public void attack() {
		System.out.println("질럿이 공격을 합니다.");
	}
	public void move() {
		System.out.println("질럿이 이동을 합니다.");
	}
}
class Dragon extends Protoss{
	public void attack() {
		System.out.println("드래곤이 공격을 합니다.");
	}
	public void move() {
		System.out.println("드래곤이 이동을 합니다.");
	}
}
public class Exam08_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Protoss pro;
		
		System.out.print("1.질럿 2.드래곤 : ");
		int select1 = in.nextInt();
		System.out.print("1.공격 2.이동 : ");
		int select2 = in.nextInt();
		
		if (select1==1) {
			pro = new Zelot();
		}else {
			pro = new Dragon();
		}
		if (select2==1) {
			pro.attack();
		}else {
			pro.move();
		}
	}
}










