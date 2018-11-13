package leetCode;

public class leetCode925 {
	public static void main(String[] args) throws Exception {
		String name = "alex";
		String typed = "aaleex";
		boolean x = isLongPressedName(name, typed);
		System.out.println();
	}

	//runtime 7ms
	public static boolean isLongPressedName(String name, String typed) {
		char[] chType = typed.toCharArray();
		char[] ch1 = new char[chType.length];
		int[] count1 = new int[chType.length];
		int index1 = 0;
		char temp1 = ' ';
		for (int i = 0; i < chType.length; i++) {
			if (chType[i] == temp1) {
				count1[index1 - 1]++;
			} else {
				temp1 = chType[i];
				ch1[index1] = temp1;
				count1[index1++] = 1;
			}
		}

		char[] chName = name.toCharArray();
		char[] ch2 = new char[chName.length];
		int[] count2 = new int[chName.length];
		int index2 = 0;
		char temp2 = ' ';
		for (int i = 0; i < chName.length; i++) {
			if (chName[i] == temp2) {
				count2[index2 - 1]++;
			} else {
				temp2 = chName[i];
				ch2[index2] = temp2;
				count2[index2++] = 1;
			}
		}

		if (index1 != index2)
			return false;
		for (int i = 0; i < index1; i++)
			if (ch1[i] != ch2[i] || count1[i] < count2[i])
				return false;

		return true;
	}
}
