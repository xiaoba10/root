package leetcode62;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import leetcode62.isValidBST.TreeNode;

public class recoverTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	TreeNode pre; // 指向当前遍历元素的前一个
	TreeNode first; // 第一个乱序的元素
	TreeNode second;// 第二个乱序的元素

	public void inorder(TreeNode root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		if (pre == null) {
			pre = root;
		} else {
			if (pre.val > root.val) {
				if (first == null) {
					first = pre; // 找到第一个乱序的元素
				}
				second = root; // 第二个乱序的元素。如果用了else，则无法通过只有两个元素的情况
			}
			pre = root; // 继续搜索
		}
		inorder(root.right);
	}

	public void recoverTree(TreeNode root) {
		pre = null; // 必须在这里初始化一遍，否则OJ会报错
		first = null;
		second = null;
		inorder(root);
		if (first != null && second != null) { // 只需要交换元素值，而没必要进行指针操作！
			int tmp = first.val;
			first.val = second.val;
			second.val = tmp;
		}
	}

}
