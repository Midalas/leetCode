package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode860 {
	public static void main(String[] args) {
		int[] bills={5,5,5,10,20};
		boolean x=lemonadeChange(bills);
		System.out.println();
	}

	
	//runtime 5ms
	public static boolean lemonadeChange(int[] bills) {
		int count5 = 0;
		int count10 = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				count5++;
			} else if (bills[i] == 10) {
				if (count5 < 1)
					return false;
				count5--;
				count10++;
			} else if (bills[i] == 20) {
				if (count5 < 1)
					return false;
				count5--;
				if (count10 > 0) {
					count10--;
				} else if (count5 > 1) {
					count5 -= 2;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
