import java.util.Scanner;
public class bubblesort {
	public static void bubblesort(int [] arr, int size) {
		for(int i = 0;i<size;i++) {
			for(int j = 0;j<size-i-1;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i =0;i<size;i++) {
			int element = sc.nextInt();
			arr[i] = element;
		}
		bubblesort(arr,size);
	}

}