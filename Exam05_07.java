import java.io.*;

public class Exam05_07 {
	public static void main(String[] args) throws IOException{
		
		char[][] arr = new char[5][5];
		
		char alpha = 'A';
		
		for (int j=0; j<5; ++j) {
			if (j%2!=0) {
				for (int i=4; i>=0; --i) {
					arr[i][j]= alpha;
					alpha++;
				}
			}else {
				for (int i=0; i<5; ++i) {
					arr[i][j]= alpha;
					alpha++;
				}
			}
		}for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%3c", arr[i][j]);
			}System.out.println();
		}
	}
}
