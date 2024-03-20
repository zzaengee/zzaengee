//익명 중첩 클래스 

class Outer04{
	public void disp() {
		System.out.println("저희 슈퍼는 회원 20%, 비회원은 10%의 세일을 합니다.");
	}
}

public class Exam08_04 {
	public static void main(String[] args) {
		Outer04 ot = new Outer04() {
			public void disp() { // 메소드 재정의 -> 메소드 오버라이딩
				System.out.println("저희 슈퍼는 회원 30%, 비회원은 20%의 세일을 합니다.");				
			}
		};
		ot.disp();
		
		Outer04 ot1 = new Outer04();
		ot1.disp();
	}

}
