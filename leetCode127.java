
package leetCode;

import java.util.Arrays;
import java.util.List;

public class leetCode127 {

	public static void main(String[] args) throws Exception {
		String beginWord = "hit";
		String	endWord = "cog";
		String[] a={"hot","dot","dog","lot","log","cog"};
		List<String> wordList = Arrays.asList(a);
		int x=ladderLength(beginWord, endWord, wordList);
		System.out.println();
	}
	//["hot","dot","dog","lot","log","cog"]
	//		"hit","hot","dot","dog","lot","log","cog"
	//"hit", 0		1	  2	    3	  2	    3	  3
	//"hot"  1
	//"dot"	 2
	//"dog"	 3
	//"lot"	 2
	//"log"	 3
	//"cog"	 3
	//
	//
	//
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len=wordList.size();
        int[][] distance=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
            	if(i==j){
            		distance[i][j]=0;
            	}else{
            		int difference=getDifference(wordList.get(i),wordList.get(j));
            		distance[i][j]=difference;
            	}		
            }
        }
    	
    	return 0;
    }
    
    private static int getDifference(String str1,String str2){
    	int count=0;
    	if(str1.length()!=str2.length())
    		return -1;
    	for(int i=0;i<str1.length();i++)
    		if(str1.charAt(i)!=str2.charAt(i))
    			count++;
    	return count;
    }
}
