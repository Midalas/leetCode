package leetCode;


public class leetCode050 {

	public static void main(String[] args) throws Exception {

		double x = myPow(2.00000, -2);
		System.out.println(x);
	}

	public static double myPow(double x, int n) {
		if(n==0)
			return 1;
		double result;
		int a = n;
		int b = 1;
		while (a % 2 == 0) {
			a /= 2;
			b++;
		}
		result = Math.pow(x, a);
		for (int i = 1; i < b; i++) {
			result *= result;
		}
		return result;
	}

}
