package test;

import java.util.ArrayList;
import java.util.List;

public class leetCode68 {

	public static void main(String[] args) throws Exception {
		// String[] words = { "This", "is", "an", "example", "of", "text",
		// "justification." };
		// String[] words = { "What", "must", "be", "acknowledgment", "shall",
		// "be" };
		// String[] words
		// ={"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
		String[] words={"Listen","to","many,","speak","to","a","few."};
		// int maxWidth = 16;
		int maxWidth = 6;
//		String[] words = { "ask", "not", "what", "your", "country", "can", "do", "for", "you", "ask", "what", "you",
//				"can", "do", "for", "your", "country" };
		fullJustify(words, maxWidth);
		System.out.println();
	}

	// 1.最后一行的情况
	// 2.空格相等的情况
	// 3.左边空格要求多余右边空格
	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> result = new ArrayList<String>();
		int i = 0;
		int count = 0;
		int sum = 0;
		while (i + count <= words.length) {
			String str = "";
			if (i + count == words.length) {
				if (count != 0) {
					for (int j = 0; j < count; j++) {
						str += words[i + j] + " ";
					}
					str = str.trim();
					for (int j = str.length(); j < maxWidth; j++) {
						str += " ";
					}
					result.add(str);
				}
				break;
			} else if (sum + words[i + count].length() == maxWidth) {
				for (int j = 0; j < count; j++) {
					str += words[i + j] + " ";
				}
				str += words[i + count];
				result.add(str);
				sum = 0;
				i += count + 1;
				count = 0;
			} else if (sum + words[i + count].length() > maxWidth) {
				int space = maxWidth - sum + 1;
				int ji = count - 1 == 0 ? space -1: space / (count - 1);
				String jistr = "";
				for (int m = 0; m <= ji; m++) {
					jistr += " ";
				}
				int yu = count - 1 == 0 ? 0 : space % (count - 1);
				for (int j = 0; j < count; j++) {
					if (j == count - 1 && count != 1) {
						str += words[i + j];
					} else {
						if (j < yu) {
							str += words[i + j] + jistr + " ";
						} else {
							str += words[i + j] + jistr;
						}
					}
				}
				result.add(str);
				sum = 0;
				i += count;
				count = 0;
			} else {
				sum += words[i + count].length() + 1;
				count++;
			}
		}

		return result;
	}
}
