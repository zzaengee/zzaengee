
public class Exam05_06 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int co =1;
		/*
		for (int j=0; j<=4; j++) { arr[0][j] = co; co++; }

		for (int i=1; i<=4; ++i) { arr[i][4] = co; co++; }

		for (int j=3; j>=0; --j) { arr[4][j] = co; co++; }
		
		for (int i=3; i>=1; --i) { arr[i][0] = co; co++; }
	
		for (int j=1; j<=3; ++j) { arr[1][j] = co; co++; }
		
		for (int i=2; i<=3; ++i) { arr[i][3] = co; co++; }
		
		for (int j=2; j>=1; --j) { arr[3][j] = co; co++; }
		
		for (int i=3; i<=2; --i) { arr[i][1] = co; co++; }
		
		for (int j=1; j<=2; ++j) { arr[2][j] = co; co++; }
		*/
		
		for(int k=0; k<=2; ++k){
			for(int i=k; i<=4-k; ++i){
				arr[k][i] = co;		co++;
			}
			for(int i=k+1; i<=4-k; ++i){
				arr[i][4-k] = co;		co++;
			}
			for(int i=4-k-1; i>=k; --i){
				arr[4-k][i] = co;		co++;
			}
			for(int i=4-k-1; i>=k+1; --i){
				arr[i][k] = co; 		co++;
			}
		}
	
		//출력
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}

}
