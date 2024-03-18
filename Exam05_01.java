import java.io.*;

public class Exam05_01 {

	public static void main(String[] args) throws IOException{
		// 랜덤 숫자 3개 입력받기
		int[] ran = new int[3];
		for (int j=0; j<3; ++j) {
			ran[j] = (int)(Math.random()*9)+1;
			for (int k=0; k<3; ++k) {
				if (ran[j]==ran[k]) {
					--j;
					break;
				}
			}
		}
		
		//랜덤숫자와 입력숫자 비교하기
		while (true) {
			int strike =0;
			int ball =0;
			
			//숫자 3개 입력받기 
			int[] num = new int[3];
			
			System.out.print("수를 입력: ");
			for (int i=0; i<3;++i) {
				num[i]= System.in.read() - 48;
			}System.in.skip(5);
	
			for (int q=0; q<3; ++q) {
				for (int w=0; w<3; ++w) {
					//스트라이크
					if (ran[q]==num[w] && q==w) {
						++strike;
					//볼
					}else if (ran[q]==num[w] && q!=w) {
						++ball;
				}
			}
				if (strike==3) {
					break;
				}else if (strike==0 && ball==0) {
					System.out.println("out");
				}else {
					System.out.printf("%dS %dB\n", strike, ball);
				}
		}
		}
	}}
