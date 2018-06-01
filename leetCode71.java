package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode71 {

	public static void main(String[] args) throws Exception {
		String path = "/...";
		String x = simplifyPath(path);
		System.out.println(x);
	}

	public static String simplifyPath(String path) {
		Stack<String> stack = new Stack<String>();
		String str="";
		String[] array=path.replace("//", "/").split("/");
		for(int i=0;i<array.length;i++){
			if(!"".equals(array[i])){
				if("..".equals(array[i])){
					if(!stack.isEmpty()){
						stack.pop();
					}
				}else if(".".equals(array[i])){
					continue;
				}else{
					stack.push(array[i]);
				}
			}
		}
		while(!stack.isEmpty()){
			str=stack.pop()+"/"+str;
		}
		if(str.length()>0&&str.charAt(str.length()-1)=='/'){
			str=str.substring(0,str.length()-1);
		}
		return "/"+str;
	}
}
