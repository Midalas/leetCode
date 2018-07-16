
package leetCode;

import java.util.Arrays;

public class leetCode371 {

	public static void main(String[] args) throws Exception {


		System.out.println();
	}

	public int getSum(int a, int b) {
        if(b == 0) return a;        // when carry is zero, return
        int sum = a ^ b;        // calculate sum without carry
        int carry = (a & b) << 1;       // calculate carry
        return getSum(sum, carry);
    }

}
