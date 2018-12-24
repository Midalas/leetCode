package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetCode950 {

	public static void main(String[] args) throws Exception {
		int[] deck = { 2, 3, 5, 7, 11, 13, 17 };
		int[] x = deckRevealedIncreasing(deck);
		System.out.println();
	}

	//runtime 11ms
	public static int[] deckRevealedIncreasing(int[] deck) {
		Arrays.sort(deck);
		int[] res = new int[deck.length];
		int index = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < deck.length; i++)
			queue.add(i);
		while (queue.size() > 1) {
			res[queue.poll()] = deck[index++];
			queue.add(queue.poll());
		}
		res[queue.poll()] = deck[index];
		return res;
	}
}
