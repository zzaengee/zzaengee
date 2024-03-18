import java.util.*;
import java.io.*;

public class Exam05_05 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		char alpha = 'A';
		
		System.out.print("수를 입력 : ");
		int num = s.nextInt();
		char[][] arr = new char[num][num];
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				arr[i][j]=alpha;
				++alpha;
				if (alpha>'Z') {
					alpha='A';
				}
			}
		}
		for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				System.out.printf("%3c", arr[i][j]);
			}System.out.println();
		}
	}
}
