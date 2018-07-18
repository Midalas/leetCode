
package leetCode;

public class leetCode263 {

	public static void main(String[] args) throws Exception {

		int num=6;
		
		
		boolean x=isUgly(num);
		
		
		
		System.out.println();
	}

	public static boolean isUgly(int num) {
		if(num<1)
			return false;
		while (num % 5 == 0)
			num /= 5;
		while (num % 3 == 0)
			num /= 3;
		while (num % 2 == 0)
			num /= 2;
		return num == 1;
	}

}
