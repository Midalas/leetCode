package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode957 {
	public static void main(String[] args) throws Exception {
		int[] cells = { 1, 0, 1, 0, 0, 0, 0, 1 };
		int N = 15;
		int[] x = prisonAfterNDays(cells, N);
		System.out.println();
	}

	//runtime 15ms
	public static int[] prisonAfterNDays(int[] cells, int N) {
		Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> valMap = new HashMap<Integer, Integer>();
		int day = 0;
		int start = 0;
		int cycle = 0;
		while (day <= N) {
			int val = getVal(cells);
			if (keyMap.containsKey(val)) {
				start = keyMap.get(val);
				cycle = day - start;
				break;
			} else {
				keyMap.put(val, day);
				valMap.put(day, val);
				cells = getNextDay(cells);
			}
			day++;
		}
		if (N < keyMap.size()) {
			return getCell(valMap.get(N));
		} else {
			int offset = (N - keyMap.size()) % cycle;
			return getCell(valMap.get(start + offset));
		}

	}

	private static int[] getNextDay(int[] cells) {
		int[] res = new int[8];
		res[0] = 0;
		res[7] = 0;
		for (int i = 1; i < 7; i++) {
			if (cells[i - 1] == cells[i + 1]) {
				res[i] = 1;
			} else {
				res[i] = 0;
			}
		}
		return res;

	}

	private static int getVal(int[] cells) {
		int res = 0;
		for (int i = 0; i < 8; i++) {
			res += (cells[i] << (7 - i));
		}
		return res;
	}

	private static int[] getCell(int val) {
		int[] res = new int[8];
		for (int i = 0; i < 8; i++) {
			res[i] = val >> (7 - i) & 0x01;
		}
		return res;
	}
}
