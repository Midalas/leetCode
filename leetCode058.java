package leetCode;

public class leetCode058 {

	public static void main(String[] args) throws Exception {
		lengthOfLastWord("");
	}
	public static int lengthOfLastWord(String s) {
		s=s.trim();
		int count=0;
		char[] temp=s.toCharArray();
		int i=temp.length-1;
		while(i>=0&&temp[i]!=' '){
			i--;
			count++;
		}
        return count;
    }
}
