package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class leetCode874 {
	public static void main(String[] args) {

		int[] commands = { -2,-1,4,7,8};
		int[][] obstacles ={{1,1},{2,1},{4,4},{5,-5},{2,-3},{-2,-3},{-1,-3},{-4,-1},{-4,3},{5,1}};

		int x = robotSim(commands, obstacles);
		System.out.println();
	}

	private static int direction;
	private static int nowx;
	private static int nowy;
	private static int maxDistance;
	private static Set<String> obSet;

	//runtime 61ms
	public static int robotSim(int[] commands, int[][] obstacles) {
		maxDistance = 0;
		direction = 2;
		nowx = 0;
		nowy = 0;
		obSet = new HashSet<String>(128);
		for (int i = 0; i < obstacles.length; i++) {
			String temp = obstacles[i][0] + "," + obstacles[i][1];
			obSet.add(temp);
		}
		for (int i = 0; i < commands.length; i++) {
			int op = commands[i];
			if (op == -1) {
				switch (direction) {
				case 2:
					direction = 1;
					break;
				case 1:
					direction = -2;
					break;
				case -2:
					direction = -1;
					break;
				case -1:
					direction = 2;
					break;
				}
			} else if (op == -2) {
				switch (direction) {
				case 2:
					direction = -1;
					break;
				case -1:
					direction = -2;
					break;
				case -2:
					direction = 1;
					break;
				case 1:
					direction = 2;
					break;
				}
			} else {
				getLocation(op);
			}

		}
		return maxDistance;
	}

	private static void getLocation(int step) {
		for (int i = 0; i < step; i++) {
			if (direction == 2) {
				if (checkIsObstacles(nowx, nowy + 1))
					break;
				nowy++;
			} else if (direction == 1) {
				if (checkIsObstacles(nowx + 1, nowy))
					break;
				nowx++;
			} else if (direction == -1) {
				if (checkIsObstacles(nowx - 1, nowy))
					break;
				nowx--;
			} else {
				if (checkIsObstacles(nowx, nowy - 1))
					break;
				nowy--;
			}
			int temp = nowx * nowx + nowy * nowy;
			maxDistance = temp > maxDistance ? temp : maxDistance;
		}
	}

	private static boolean checkIsObstacles(int x, int y) {
		return obSet.contains(x + "," + y);
	}

}
