package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode70 {

	public static void main(String[] args) throws Exception {
		int x=climbStairs(9);
		System.out.println(x);
	}

	  public static int climbStairs(int n) {
		  	int[] temp=new int[n+1];
		  	if(n<3){
		  		return n;
		  	}
		  	temp[0]=0;
		  	temp[1]=1;
		  	temp[2]=2;
		  	for(int i=3;i<=n;i++){
		  		temp[i]=temp[i-1]+temp[i-2];
		  	} 	
	    	return temp[n];
	    }
}
