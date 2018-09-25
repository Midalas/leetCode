package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode397 {
	public static void main(String[] args) throws Exception {
		int n = 65535;
		int x = integerReplacement(n);
		System.out.println();
	}

	//runtime 7ms
	public static int integerReplacement(int n) {
		if(n == Integer.MAX_VALUE)
	        return 32;
	    if(n <= 1)
	        return 0;
	    if((n & 1) == 0)
	        return 1 + integerReplacement(n>>1);
	    else
	        return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
	}

}
