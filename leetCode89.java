package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode89 {

	public static void main(String[] args) throws Exception {
		int n = 1;
		grayCode(n);
		System.out.println();
	}

	public static List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<Integer>();
		List<String> temp = new ArrayList<String>();
		if(n<1){
			result.add(0);	
			return result;
		}
			
		temp.add("0");
		temp.add("1");
		while (n > 1) {
			int size = temp.size();
			for (int i = size - 1; i >= 0; i--) {
				temp.add("1" + temp.get(i));
			}
			for (int i = 0; i < size; i++) {
				temp.set(i, "0" + temp.get(i));
			}
			n--;
		}
		for (int i = 0; i < temp.size(); i++) {
			result.add(Integer.valueOf(temp.get(i), 2));
		}
		return result;
	}
}
