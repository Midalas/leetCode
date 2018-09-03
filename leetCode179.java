
package leetCode;

public class leetCode179 {

	public static void main(String[] args) throws Exception {
		// 输入: [3,30,34,5,9]
		// 输出: 9534330
		int[] nums = { 10, 2 };
		String x = largestNumber(nums);
		System.out.println("");
	}

	//runtime 47ms
	public static String largestNumber(int[] nums) {
		String res = "";
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++)
			strs[i] = "" + nums[i];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (compareMax(strs[j + 1], strs[j])) {
					String temp = strs[j];
					strs[j] = strs[j + 1];
					strs[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < strs.length; i++)
			if (!"".equals(res) || !"0".equals(strs[i]))
				res += strs[i];
		return "".equals(res) ? "0" : res.toString();
	}

	private static boolean compareMax(String s1, String s2) {
		String temp1 = s1 + s2;
		String temp2 = s2 + s1;
		int length = temp1.length();
		for (int i = 0; i < length; i++) {
			if (temp1.charAt(i) != temp2.charAt(i))
				return temp1.charAt(i) > temp2.charAt(i);
		}
		return true;
	}

}
