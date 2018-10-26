package leetCode;

public class leetCode592 {
	public static void main(String[] args) throws Exception {
		String expression = "5/3+1/3";
		String x = fractionAddition(expression);

		System.out.println();
	}

	public static int fz;
	public static int fm;
	public static int tempfz;
	public static int tempfm;
	public static boolean isadd;
	public static boolean isfz;

	public static String fractionAddition(String expression) {
		fz = 0;
		fm = 2520;
		tempfz = 0;
		tempfm = 0;
		isadd = true;
		isfz = true;
		char[] ch = expression.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '-') {
				getNewNumber();
				isfz = true;
				isadd = false;
			} else if (ch[i] == '+') {
				getNewNumber();
				isfz = true;
				isadd = true;
			} else if (ch[i] == '/') {
				isfz = false;
			} else {
				if (isfz) {
					tempfz = tempfz == 0 ? ch[i] - 48 : 10;
				} else {
					tempfm = tempfm == 0 ? ch[i] - 48 : 10;
				}
			}
		}
		getNewNumber();
		simpleNumber();
		return fz + "/" + fm;
	}

	private static void getNewNumber() {
		if (tempfz == 0 || tempfm == 0) {
			fz = isadd ? tempfz : -tempfz;
		} else if (isadd) {
			fz += fm / tempfm * tempfz;
		} else {
			fz -= fm / tempfm * tempfz;
		}
		tempfz = 0;
		tempfm = 0;
		return;
	}

	private static void simpleNumber() {
		if (fz == 0) {
			fm = 1;
			return;
		}
		while (fz % 7 == 0 && fm % 7 == 0 && fm != 1) {
			fz /= 7;
			fm /= 7;
		}
		while (fz % 5 == 0 && fm % 5 == 0 && fm != 1) {
			fz /= 5;
			fm /= 5;
		}
		while (fz % 3 == 0 && fm % 3 == 0 && fm != 1) {
			fz /= 3;
			fm /= 3;
		}
		while (fz % 2 == 0 && fm % 2 == 0 && fm != 1) {
			fz /= 2;
			fm /= 2;
		}
	}

}
