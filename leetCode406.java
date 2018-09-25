package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode406 {
	public static void main(String[] args) {
		// 输入:
		// [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
		//
		// [5,0] [7,0] [6,1] [7,1] [5,2] [4,4]
		//
		// 输出:
		// [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
		int[][] people = { { 2, 4 }, { 3, 4 }, { 9, 0 }, { 0, 6 }, { 7, 1 }, { 6, 0 }, { 7, 3 }, { 2, 5 }, { 1, 1 },
				{ 8, 0 } };
		int[][] x = reconstructQueue(people);
		System.out.println();
	}

	//runtime 23ms
	public static int[][] reconstructQueue(int[][] people) {
		Comparator<int[]> cmp = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o2[0] - o1[0];
				}
			}
		};
		Arrays.sort(people, cmp);
		for (int i = 0; i < people.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++)
				if (people[j][0] >= people[i][0])
					count++;
			int offset = people[i][1] - count;
			int[] temp = people[i];
			if (offset < 0) {
				for (int j = 0; j > offset; j--)
					people[i + j] = people[i + j - 1];
				people[i + offset] = temp;

			} else if (offset > 0) {
				for (int j = i; j < i + offset; j++)
					people[j] = people[j + 1];
				people[i + offset] = temp;
			}
		}
		return people;
	}

}
