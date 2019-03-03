package sorting;

public class MergeSort {

	public void mergeSort(int[] array) {
		int[] helper = new int[array.length];
		mergeSort(array, 0, array.length - 1, helper);
	}

	void mergeSort(int[] array, int start, int end, int[] helper) {
		if (start < end) {
			int mid = ((end + start) / 2);
			mergeSort(array, start, mid, helper);
			mergeSort(array, mid + 1, end, helper);

			int index3 = start;
			while (index3 <= end) {
				helper[index3] = array[index3];
				index3++;
			}

			int index1 = start;
			int index2 = mid + 1;
			index3 = start;
			while (index1 <= mid && index2 <= end) {
				if (helper[index1] <= helper[index2]) {
					array[index3++] = helper[index1++];
				} else {
					array[index3++] = helper[index2++];
				}
			}

			while (index1 <= mid) {
				array[index3++] = helper[index1++];
			}
		}
	}
}
