
package leetCode;

public class leetCode383 {

	public static void main(String[] args) throws Exception {

		String ransomNote = "a";
		String magazine = "ba";
		boolean x = canConstruct(ransomNote, magazine);
		System.out.println();
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		char[] ch1 = ransomNote.toCharArray();
		char[] ch2 = magazine.toCharArray();
		int[] count1 = new int[200];
		int[] count2 = new int[200];
		for (int i = 0; i < ch1.length; i++)
			count1[ch1[i]] += 1;
		for (int i = 0; i < ch2.length; i++)
			count2[ch2[i]] += 1;
		for (int i = 97; i <= 122; i++)
			if (count1[i] > count2[i])
				return false;
		return true;
	}

}
