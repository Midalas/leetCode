
package leetCode;

import java.util.Arrays;

public class leetCode475 {

	public static void main(String[] args) throws Exception {

		int[] houses = { 282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923 };
		int[] heaters = { 823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729,
				823378840, 143542612 };
		int x = findRadius(houses, heaters);
		System.out.println();
	}

	
	//runtime 17ms
	public static int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int res = 0;
		int p = 0;
		int temp = 0;
		for (int i = 0; i < houses.length; i++) {
			if (p == heaters.length - 1) {
				temp = Math.abs(heaters[p] - houses[i]);
			} else {
				while (p < heaters.length - 1 && houses[i] > heaters[p + 1])
					p++;
				temp = p == heaters.length - 1 ? Math.abs(houses[i] - heaters[p])
						: Math.min(Math.abs(houses[i] - heaters[p]), Math.abs(heaters[p + 1] - houses[i]));
			}
			res = temp > res ? temp : res;
		}
		return res;
	}

}
