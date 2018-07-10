
package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetCode018 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	public static List<List<Integer>> fourSum(int[] numbers, int target) {
		Arrays.sort(numbers);
		List<List<Integer>> ret = new ArrayList<>();
		Set<String> set=new HashSet<String>();
		int i = 0;
		int j = 0;
		int sum = 0;
		for (int h = 0; h < numbers.length - 3; h++) {
			int k=numbers.length - 1;
			while (h + 2 < k) {
				i = h + 1;
				j = k - 1;
				while (i > h && i < j && j < k) {
					sum = numbers[h] + numbers[i] + numbers[j] + numbers[k];
					if (sum == target) {
						String vad=numbers[h]+","+numbers[i]+","+numbers[j]+","+numbers[k];
						if(!set.contains(vad)){
							List<Integer> temp = new ArrayList<Integer>();
							temp.add(numbers[h]);
							temp.add(numbers[i]);
							temp.add(numbers[j]);
							temp.add(numbers[k]);
							ret.add(temp);
							set.add(vad);
						}
						if (numbers[i] != numbers[i + 1]) {
							i++;
						} else if (numbers[j] == numbers[j - 1]) {
							i++;
							j--;
							continue;
						} else {
							j--;
						}

					} else if (sum < target) {
						i++;
					} else {
						j--;
					}
				}
				k--;
			}
		}
		return ret;
	}

}
