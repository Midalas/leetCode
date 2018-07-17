
package leetCode;

public class leetCode122 {

	public static void main(String[] args) throws Exception {
		int[] price = { 7, 1, 5, 3, 6, 4 };
		int x = maxProfit(price);

		System.out.println();
	}

	public static int maxProfit(int[] prices) {
		int sum = 0;
		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - prices[i - 1];
			if (profit > 0) 
				sum += profit;
		}
		return sum;
	}

}
