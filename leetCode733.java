
package leetCode;

public class leetCode733 {

	public static void main(String[] args) throws Exception {
		int[][] image = { { 0, 0,0 }, 
						{ 0, 1, 1 } };

		int[][] x = floodFill(image, 1, 1, 1);
		System.out.println();
	}

	//runtime 29ms
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int height = image.length;
		if (height < 1||image[sr][sc]==newColor)
			return image;
		int width = image[0].length;
		dfs(image, height, width, sr, sc, image[sr][sc], newColor);
		return image;
	}

	private static void dfs(int[][] image, int height, int width, int sr, int sc, int oldColor, int newColor) {
		if (image[sr][sc] == oldColor) {
			image[sr][sc] = newColor;
			if (sr > 0) 
				dfs(image, height, width, sr - 1, sc, oldColor, newColor);
			if (sr < height - 1) 
				dfs(image, height, width, sr + 1, sc, oldColor, newColor);
			if (sc > 0) 
				dfs(image, height, width, sr, sc - 1, oldColor, newColor);
			if (sc < width - 1) 
				dfs(image, height, width, sr, sc + 1, oldColor, newColor);
		}
	}

}
