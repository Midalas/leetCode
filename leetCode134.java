
package leetCode;

public class leetCode134 {

	public static void main(String[] args) throws Exception {
		int[] gas = { 2, 3, 4 };
		int[] cost = { 3, 4, 3 };

		int x = canCompleteCircuit(gas, cost);
		System.out.println("");
	}

	//runtime 0ms
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int start = 0;
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < gas.length; i++) {
			count1 += gas[i];
			count2 += cost[i];
			sum += gas[i] - cost[i];
			if (sum < 0) {
				sum = 0;
				start = i + 1;
			}
		}
		if (count1 < count2)
			return -1;
		return start;
	}

}
