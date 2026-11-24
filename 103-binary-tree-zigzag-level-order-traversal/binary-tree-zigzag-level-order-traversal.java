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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int levelsize=q.size();
            Integer[] temp = new Integer[levelsize];
            int start=0;
            int end=levelsize-1;
            while(levelsize>0){
                TreeNode t=q.peek();
                q.poll();
                if(leftToRight){
                    temp[start]=t.val;
                    start++;
                }
                else{
                    temp[end]=t.val;
                    end--;
                }
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
                levelsize--;
            }
            res.add(Arrays.asList(temp));
            leftToRight = !leftToRight;
        }
        return res;
    }
}