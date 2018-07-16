
package leetCode;

public class leetCode639 {

	public static void main(String[] args) throws Exception {

		int n=0;
		boolean x=hasAlternatingBits(n);
		System.out.println();
	}

	
	public static boolean hasAlternatingBits(int n) {
		String s=Integer.toBinaryString(n);
		char[] ch=s.toCharArray();
		int pre=-1;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==pre)
				return false;
			pre=ch[i];
		}
        return true;
    }
	
}
