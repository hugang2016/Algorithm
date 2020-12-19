
public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		if (arr == null || arr.length == 0) {
			return ;
		}
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}	
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {66, -1, 77, 5, 103, 20};
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
