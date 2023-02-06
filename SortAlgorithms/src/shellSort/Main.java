package shellSort;

import java.util.Arrays;

public class Main {

public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		
		for(int gap = intArray.length / 2; gap > 0; gap /= 2) {
			
			for(int i = gap; i < intArray.length; i++) {
				
				int temp = intArray[i];
				
				int j = i;
				
				while (j >= gap && intArray[j - gap] > temp) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}	
				
				intArray[j] = temp;
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
