
package leetCode;

public class leetCode709 {

	public static void main(String[] args) throws Exception {

		String str="AAOHSDOAIHI&*$#@AYGSIhidsygfousaijdosugIUHOIHOIH";
		String x=toLowerCase(str);
		System.out.println();
	}
	
	
	
	public static String toLowerCase(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65&&ch[i]<=90)
				ch[i]=(char) (ch[i]+32);
		}
		return new String(ch);
    }

}
