package leetCode;

public class leetCode72 {

	public static void main(String[] args) throws Exception {
		//word1 = "horse", word2 = "ros"
		String word1 = "intention";//
		String word2 = "execution";//
		int x=minDistance(word1, word2);
		System.out.println(x);
	}

	public static int minDistance(String word1, String word2) {
	      int[][] array=new int[word1.length()+1][word2.length()+1];
	      char[] w1=(word1+" ").toCharArray();
	      char[] w2=(word2+" ").toCharArray();
	      
	      for(int i=0;i<word1.length()+1;i++){
	    	  array[i][0]=i;
	      }
	      for(int j=0;j<word2.length()+1;j++){
	    	  array[0][j]=j;
	      }
	      for(int i=1;i<=word1.length();i++){
	    	  for(int j=1;j<=word2.length();j++){
	    		  int cost=w1[i-1]==w2[j-1]?0:1;
	    		  array[i][j]=Math.min(Math.min(array[i-1][j]+1,array[i][j-1]+1), array[i-1][j-1]+cost);	  
	    	  }
	      }      
		return array[word1.length()][word2.length()];
    }
}
