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
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        List<Integer> sizes=new ArrayList<>();
        dfs(root,sizes);
        Collections.sort(sizes,Collections.reverseOrder());
        return sizes.size()<k?-1:sizes.get(k-1);
    }
    private int dfs(TreeNode node,List<Integer> sizes){
        if(node==null) return 0;
        int left=dfs(node.left,sizes);
        int right=dfs(node.right,sizes);
        if(left==right &&(node.left==null && node.right==null|| left>0)){
            int size=1+left+right;
            sizes.add(size);
            return size;
        }
        return -1; 
    }
}
