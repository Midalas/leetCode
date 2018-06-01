package test;

import java.util.ArrayList;
import java.util.List;

public class leetCode60 {

	public static void main(String[] args) throws Exception {
		String x = getPermutation(3, 3);
		System.out.print(x);
	}

	public static String getPermutation(int n, int k) {
		String result = "";
		List<Integer> list = new ArrayList<Integer>();
		int level = n;
		int factor = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}
		while (list.size() > 0) {
			factor = factorial(level - 1);	
			if(factor==1||k%factor==0){
				index=(int) (Math.floor(k / factor))-1;;
				k=factor;
			}else{
				index = (int) (Math.floor(k / factor));
				k %= factor;
			}		
			level--;
			result += list.get(index);
			list.remove(index);
		}
		return result;
	}

	private static int factorial(int n) {
		if (n < 2)
			return 1;
		int total = 1;
		for (int i = 0; i < n; i++) {
			total *= (i + 1);
		}
		return total;
	}

}
