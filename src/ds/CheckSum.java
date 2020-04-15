package ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckSum {
	public static void main(String[] args) {

		int[] input = { 4, 9, 5, 3, 7, 8, 1, 2 };
		
		int[] _input = {2, 7, 11, 15};
		System.out.println(Arrays.toString(checksumIndex(_input, 9)));
	}

	private static int checksum(int[] input, int target) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int j = 0; j < input.length; j++) {
			int complment = target - input[j];
			if (set.contains(complment)) {
				count++;
			} else {
				set.add(input[j]);
			}
		}
		return count;
	}

	private static int[] checksumIndex(int[] input, int target) {
		Map<Integer, Integer > map = new HashMap<>();
		int[] output =null;
		for (int j = 0; j < input.length; j++) {
			int complment = target-input[j];
			if(map.containsKey(complment)) {
				output =new int[] {map.get(complment), j};
			}
			else {
				map.put(input[j], j);
			}
		}
		return output;
	}

}
