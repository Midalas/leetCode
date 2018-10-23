package leetCode;

@SuppressWarnings("unused")
public class leetCode495 {
	public static void main(String[] args) throws Exception {
		int[] timeSeries = { 1, 2 };
		int duration = 2;
		int x = findPoisonedDuration(timeSeries, duration);
		System.out.println();
	}

	//runtime 8ms
	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		int count = 0;
		int lastTime = Integer.MIN_VALUE;
		for (int i = 0; i < timeSeries.length; i++) {
			count += timeSeries[i] >= lastTime + duration ? duration : timeSeries[i] - lastTime;
			lastTime = timeSeries[i];
		}
		return count;
	}
}
