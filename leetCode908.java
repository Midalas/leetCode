package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode908 {
	public static void main(String[] args) {

		System.out.println();
	}
	
	//runtime 8ms
    public static int smallestRangeI(int[] A, int K) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
        	max=A[i]>max?A[i]:max;
        	min=A[i]<min?A[i]:min;
        }
        int res=max-min-K-K;
        return res>0?res:0;
    }
}
