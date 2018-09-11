
package leetCode;

import java.util.HashMap;
import java.util.Map;

public class test2 {

	public static void main(String[] args) throws Exception {
		int[] arr={1,2,3,4,5};
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("3", "12344t5y6trf");
		map.put("1", 1);
		map.put("2", arr);
		
		int[] arr1=(int[]) map.get("2");
		int a=(int)map.get("1");
		String b=map.get("3").toString();
		System.out.println("");
	}

	public static <T> int maxProfit(Class<T> prices) {
		
		
		
		return 0;
	}
}
