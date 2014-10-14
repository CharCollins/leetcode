/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(root==null) return result;
        ArrayList<TreeNode> nodes=new ArrayList<TreeNode>();
        nodes.add(root);//add root
        while(!nodes.isEmpty()){
            ArrayList<TreeNode> tmp=new ArrayList<TreeNode>();
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<nodes.size();i++){//add next level node to list
                l.add(nodes.get(i).val);//add nodes' integer value to list
                if(nodes.get(i).left!=null) tmp.add(nodes.get(i).left);
                if(nodes.get(i).right!=null) tmp.add(nodes.get(i).right);
            }
            result.add(l);//insert in the fist place
            nodes=tmp;
        }
        return result;
    }
}
