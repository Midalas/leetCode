
package leetCode;

public class leetCode008 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

    public static int myAtoi(String str) {
		String str1 = "";
		int result = 0;
		boolean disable=false;
		int countf = 0;
		int countp = 0;
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				str1 += str.charAt(i);
				disable=true;
			} else if (str.charAt(i) == '-' && !disable) {
				countf++;
				disable=true;
			} else if(str.charAt(i) == '+'&& !disable) {	
				countp++;
				disable=true;
			}else{
			  break;
			}
		}
		if (!"".equals(str1)) {
			try {
				result = countf==1?-Integer.valueOf(str1):Integer.valueOf(str1);
			} catch (Exception e) {	
				result = countf==1?Integer.MIN_VALUE:Integer.MAX_VALUE;
			}
			return result;
		} else {
			return 0;
		}
	}


}
