
public class InsertSort {

	public static void insertSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = i-1; j >=0 && arr[j] > arr[j+1]; j--) {
				swap(arr, j, j+1);
			}
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {99, -1, 77, 5, 103, 20};
		insertSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
