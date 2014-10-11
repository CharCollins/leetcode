package leetcode.oj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePreorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list=new ArrayList<Integer>();
		Deque<TreeNode> stack=new ArrayDeque<TreeNode>();
		TreeNode p=root;
		while(p!=null){
			list.add(p.val);
			if(p.left!=null) {
				if(p.right!=null) stack.push(p.right);
				p=p.left;
			}else{
				if(stack.size()>0) p=stack.pop();
			}
		}
		return list;
    }
}
