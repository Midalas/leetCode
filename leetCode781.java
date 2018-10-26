package leetCode;

public class leetCode781 {
	public static void main(String[] args) throws Exception {
		int[] answers = { 0, 0, 1, 1, 1 };
		int x = numRabbits(answers);
		System.out.println();
	}

	//runtime 7ms
	public static int numRabbits(int[] answers) {
		int res = 0;
		int[] count = new int[1000];
		for (int i = 0; i < answers.length; i++) {
			count[answers[i]]++;
		}
		res += count[0];
		for (int i = 1; i < 1000; i++) {
			if (count[i] > 0) {
				if (count[i] <= i + 1) {
					res += i + 1;
				} else {
					res += (i + 1) * (Math.ceil(count[i] / (i + 1.0)));
				}
			}
		}
		return res;
	}
	
}

// [3,3,3,3,3];