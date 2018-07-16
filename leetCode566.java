
package leetCode;

public class leetCode566 {

	public static void main(String[] args) throws Exception {
		int[][] nums = { { 1, 2 }, { 3, 4 } };
		int r = 4;
		int c = 1;
		int[][] x = matrixReshape(nums, r, c);
		System.out.println();
	}

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int height = nums.length;
		int width = nums[0].length;
		if (height * width != r * c)
			return nums;
		int[][] res = new int[r][c];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int sum = i * width + j;
				res[sum / c][sum % c] = nums[i][j];
			}
		}
		return res;
	}
}
