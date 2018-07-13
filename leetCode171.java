
package leetCode;

public class leetCode171 {

	public static void main(String[] args) throws Exception {

		String s="ZY";
		int x=titleToNumber(s);
		System.out.println();
	}
	public static int titleToNumber(String s) {
        char[] ch=s.toCharArray();
        int plus=1;
        int sum=0;
        for(int i=ch.length-1;i>=0;i--){
        	sum+=plus*(ch[i]-64);
        	plus*=26;
        }
		return sum;
    }

}
