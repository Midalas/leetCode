
package leetCode;

public class leetCode258 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int addDigits(int num) {
		if(num<10)
			return num;
		int temp=num%9;
        return temp==0?9:temp;
    }

}
