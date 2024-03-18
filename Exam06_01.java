
public class Exam06_01 {
	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char co = 'A';
		int i=0, j=2;
		int stepI = 1, stepJ = -1;
		//최소치
		int k = 0;
		while(true) {
			//System.out.printf("[%d , %d]\n", i, j);
			arr[i][j] = co++;
			i += stepI;
			j += stepJ;
			//if (i==0+k) stepI = 1;
			if (i==4-k) stepI = -1;
			if (j==0+k) stepJ = 1;
			if (j==4-k) stepJ = -1;
			if (arr[i][j] != 0) {
				k++;
				i = k;
				j = 2;
				stepI = 1;
				stepJ = -1;
				if (k==2) {
					arr[i][j] = co;
					break;
				}
			}
			
		}
		
		for(i=0; i<5; ++i) {
			for(j=0; j<5; ++j) {
				if (arr[i][j] == 0) System.out.print("\t");
				else System.out.print((char)arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
