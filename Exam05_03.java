
public class Exam05_03 {
	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		
		/*
		int co =25;
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j) {
				arr[i][j] = co;
				--co;
			}
		}
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j) {
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
		*/
		
		int co=1;
		for(int i=0; i<arr.length; ++i) {
			if (i%2==1) {
				for(int j=4; j>=0; --j) {
					arr[i][j] = co;
					++co;
				}
			}else {
				for(int j=0; j<5; ++j) {
					arr[i][j] = co;
					++co;
				}
			} 
		}
		
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j) {
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}
}
