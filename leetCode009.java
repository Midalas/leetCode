
package leetCode;

public class leetCode009 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	 public static boolean isPalindrome(int x) {
	    	if(x<0)
	    		return false;
	    	String str=x+"";
	    	String str1="";
	    	for(int i=str.length()-1;i>=0;i--)
	    		str1+=str.charAt(i);
	    	return str.equals(str1);
	 }

}
