
public class Exam06_02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		arr[0][2] = 1;
		
		int i,j ;
			for (i= 1; i<=4; ++i) {
				for (j=0; j<=4; ++j) {
					if (j==0) {
						arr[i][j] = arr[i-1][1];
					}else if (j==4) {
						arr[i][j] = arr[i-1][3];
					}else {
						arr[i][j]= arr[i-1][j-1]+ arr[i-1][j+1];
					}
				}
		}
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}

}
	
