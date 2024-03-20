import java.util.*;
import java.io.*;

class Lotto {
	Scanner s ;
	int[] lotto = new int[6];
	int select[] = new int[6];
	
	Lotto() {
		
	}
	
	//로또 입력
	void lottoinput() {
		s= new Scanner(System.in);
	}
	//로또 자동 생성
	void lottoauto() {
		
	}
	// 종료
	void lottoexit() {
		
	}
}
public class Exam07_04 {
	public static void main(String[] args) throws IOException {
		Lotto lotto = new Lotto();
		
		System.out.print("1.입력 2.자동 3.종료");
		int select = System.in.read() - 48;
		System.in.skip(5);
		
		switch(select) {
		case 1: lottoinput(); break;
		case 2: lottoauto(); break;
		case 3: lottoexit(); break;
		default : System.out.print("잘못입력했습니다.");
		}
	}

}
