package leetCode;

public class leetCode482 {
	public static void main(String[] args) throws Exception {
		String S = "211---";
		int K = 2;

		String x = licenseKeyFormatting(S, K);
		System.out.println();
	}

	//runtime 20ms
	public static String licenseKeyFormatting(String S, int K) {
		StringBuffer sb = new StringBuffer();
		if (S.length() <= K) {
			S = S.replace("-", "");
			for (int i = 0; i < S.length(); i++)
				sb.append(Character.toUpperCase(S.charAt(i)));
			return sb.toString();
		}
		S = S.replace("-", "");
		int index = S.length() % K;
		
		if (index > 0) {
			for (int i = 0; i < index; i++)
				sb.append(Character.toUpperCase(S.charAt(i)));
			sb.append("-");
		}
		S = S.substring(index, S.length());
		char[] ch = S.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i != 0 && i % K == 0)
				sb.append("-");
			sb.append(Character.toUpperCase(ch[i]));
		}

		return sb.toString();
	}

}
