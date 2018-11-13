package leetCode;

public class leetCode537 {
	public static void main(String[] args) throws Exception {
		String a="1+-1i";
		String b="1+-1i";
		String x=complexNumberMultiply(a, b);
		
		System.out.println();
	}

	//runtime 10ms
	public static String complexNumberMultiply(String a, String b) {
		a = a.replace("i", "");
		b = b.replace("i", "");
		String[] arrayA = a.split("\\+");
		String[] arrayB = b.split("\\+");
		int m = new Integer(arrayA[0]) * new Integer(arrayB[0]) - new Integer(arrayA[1]) * new Integer(arrayB[1]);
		int n = new Integer(arrayA[0]) * new Integer(arrayB[1]) + new Integer(arrayA[1]) * new Integer(arrayB[0]);
		return m + "+" + n + "i";
	}
}
