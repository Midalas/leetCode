
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetCode022 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static List<String> generateParenthesis(int n) {
        List<String> list =new ArrayList<String>();
        int i=0;
        int size=2;
        ArrayList<String> res=new ArrayList<String>();
        Map<String,Integer> validMap = new HashMap<String,Integer>();
        res.add("(");
        while(i<n*2){      	
        	ArrayList<String> temp=new ArrayList<String>();
        	for(String r:res){    		
        		validMap=isValid(r,n);
        		if(validMap.get("countl")<n){
        			temp.add(r+"(");    			
        		}else{
        			addValue(list,r,n);       			
        		}    		
        		if(validMap.get("countr")<validMap.get("countl")&&validMap.get("countl")<n)
        			temp.add(r+")"); 		       		
        	}
        	res=temp;
        	i++;
        }       
		return list;
    }
	private static Map<String,Integer> isValid(String str,int n){
		int countl=0;
		int countr=0;
		Map<String,Integer> param=new HashMap<String,Integer>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				countl++;
			}else if(str.charAt(i)==')'){
				countr++;
			}
		}
		param.put("countl", countl);
		param.put("countr", countr);		
		return param;
	}
	private static void addValue(List<String> list,String str,int n){
		int length=str.length();
		for(int i=0;i<n*2-length;i++)
			str+=")";
		list.add(str);
	}
}
