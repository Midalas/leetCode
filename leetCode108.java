package leetCode;

public class leetCode108 {


		public static void main(String[] args) throws Exception {
			int[] nums={};
			sortedArrayToBST(nums);
			System.out.println();
		}

		public static TreeNode sortedArrayToBST(int[] nums) {
			TreeNode result=dfs(nums,0,nums.length-1);
			return result;
		}

		private static TreeNode dfs(int[] nums, int i, int j) {
			if (i <=j) {
				int middle = (int)Math.ceil((i + j) / 2.0);
				TreeNode node = new TreeNode(nums[middle]);
				node.left=dfs(nums,i,middle-1);
				node.right=dfs(nums,middle+1,j);
				return node;
			}else{
				return null;
			}
			
		}

	}



