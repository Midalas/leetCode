package leetCode;

public class leetCode423 {
	public static void main(String[] args) throws Exception {

		// zero-two-six-eight-three-seven-four-five-one-nine
		String s = "fviefuro";
		String x = originalDigits(s);
		System.out.println();
	}

	//runtime 10ms
	public static String originalDigits(String s) {
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		int[] count = new int[128];
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		for (int i = 0; i < ch.length; i++) {
			count[ch[i]]++;
		}
		count0 = count['z'];
		count['e'] -= count0;
		count['r'] -= count0;
		count['o'] -= count0;
		count2 = count['w'];
		count['t'] -= count2;
		count['o'] -= count2;
		count6 = count['x'];
		count['s'] -= count6;
		count['i'] -= count6;
		count8 = count['g'];
		count['e'] -= count8;
		count['i'] -= count8;
		count['h'] -= count8;
		count['t'] -= count8;
		count3 = count['t'];
		count['h'] -= count3;
		count['r'] -= count3;
		count['e'] -= 2 * count3;
		count7 = count['s'];
		count['e'] -= 2 * count7;
		count['v'] -= count7;
		count['n'] -= count7;
		count4 = count['u'];
		count['f'] -= count4;
		count['o'] -= count4;
		count['r'] -= count4;
		count5 = count['v'];
		count['f'] -= count5;
		count['i'] -= count5;
		count['e'] -= count5;
		count1 = count['o'];
		count['n'] -= count1;
		count['e'] -= count1;
		count9 = count['i'];
		for (int i = 0; i < count0; i++)
			sb.append('0');
		for (int i = 0; i < count1; i++)
			sb.append('1');
		for (int i = 0; i < count2; i++)
			sb.append('2');
		for (int i = 0; i < count3; i++)
			sb.append('3');
		for (int i = 0; i < count4; i++)
			sb.append('4');
		for (int i = 0; i < count5; i++)
			sb.append('5');
		for (int i = 0; i < count6; i++)
			sb.append('6');
		for (int i = 0; i < count7; i++)
			sb.append('7');
		for (int i = 0; i < count8; i++)
			sb.append('8');
		for (int i = 0; i < count9; i++)
			sb.append('9');
		return sb.toString();

	}
}
