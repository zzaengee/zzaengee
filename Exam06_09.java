
public class Exam06_09 {
	public static void main(String[] args) {
	
	pb(20);
	}
	
	public static void pb(int a) {
		int arr[] = new int[a];
		arr[0] =1;
		arr[1] =1;
		System.out.printf("%d %d ",arr[0], arr[1]);
		
		for (int i=2; i<a; i++) {
			arr[i] = arr[i-1]+ arr[i-2];
			System.out.print(arr[i]+ " ");
		}
	}
}
