
package leetCode;

public class leetCode028 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static int strStr(String haystack, String needle) {
   	int i=0;
   	if("".equals(needle))
   		return 0;
   	if(haystack.length()<needle.length())
   		return -1;
   	while(i<haystack.length()){
   		for(int j=0;j<needle.length();j++){	
   			if(i+j>=haystack.length())
   				return -1;
   			if(haystack.charAt(i+j)!=needle.charAt(j)){
   				i=i+1;
   				break;
   			}else if(j==needle.length()-1){
   				return i;
   			}	
   		}	
   	}
   	return -1;       
   }
}
