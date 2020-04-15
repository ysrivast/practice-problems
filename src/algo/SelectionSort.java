package algo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input = { 11, 5, 8, 2, 9 };
		sort(input);
	}

	public static void sort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int index = i, temp;
			for (int j = i + 1; j < input.length; j++) {
				if(input[j]<input[index]) {
					temp = input[j];
					input[j]=input[index];
					input[index]= temp;
				}
			}
			System.out.println(Arrays.toString(input));
		}
	}

}
