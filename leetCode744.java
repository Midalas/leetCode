
package leetCode;

public class leetCode744 {

	// 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
	//
	// 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回
	// 'a'。
	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	//runtime 9ms
	public static char nextGreatestLetter(char[] letters, char target) {
		for(int i=0;i<letters.length;i++)
			if(letters[i]>target)
				return letters[i];
		return letters[0];
	}

}
