
package leetCode;

public class leetCode824 {

	public static void main(String[] args) throws Exception {
		String S="The quick brown fox jumped over the lazy dog";
		String x=toGoatLatin(S);
		System.out.println();
	}
	//runtime 25ms
	 public static String toGoatLatin(String S) {
		 String res="";
		 String[] arr=S.split(" ");
		 for(int i=0;i<arr.length;i++)
			 res+=(getGoatLatin(arr[i],i+1)+" ");  
		 return res.substring(0, res.length()-1);
	 }
	 
	 private static String getGoatLatin(String str,int index){
		 char firstchar=str.charAt(0);
		 if(firstchar!='a'&&firstchar!='e'&&firstchar!='i'&&firstchar!='o'&&firstchar!='u'&&firstchar!='A'&&firstchar!='E'&&firstchar!='I'&&firstchar!='O'&&firstchar!='U')
			 str=str.substring(1, str.length())+firstchar;
		 StringBuffer sb=new StringBuffer();
		 sb.append("ma");
		 for(int i=0;i<index;i++)
			 sb.append('a');
		 str+=sb.toString();
		 return str;
	 }

}
