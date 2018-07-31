
package leetCode;

public class leetCode661 {

	// 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，
	// 平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
	//
	// 示例 1:
	//
	// 输入:
	// [[1,1,1],
	// [1,0,1],
	// [1,1,1]]
	// 输出:
	// [[0, 0, 0],
	// [0, 0, 0],
	// [0, 0, 0]]
	// 解释:
	// 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
	// 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
	// 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
	// 注意:
	//
	// 给定矩阵中的整数范围为 [0, 255]。
	// 矩阵的长和宽的范围均为 [1, 150]。

	public static void main(String[] args) throws Exception {
		int[][] M = {
				{  1,  2,  3,  4 }, 
				{  5,  6,  7,  8 }, 
				{  9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }
				};
		int[][] x = imageSmoother(M);
		System.out.println();
	}
	//runtime 25ms
	public static int[][] imageSmoother(int[][] M) {
		int hei = M.length;
		int wid = M[0].length;
		int[][] res = new int[hei][wid];
		for (int i = 0; i < hei; i++)
			for (int j = 0; j < wid; j++)
				if (i > 0 && i < hei - 1 && j > 0 && j < wid - 1) {
					res[i][j] = (M[i - 1][j - 1] + M[i - 1][j] + M[i - 1][j + 1] + M[i][j - 1] + M[i][j]
							+ M[i][j + 1] + M[i + 1][j - 1] + M[i + 1][j] + M[i + 1][j + 1]) / 9;
				} else {
					res[i][j] = getAverangePixl(M, i, j, hei, wid);
				}
		return res;
	}

	private static int getAverangePixl(int[][] M, int i, int j, int hei, int wid) {
		int sum = M[i][j];
		int count = 1;
		if (j - 1 >= 0) {
			if (i - 1 >= 0) {
				sum += M[i - 1][j - 1];
				count++;
			}
			if (i + 1 < hei) {
				sum += M[i + 1][j - 1];
				count++;
			}
			sum += M[i][j - 1];
			count++;
		}
		if (j + 1 < wid) {
			if (i - 1 >= 0) {
				sum += M[i - 1][j + 1];
				count++;
			}
			if (i + 1 < hei) {
				sum += M[i + 1][j + 1];
				count++;
			}
			sum += M[i][j + 1];
			count++;
		}
		if (i - 1 >= 0) {
			sum += M[i - 1][j];
			count++;
		}
		if (i + 1 < hei) {
			sum += M[i + 1][j];
			count++;
		}
		return sum / count;
	}
}
