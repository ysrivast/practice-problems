package soltion;

public class MaxProfitSolution {

	public static void main(String[] args) {
		int[] input1 = { 11, 5, 8, 2, 9 };
		int[] input = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(input1));
	}

	private static int maxProfit(int[] input) {
		int maxprofit = 0;
		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				int profit = input[j] - input[i];
				if (profit > maxprofit) {
					maxprofit = profit;
				}
			}
		}

		return maxprofit;
	}
}
