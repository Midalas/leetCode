package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode739 {

	public static void main(String[] args) throws Exception {
		int[] temperatures = { 89,62,70,58,47,47,46,76,100,70};
		//[8,1,5,4,3,2,1,1,0,0]
		int[] x = dailyTemperatures(temperatures);
		System.out.println(x);
	}

	//runtime 102ms
	public static int[] dailyTemperatures(int[] temperatures) {
		int len = temperatures.length;
		Stack<int[]> stack = new Stack<int[]>();
		int[] res = new int[len];
		for (int i = temperatures.length - 1; i >= 0; i--) {
			while (true) {
				if (stack.isEmpty()) {
					res[i] = 0;
					stack.push(new int[] { temperatures[i], i });
					break;
				} else if (temperatures[i] < stack.peek()[0]) {
					res[i] = stack.peek()[1] - i;
					stack.push(new int[] { temperatures[i], i });
					break;
				} else {
					stack.pop();
				}
			}
		}
		return res;
	}

}
