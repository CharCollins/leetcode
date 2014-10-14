/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        if(root==null) return result;
        TreeNode p=root,lastVisit=null;
        Deque<TreeNode> s=new ArrayDeque<TreeNode>();
        while(p!=null||!s.isEmpty()){
            while(p!=null){//put p and p.left into stack
                s.push(p);
                p=p.left;
            }
            p=s.peek();//read the top of stack,and check whether been visited
            if(p.right==null||lastVisit==p.right){//p has been visit or p right is null, output p.val
                result.add(p.val);
                lastVisit=p;
                s.pop();
                p=null;
            }else{//p hasn't been visit
                p=p.right;
            }
        }
        return result;
    }
}
//http://blog.csdn.net/jiqiren007/article/details/6461761
