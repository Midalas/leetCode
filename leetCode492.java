
package leetCode;

public class leetCode492 {

	public static void main(String[] args) throws Exception {
		int area=4;
		int[] x=constructRectangle(area);
		System.out.println();
	}

	//runtime 4ms
	public static int[] constructRectangle(int area) {
		int max = (int) (Math.pow(area, 0.5));
		for (int height = max; height > 0; height--) {
			if (area % height == 0) {
				return new int[] { area / height, height };
			} else {
				continue;
			}
		}
		return new int[]{-1,-1};
	}
}
