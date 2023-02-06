package insertionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int i = 1; i < intArray.length; i++) {
			for(int j = 0; j < i; j++) {
				if(intArray[j] > intArray[i]) {
				swap(intArray, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(intArray));

	}
	
	public static void swap(int[] array,int i, int j) {
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
