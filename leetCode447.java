
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode447 {

	public static void main(String[] args) throws Exception {
		int[][] points = { { 0, 0 }, { 1, 0 }, { 2, 0 }, { 6, 6 } };
		int x = numberOfBoomerangs(points);
		System.out.println();
	}

	//runtime 317ms
	public static int numberOfBoomerangs(int[][] points) {
		int count = 0;
		int len = points.length;
		for (int i = 0; i < len; i++) {
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int j = 0; j < len; j++) {
				int dis = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0])
						+ (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
				if (!map.containsKey(dis))
					map.put(dis, 0);
				count += map.get(dis) * 2;
				map.put(dis, map.get(dis) + 1);

			}
		}
		return count;
	}

}
