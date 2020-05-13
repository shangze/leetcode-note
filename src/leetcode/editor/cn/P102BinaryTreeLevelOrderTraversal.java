package leetcode.editor.cn;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层次遍历结果： 
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索


import java.util.ArrayList;
import java.util.List;

public class P102BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        List<List<Integer>> resultList = new ArrayList<>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            if (root == null) return resultList;
            dfs(root, 0);
            return resultList;
        }

        public void dfs(TreeNode n, int level) {
            if (resultList.size() == level) {
                List<Integer> list = new ArrayList<>();
                resultList.add(list);
            }

            resultList.get(level).add(n.val);


            if (n.left != null) {
                dfs(n.left, level + 1);
            }
            if (n.right != null) {
                dfs(n.right, level + 1);
            }
        }

    }

    //leetcode submit region end(Prohibit modification and deletion)
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
