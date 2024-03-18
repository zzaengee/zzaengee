// 클래스
/*
package -> 폴더안에 클래스 정의
import -> 해당 package나 class를 정의

접근제한자 지정예약어 class 클래스명
					extends 상위클래스 implements 상위인터페이스 {
			멤버필드;
			멤버메소드;
			생성자;
			중첩클래스;
}

*/

//멤버필드
/* 클래스 내부에서 선언되는 변수
 * 클래스 안에 메소드나 키타(중첩클래스) 다른곳에서 선언되는 변수는 아니다.
 */
//함수와 메소드의 차이점
/* 함수는 클래스 밖에서 선언, 메소드는 클래스 안에서 선언된다.
 * 함수는 독립적으로 사용이 가능하고, 메소드는 클래스에 종속되어 사용이 돤다.
 * 자바에서는 함수가 없다.
 */
//멤버메소드
/*
 public static void main ()
- 접근제한자 지정예약어 반환형 메스트명 (매개 변수) {
	return 반환값;
- 반환형 -> 메소드가 실행이 된 후, 나오는 값의 자료형
	- void -> 반환되는 값이 없다라고 알려주는 자료형
- 기본자료형 ;
- 사용자지정자료형 -class(String의 모든 클래스 )
- 메소드명 
- 반환값 -> 메소드가 실행된 후 나오는 값의 자료형
		-> 반환형이 void일때는 return을 적어도 되고, 안 적어도 된다.
		-> void가 아니면 반드시 해당 반환형에 맞는 return 값을 적어줘야한다.
- 매개변수 : 지역변수, 메소드 안에서만 사용 가능
- 메소드 오버로딩 -> 메소드의 이름이 같고, 매개변수가 틀린 메소들의 집합
			 -> 매개변수가 틀리다고 하는 것은 매개변수의 갯수 및 자료형까지 확인해서 비교한다.
- 재귀 호출 -> 메소드가 자신의 메소드를 호출하는 경우. 반드시 끝나는 지점을 설정해서 사용해야 한다.
                                                                                                   	
\ */

// 2개의 수를 입력받아 그 합을 구하는 프로그램

import java.util.*;
public class Exam06_03 {
	public static void main(String[] args) {
		int su1 = inputSu();
		int su2 = inputSu();
		int tot = sum(su1, su2);
		print(su1, su2, tot);
	}
	
		public static int sum(int a, int b) { //반환형이 있고, 매개변수가 없는 메소드 
			return a+b;
		}
		
		public static void print(int a, int b, int c) { // 반환형이 없고, 매개변수가 없는 메소드
			System.out.printf("%d + %d = %d\n", a, b, c);
		}
		
		public static int inputSu() { //반환형은 있고. 매개변수가 없는 메소드
			Scanner in = new Scanner(System.in);
			System.out.print("임의의 수를 입력 : ");
			int su = in.nextInt();
			return su;
	}

}
