package leetCode;

public class leetCode345 {

	public static void main(String[] args) throws Exception {
		String x=reverseVowels("leetcode");
		System.out.println();
	}

	public static String reverseVowels(String s) {
		int i = 0;
		int j = s.length() - 1;
		char[] ch = s.toCharArray();
		while (i < j) {
			while (i < j&&!isVowel(ch[i]))
				i++;
			while (i < j&&!isVowel(ch[j]))
				j--;
			if (i <= j) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			} else {
				break;
			}
		}
		return new String(ch);
	}

	
	private static boolean isVowel(char ch){
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			return true;	
		return false;
	}
}
