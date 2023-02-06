package selectionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for (int unsortedIndex = intArray.length - 1; unsortedIndex > 0; 
				unsortedIndex--) {
			int biggest = 0;
			
			for (int i = 1; i <= unsortedIndex; i++) {
				
				if (intArray[i] > intArray[biggest]) {
					biggest = i;
				}
				
			}
			swap(intArray,biggest,unsortedIndex);
		}
		System.out.println(Arrays.toString(intArray));

	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
