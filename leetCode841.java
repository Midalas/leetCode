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
public class leetCode841 {

	public static void main(String[] args) throws Exception {
		
		System.out.println();
	}

	private static boolean[] res;
	//runtime 9ms
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
		res = new boolean[rooms.size()];
		dfs(rooms, 0);
		for (int i = 0; i < res.length; i++)
			if (!res[i])
				return false;
		return true;
	}

	private static void dfs(List<List<Integer>> rooms, int index) {
		if (res[index]) {
			return;
		} else {
			res[index] = true;
			for (Integer i : rooms.get(index)) {
				dfs(rooms, i);
			}
		}
	}

}
