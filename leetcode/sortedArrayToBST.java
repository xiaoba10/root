package leetcode101;


public class sortedArrayToBST {
		public class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;

			TreeNode(int x) {
				val = x;
			}
		}


	    public TreeNode sortedArrayToBST(int[] nums) {
			int len = nums.length;
			if( len == 0)
				return null;
			return helper(nums,0,(len-1)/2,len-1);

		}

		public TreeNode helper(int[] nums,int start,int mid,int end){
	        
			if( start > end )
				return null;
			TreeNode node = new TreeNode(nums[mid]);

			node.left = helper(nums,start,(mid+start-1)/2,mid-1);

			node.right = helper(nums,mid+1,(end+mid+1)/2,end);

			return node;

	    }

}
