package p1;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of values you want in an array..");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the values into array to be sorted using the Quick sort..");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		quickSort(a, 0, a.length - 1);
		System.out.println("Final sorted array:");
		for (int i = 0; i < n; ++i)
			System.out.print(a[i] + " ");
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int pindex = (low); // index of smaller element
		for (int i = low; i < high; i++) {
			// If current element is smaller than the pivot
			if (arr[i] < pivot) {
				// swap arr[i] and arr[i]
				int temp = arr[pindex];
				arr[pindex] = arr[i];
				arr[i] = temp;
				pindex++;
			}
		}
		int temp = arr[pindex];
		arr[pindex] = arr[high];
		arr[high] = temp;

		return pindex;
	}

}
