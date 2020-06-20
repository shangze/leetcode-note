package leetcode.editor.cn;

//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。 
//
// 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。 
//
// 示例: 
//
// 给定有序数组: [-10,-3,0,5,9],
//
//一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics 树 深度优先搜索


public class PConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = new PConvertSortedArrayToBinarySearchTree().new Solution().sortedArrayToBST(nums);
        System.out.println(node.toString());;
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
        int[] nums;

        public TreeNode helper(int left, int right) {
            if (left >= right) return null;

            // always choose left middle node as a root
            int p = (left + right) / 2;

            // inorder traversal: left -> node -> right
            TreeNode root = new TreeNode(nums[p]);
            root.left = helper(left, p - 1);
            root.right = helper(p + 1, right);
            return root;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            this.nums = nums;
            return helper(0, nums.length - 1);
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
