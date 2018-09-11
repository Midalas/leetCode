
package leetCode;

import java.util.Arrays;

public class leetCode274 {

	public static void main(String[] args) throws Exception {
		int[] citations = { 3, 0, 6, 1, 5 };
		int x = hIndex(citations);
		System.out.println("");
	}

	// runtime 10ms
	public static int hIndex(int[] citations) {
		int len = citations.length;
		Arrays.sort(citations);
		for (int i = 0; i < len; i++)
			if (citations[len - 1 - i] < i + 1)
				return i;
		return len;
	}

}
