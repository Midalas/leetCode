
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode500 {

	public static void main(String[] args) throws Exception {
		String[] words={"Hello", "Alaska", "Dad", "Peace"};
		String[] x=findWords(words);
		System.out.println();
	}
	
	private static Map<Character,Integer> map=new HashMap<Character,Integer>();
	static{
		map.put('Q', 1);map.put('W', 1);map.put('E', 1);map.put('R', 1);map.put('T', 1);map.put('Y', 1);map.put('U', 1);map.put('I', 1);map.put('O', 1);map.put('P', 1);
		map.put('A', 2);map.put('S', 2);map.put('D', 2);map.put('F', 2);map.put('G', 2);map.put('H', 2);map.put('J', 2);map.put('K', 2);map.put('L', 2);
		map.put('Z', 3);map.put('X', 3);map.put('C', 3);map.put('V', 3);map.put('B', 3);map.put('N', 3);map.put('M', 3);
	}

	public static String[] findWords(String[] words) {
		List<String> list=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
        	if(checkSameLine(words[i]))
        		list.add(words[i]);
        }
		String[] result=new String[list.size()];
		return list.toArray(result);
    }
	
	private static boolean checkSameLine(String str){
		char[] ch=str.toCharArray();
		if(ch.length<1)
			return false;
		int flag=map.get(Character.toUpperCase(ch[0]));
		for(int i=0;i<ch.length;i++){
			if(map.get(Character.toUpperCase(ch[i]))!=flag)
				return false;
		}
		return true;
	}
}
