
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode535 {

	public static void main(String[] args) throws Exception {
		String x = encode("http://asdasdzgatvefddsfdsfsfsfdsdfggtredsgrrr");

		String origin = decode(x);
		System.out.println();
	}

	//runtime 5ms
	private static char[] charArray = { '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
			'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
			'X', 'Y', 'Z' };
	public static Map<String, String> deCodeMap = new HashMap<String, String>();

	// Encodes a URL to a shortened URL.
	public static String encode(String longUrl) {
		String res = compressUrl(longUrl);
		deCodeMap.put(res, longUrl);
		return res;
	}

	// Decodes a shortened URL to its original URL.
	public static String decode(String shortUrl) {
		return deCodeMap.get(shortUrl);
	}

	// 压缩为8位字符串
	private static String compressUrl(String url) {	
		char[] temp = new char[8];
		char[] ch = url.toCharArray();
		int i = 0;
		int j = 0;
		while (i < ch.length) {
			temp[j] = charArray[(temp[j] + ch[i]) % 61];
			j = j == 7 ? 0 : j + 1;
			i++;
		}
		return new String(temp);
	}
}
