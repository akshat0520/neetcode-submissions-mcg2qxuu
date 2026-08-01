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
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty())
        {
            int s=q.size();
            c++;
            for(int i=0;i<s;i++)
            {
                TreeNode curr=q.poll();
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
            }
        }
        return c;
    }
}
