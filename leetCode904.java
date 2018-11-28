package leetCode;

public class leetCode904 {
	public static void main(String[] args) throws Exception {
		int[] tree = { 1, 1 };
		int x = totalFruit(tree);
		System.out.println();
	}

	//runtime 12ms
	public static int totalFruit(int[] tree) {
		int res = 0;
		int start = 0;
		while (start < tree.length - 1) {
			if (tree[start] != tree[start + 1]) {
				int left = start;
				int right = start + 1;
				while (left >= 0 && (tree[left] == tree[start] || tree[left] == tree[start + 1])) {
					left--;
				}
				while (right < tree.length && (tree[right] == tree[start] || tree[right] == tree[start + 1])) {
					right++;
				}
				res = right - left - 1 > res ? right - left - 1 : res;
				start = right - 1;
			} else {
				start++;
			}
		}

		return res == 0 ? tree.length : res;
	}

}
