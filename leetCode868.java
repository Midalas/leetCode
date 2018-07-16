
package leetCode;

public class leetCode868 {

	public static void main(String[] args) throws Exception {

		int N=1;
		int x=binaryGap(N);
		System.out.println();
	}

	public static int binaryGap(int N) {
        String str=Integer.toBinaryString(N);
        char[] ch=str.toCharArray();
        int max=0;
        int pre=1000000000;
        for(int i=0;i<ch.length;i++){
        	if(ch[i]=='1'){
        		max=i-pre>max?i-pre:max;
        		pre=i;
        	}		
        }
        return max;
    }

}
