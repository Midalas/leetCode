package leetCode;

public class leetCode621 {
	public static void main(String[] args) throws Exception {
		char[] tasks = { 'A', 'A', 'B' };
		int n = 5;

		int x = leastInterval1(tasks, n);
		System.out.println();
	}

	// fastest solution 6ms
	public static int leastInterval(char[] tasks, int n) {
		int k = 0, num = 0;
		int[] nums = new int[26];
		for (char i : tasks)
			nums[i - 'A']++;
		// 取最大值
		for (int i : nums) {
			k = k > i ? k : i;
		}
		// 最大值个数
		for (int i : nums)
			if (k == i)
				num++;
		int ret = (k - 1) * n + k + num - 1;

		return ret > tasks.length ? ret : tasks.length;
	}

	// runtime 70ms
	public static int leastInterval1(char[] tasks, int n) {
		int res = 0;
		// 统计每个字符个数
		int[] count = new int[27];
		// 当前字符等待时间
		int[] right = new int[27];
		for (int i = 0; i < tasks.length; i++) {
			count[tasks[i] - 'A']++;
		}
		bubbleSort(count);
		while (count[0] > 0) {
			int i = 0;
			// 找到第一个等待时间为0的元素
			while (i < 26 && right[i] > 0) {
				i++;
			}
			// 执行数量最多的任务
			if (right[i] == 0 && count[i] > 0) {
				count[i]--;
				right[i] += n + 1;
				int j = i;
				while (count[j] < count[j + 1]) {
					swap(count, j, j + 1);
					swap(right, j, j + 1);
					j++;
				}
			}
			// 等待时间-1
			for (int k = 0; k < 27; k++) {
				if (right[k] > 0)
					right[k]--;
			}

			res++;
		}
		return res;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
