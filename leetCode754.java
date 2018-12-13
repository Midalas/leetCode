package leetCode;

public class leetCode754 {
	public static void main(String[] args) throws Exception {

		int target = 18;
		int x = reachNumber(target);
		System.out.println();
	}

		
	//runtime 9ms
	public static int reachNumber(int target) {
		if (target < 0)
			target = -target;
		int sum = 0;
		int i = 1;
		while (sum < target) {
			sum += i++;
		}
		if ((sum - target) % 2 == 0) {
			return i - 1;
		} else {
			if ((sum + i - target) % 2 == 0) {
				return i;
			} else {
				return i + 1;
			}

		}
	}

}
