
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode599 {

	public static void main(String[] args) throws Exception {

		String[] list1={"nfeau","KFC"};
		String[] list2={"KFC"};

		String[] x=findRestaurant(list1, list2);
		System.out.println();
	}

	
	//runtime 21ms
	public static String[] findRestaurant(String[] list1, String[] list2) {
		int index = Integer.MAX_VALUE;
		List<String> tempList = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		if (list1.length > list2.length) {
			String[] temp = list2;
			list2 = list1;
			list1 = temp;
		}
		for (int i = 0; i < list1.length; i++)
			map.put(list1[i], i);
		for (int i = 0; i < list2.length; i++) {
			if (i > index)
				break;
			if (map.containsKey(list2[i])) {
				int temp = map.get(list2[i]) + i;
				if (temp == index) {
					tempList.add(list2[i]);
				} else if (temp < index) {
					index = temp;
					tempList.clear();
					tempList.add(list2[i]);
				}
			}
		}
		String[] res = new String[tempList.size()];
		for (int i = 0; i < res.length; i++)
			res[i] = tempList.get(i);
		return res;
	}
}
