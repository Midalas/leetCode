package leetCode;

public class leetCode069 {

	public static void main(String[] args) throws Exception {
		int x = 2147395599;
		int r = mySqrt(x);
		System.out.println(r);
	}

	public static int mySqrt(int x) {
		if(x<1)
			return 0;
		int low = getRange(x);
		int high = low*2;
		int middle = (low + high) / 2;
		while (low + 1 < high) {
			middle = (low + high) / 2;
			if (x == (long)middle * middle) {
				return middle;
			} else if (x >(long) middle * middle) {
				low = middle;
			} else {
				high = middle;
			}
		}
		return low;
	}
	
	private static int getRange(int x){
		int[] temp = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536 };
		int temp_low = 0;
		int temp_high = temp.length;
		int temp_middle = (temp_low + temp_high) / 2;
		while (temp_low + 1 < temp_high) {
			temp_middle = (temp_low + temp_high) / 2;
			if (x == (long)temp[temp_middle] * temp[temp_middle]) {
				return temp[temp_middle];
			} else if (x > (long)temp[temp_middle] * temp[temp_middle]) {
				temp_low = temp_middle;
			} else {
				temp_high = temp_middle;
			}
		}	
		return temp[temp_low];
	}
}
