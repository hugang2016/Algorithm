
public class SelectionSort {
	public static void selectSort(int arr[]) {
		if (arr == null || arr.length == 0) {
			return ;
		}
		for (int i = 0; i < arr.length -1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				minIndex = arr[j] < arr[minIndex] ? j : minIndex;
			}
			swap(arr, i, minIndex);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int[] arr = {99, -1, 77, 5, 103, 20};
		selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
