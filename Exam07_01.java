
public class Exam07_01 {
	public static void main(String[] args) {
		int co = 0;
		int i = 1;
		//int j = 1;
		while(i<=10) {
			System.out.println("i = " + i);
			if (i == 5) {
				continue;//while문에서 continue를 만나면 조건식으로 이동한다.
			}
			i++;
		}
		/*
		//for문은 ( ; ; ) {} 이렇게 초기값, 조건식, 증감식 모두 공백을 사용할 수 있다.
		for(; i<=10; ++i) {		//초기값만 공백을 사용할 수 있다.
			//마찬가지로, 조건식만, 증감식만.. 가각 공백으로 처리할 수도 있다.
			for(j=1; j<=10; ++j) {
				if (i == j) {
					continue;//for문에서 continue를 만나면 증감식으로 이동
				}
				if (i==5 && j==5) {
					break;
				}
				co++;
				System.out.printf("%d %d %d\n", i,j,co);
			}
			if (j==5 && i==5) {
				break;
			}
		}
		
		System.out.println("co = " + co);
		*/
	}

}
