//홀수 마방진 만들기

public class Exam05_04{
	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		
		int co = 1;
		int i = 0;//행
		int j = 2;//열			//1번조건
		
		while(true) {
			arr[i][j] = co;
			if (co == 25) {
				break;
			}
			int oldI = i;
			int oldJ = j;			
			i--;	j++;		//2번조건
			if (i<0) { i=4; }	//3번조건
			if (j>4) { j=0; }	//4번조건
			if (arr[i][j] != 0) {//5번조건
				i = oldI;
				j = oldJ;
				i++;
			}
			co++;
		}
		
		for(i=0; i<5; ++i) {
			for(j=0; j<5; ++j) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}	
