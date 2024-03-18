//배열
public class Exam05_02 {

	public static void main(String[] args) {
		int arr[][]= new int[2][2];
		
		int co =1;
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j) {
				arr[i][j] = co;
				++co;
			}
		}
		
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
