
package leetCode;

public class leetCode521 {

	public static void main(String[] args) throws Exception {
		
		System.out.println();
	}

	public static int findLUSlength(String a, String b) {
        if(a.equals(b))
        	return -1;
		return Math.max(a.length(), b.length());
    }

}
