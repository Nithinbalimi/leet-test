/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList();
        Stack<TreeNode> stack=new Stack();
        TreeNode c=root;
        while(c!=null ||  !stack.isEmpty()){
            while(c!=null){
                stack.push(c);
                c=c.left;
            }
            c=stack.pop();
            res.add(c.val);
            c=c.right;
        }
        return res;
    }
}