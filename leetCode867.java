
package leetCode;

public class leetCode867 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}
	
	public static int[][] transpose(int[][] A) {
        int height=A.length;
        if(height<1)
        	return A;
        int width=A[0].length;
        int[][] B=new int[width][height];
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				B[j][i]=A[i][j];
			}
		}
        return B;
    }
}
