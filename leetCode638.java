package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class leetCode638 {

	public static void main(String[] args) throws Exception {
		List<Integer> price = Arrays.asList(new Integer[] { 6, 3, 6, 9, 4, 7 });
		List<List<Integer>> special = new ArrayList<List<Integer>>();
		special.add(Arrays.asList(new Integer[] { 1, 2, 5, 3, 0, 4, 29 }));
		special.add(Arrays.asList(new Integer[] { 3, 1, 3, 0, 2, 2, 19 }));
		List<Integer> needs = Arrays.asList(new Integer[] { 4, 1, 5, 2, 2, 4 });
		int x = shoppingOffers(price, special, needs);
		System.out.println();

	}

	private static int min;

	//36ms
	public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
		int sum = 0;
		for (int i = 0; i < needs.size(); i++)
			if (needs.get(i) != 0)
				sum += needs.get(i) * price.get(i);
		min = sum;
		int x = dfs(price, special, needs, 0);
		return x;
	}

	private static int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int sum) {
		if (checkFinished(needs)) {
			min = sum < min ? sum : min;
			return min;
		}
		for (int m = 0; m < special.size(); m++) {
			List<Integer> list = special.get(m);
			if (checkIsValid(list, needs)) {
				List<Integer> temp = new ArrayList<Integer>();
				for (int i = 0; i < needs.size(); i++)
					temp.add(i, needs.get(i) - list.get(i));
				dfs(price, special, temp, sum + list.get(needs.size()));
			} else {
				int s1=0;
				for (int i = 0; i < needs.size(); i++)
					if (needs.get(i) != 0)
						s1 += needs.get(i) * price.get(i);
				dfs(price, special, new ArrayList<Integer>(), sum+s1);
			}
		}

		return min;
	}

	private static boolean checkFinished(List<Integer> needs) {
		for (Integer i : needs) {
			if (i != 0)
				return false;
		}
		return true;
	}

	private static boolean checkIsValid(List<Integer> list, List<Integer> needs) {
		for (int i = 0; i < needs.size(); i++) {
			if (list.get(i) > needs.get(i))
				return false;
		}
		return true;
	}

}
