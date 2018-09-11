
package leetCode;

public class leetCode275 {

	public static void main(String[] args) throws Exception {
		int[] citations = { 0, 1, 3, 5, 6 };
		int x = hIndex(citations);
		System.out.println("");
	}
	//二分
	public static int hIndex(int[] citations) {
		int start = 0;
		int len = citations.length;
		int end = len - 1;
		while (start <= end) {
			int middle = start + (end - start) / 2;
			if (citations[middle] == len - middle) {
				return len - middle;
			} else if (citations[middle] > len - middle) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return len - start;
	}

	// runtime 42ms
	public static int hIndex1(int[] citations) {
		int len = citations.length;
		for (int i = 0; i < len; i++)
			if (citations[len - 1 - i] < i + 1)
				return i;
		return len;
	}

}
