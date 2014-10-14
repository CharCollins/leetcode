/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
  每次将某层节点记录，上层节点遍历时，有左右节点存在就加入list中，依次遍历
 */
public class BinaryTreeLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(root==null) return result;
        ArrayList<TreeNode> nodes=new ArrayList<TreeNode>();
        nodes.add(root);//add root
        while(!nodes.isEmpty()){
            ArrayList<TreeNode> tmp=new ArrayList<TreeNode>();//mark next level nodes
            ArrayList<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<nodes.size();i++){//add next level node to list
                l.add(nodes.get(i).val);//add nodes' integer value to list
                if(nodes.get(i).left!=null) tmp.add(nodes.get(i).left);
                if(nodes.get(i).right!=null) tmp.add(nodes.get(i).right);
            }
            result.add(0,l);//insert in the fist place
            nodes=tmp;//add next level node to nodes
        }
        return result;
    }
}
