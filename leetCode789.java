package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
public class leetCode789 {
	public static void main(String[] args) {

		int[][] ghosts = { { 2, 0 } };
		int[] target = { 1, 0 };
		boolean x = escapeGhosts(ghosts, target);
		System.out.println();
	}

	//runtime 6ms
	public static boolean escapeGhosts(int[][] ghosts, int[] target) {
		int minDistance = Math.abs(target[0]) + Math.abs(target[1]);
		for (int i = 0; i < ghosts.length; i++) {
			int temp = Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]);
			if (temp <= minDistance)
				return false;
		}
		return true;
	}
}
