import java.io.*;

public class Exam05_08 {
	public static void main(String[] args) throws IOException {
		char[][] arr = new char[5][5];
		
		char alpha = 'A';
		int i,j ;
		//0,1으로 마름모 만들기 
		for (i=0; i<5; ++i) {
			for (j=0; j<5; ++j) {
				if (i==0||i==4) arr[i][2]=1;
				else if (i==1||i==3) for (j=1; j<4; ++j) arr[i][j]=1;
				else arr[i][j]=1;
			}
		//1에 알파벳 넣기
			for (int e=0; e<5; ++e) {
				for (int y=0; y<5; ++y) {
					if (arr[e][y]==1) {
						arr[e][y]= alpha;
						alpha++;
					}
				}
			}
		}for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				System.out.printf("%3c", arr[i][j]);
			}System.out.println();
	}
}}
