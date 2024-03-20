//지정 예약어 -> 멤버의 성질 결정 
/*
1. class
	-static
	-final
	-abstract
2. 멤버 필드
	-static : 공용의, 공통의 -> 멤버를 클래스가 참조하는 모든 변수에게 공통으로 사용하도록 함
			  시작 시 메모리에 올라가서, this가 아닌 클래스 이름을 접근함.
	-final : 멤버가 메모리에 올라갈때 딱 한번 초기값을 주고 그 뒤에는 수정 불가
	-static final 또는 final static : 상수선언할 때 사용(변하지 않는 상수)
		-> public static final 멤버필드; -> 멤버 필드의 이름을 대문자로 작성
	-transient : file I/O나 network에서 멤버필드 전송할 때, 전송하지 않게 하는 예약어
3. 멤버 메소드
	-static : 시작시 메모리에 올라간다. static멤버만 사용 가능
	-fianl : 메소드는 재정의(오버라이드) 해서 사용할 수 있다. -> 상속관계에서, 무명중첩클래스에서 
	-static final
	-abstract (추상화) : 내용을 정의하면 안 된다. 추상 메소드라고 선언할 때 사용 
	-synchronized : 멀티스레드에서 해당 메소드에 다른 스레드가 접근했을 때 대기시키고 스레드가 일을 마친 후 접근 허용
	-native : JMI
		:자바(Java)로 만들어진 프로그램에서 해당 플랫폼에서만 실행 가능한 네이티브 코드(native code)에 
		접근하기 위해 만들어진 응용 프로그램 인터페이스(API). 해당 플랫폼만의 고유 기능을 이용할 수 있고, 
		다른 언어와 함께 공동의 프로젝트가 가능한 장점이 있지만 동작 환경이 해당 플랫폼에 제한된다는 단점이 있다.

 */
class Bank{
	private String name;
	private double money;
	static float iyul;
	static { iyul=0.03f; } //static 멤버만 static 구문을 만들고 초기값을 줄 수 있다.
	// static 멤버는 class 이름으로 접근함.
	
	public Bank(String name, double money, float iyul) {
		this.name = name;
		this.money = money;
		// static 멤버는 class 이름으로 접근함.
		//this.iyul = iyul;
		Bank.iyul = iyul;
	}
	public void setIyul(float iyul) {
		// static 멤버는 class 이름으로 접근함.
		//this.iyul = iyul;
		Bank.iyul=iyul;
	}
	public void disp() {
		System.out.println(name+"님의 잔액은"+money+"원이고 " +"현재이름은 "+ iyul*100+"입니다.");
	}
	
}

public class Exam07_07 {
	public static void main(String[] args) {
		
		System.out.print("현재 이율: " +Bank.iyul);
		//->일반 멤버는 객체를 생성할 때만 메모리에 저장되는데 static 멤버는 프로그램 시작시 메모리에 저장됨
		/*
		Bank aaa = new Bank("aaa", 1000.0, 0.023f);
		aaa.disp();
		
		Bank bbb = new Bank("bbb", 1000.0, 0.025f);
		//aaa.setIyul(0.025f);
		aaa.disp();
		bbb.disp();
		
		Bank ccc = new Bank("ccc", 1000.0, 0.02f);
		//aaa.setIyul(0.02f);
		aaa.disp();
		//bbb.setIyul(0.02f);
		aaa.disp();
		ccc.disp();
		*/
	}

}
