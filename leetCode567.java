
package leetCode;

import java.util.List;

public class leetCode567 {
	public static void main(String[] args) throws Exception {
		String s1 = "ab",s2 = "eidbaooo";
		boolean x=checkInclusion(s1,s2);
		System.out.println();
	}

	public static boolean checkInclusion(String s1, String s2) {
        int len=s1.length();
        if(s2.length()<len)
        	return false;
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(int i=0;i<ch1.length;i++)
			count1[ch1[i]-97]++;
        for(int i=0;i<ch1.length;i++)
			count2[ch2[i]-97]++;
    
		for(int i=0;i+len<s2.length();){
			if(isSimilar(count1,count2)){
				return true;
			}else{
				count2[ch2[i]-97]--;
				count2[ch2[i+len]-97]++;
				i++;
			}		
		}
		return isSimilar(count1,count2);
    }
	
	private static boolean isSimilar(int[] count1,int[] count2){
		for(int i=0;i<count1.length;i++){
			if(count1[i]!=count2[i])
				return false;
		}	
		return true;
	}
	
}
