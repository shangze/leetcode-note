package leetcode.editor.cn;

//给定一个二叉树，检查它是否是镜像对称的。 
//
// 
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 
//
// 进阶： 
//
// 你可以运用递归和迭代两种方法解决这个问题吗？ 
// Related Topics 树 深度优先搜索 广度优先搜索


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PSymmetricTree {
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
        public boolean isSymmetric(TreeNode root) {
            return check(root, root);
        }

        /**
         * 迭代实现
         *
         * @param p
         * @param q
         * @return
         */
        public boolean check(TreeNode p, TreeNode q) {
            Queue<TreeNode> treeNodeQueue = new LinkedList<>();
            treeNodeQueue.offer(p);
            treeNodeQueue.offer(q);

            while (!treeNodeQueue.isEmpty()){
                p = treeNodeQueue.poll();
                q = treeNodeQueue.poll();

                if(p == null && q == null){
                    continue;
                }

                if(p == null || q == null){
                    return false;
                }

                if(p.val != q.val){
                    return false;
                }

                treeNodeQueue.offer(p.left);
                treeNodeQueue.offer(q.right);

                treeNodeQueue.offer(p.right);
                treeNodeQueue.offer(q.left);
            }
            return true;
        }

        /**
         * 递归实现
         *
         * @param p
         * @param q
         * @return
         */
//        public boolean check(TreeNode p, TreeNode q) {
//            if (p == null && q == null) {
//                return true;
//            }
//            if (p == null || q == null) {
//                return false;
//            }
//
//            if (p.val != q.val) return false;
//
//            return check(p.left, q.right) && check(p.right, q.left);
//        }
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
