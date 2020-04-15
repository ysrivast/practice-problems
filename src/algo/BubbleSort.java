package algo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = {81, 5, 1, 4, 2, 8}; 
			
//			{11,5,8,2,9};
		sort(input);
	}

	public static  void sort(int[] input) {

		for (int i = 0; i < input.length; i++) {
			int temp;
			for (int j = 0; j < input.length-i-1; j++) {
				if(input[j]>input[j+1]) {
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(input));
		}
	}
}
