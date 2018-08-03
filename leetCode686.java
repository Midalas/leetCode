
package leetCode;

public class leetCode686 {

	public static void main(String[] args) throws Exception {

		String A = "abc";
		String B = "cabcabca";
		int x = repeatedStringMatch(A, B);
		System.out.println();
	}

	
	
	//fast runtime 15ms
	public static int repeatedStringMatch(String A, String B) {
        int lengthA = A.length(),
            lengthB = B.length(),
            i = 0,
            j = 0;
        
        int[] next = new int[lengthB];
        
        while (i < lengthB) {
            if (i == 0 || (B.charAt(i) != B.charAt(j) && j == 0)) {
                next[i] = 0;
            } else if (B.charAt(i) == B.charAt(j)) {
                next[i] = ++j;
            } else if (B.charAt(i) != B.charAt(j) && j > 0) {
                j = next[j - 1];
                continue;
            }
            i++;
        }
        
        i = j = 0;
        while (j < lengthB) {
            if (A.charAt(i % lengthA) == B.charAt(j)) {
                i++;
                j++;
            } else if (j == 0) {
                i++;
            } else if (j > 0) {
                j = next[j - 1];
            }
            
            if (i >= lengthA + lengthB) {
                return -1;
            }
        }
        
        return i % lengthA > 0 ? i / lengthA + 1 : i / lengthA;        
    }

	//runtime 202ms
	public static int repeatedStringMatch1(String A, String B) {
		int min = Math.abs(B.length() / A.length());
		String temp = getNtimesA(A, min);
		if (temp.contains(B)) {
			return min;
		} else if ((temp + A).contains(B)) {
			return min + 1;
		} else if ((temp + A + A).contains(B)) {
			return min + 2;
		} else {
			return -1;
		}
	}

	private static String getNtimesA(String A, int k) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < k; i++)
			sb.append(A);
		return sb.toString();
	}
}
