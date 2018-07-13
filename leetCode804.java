
package leetCode;

import java.util.HashSet;
import java.util.Set;

public class leetCode804 {

	public static void main(String[] args) throws Exception {
		String[] words={"gin", "zen", "gig", "msg"};
		int x=uniqueMorseRepresentations(words);
		System.out.println();
	}

	public static int uniqueMorseRepresentations(String[] words) {
		int count = 0;
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String temp = "";
			for (int j = 0; j < word.length(); j++)
				temp += code[word.charAt(j) - 97];
			if (!set.contains(temp)) {
				set.add(temp);
				count++;
			}
		}
		return count;
	}
}
