
package leetCode;

public class leetCode458 {

	public static void main(String[] args) throws Exception {
		int buckets = 1000;
		int minutesToDie = 15;
		int minutesToTest = 60;
		int x = poorPigs(buckets, minutesToDie, minutesToTest);
		System.out.println();
	}

	public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		if(buckets<=1)
			return 0;
		int k = minutesToTest / minutesToDie + 1;
		int res = 1;
		int temp = k;
		while (buckets > temp) {
			res++;
			temp *= k;
		}
		return res;
	}

}
