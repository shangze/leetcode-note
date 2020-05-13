package leetcode.editor.cn;

//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P94BinaryTreeInorderTraversal{
    public static void main(String[] args) {
        
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> resultList = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode pNode = root;
            while (!stack.isEmpty() || pNode != null){
                if(pNode != null){
                    stack.push(pNode);
                    pNode = pNode.left;
                }else{
                    TreeNode node = stack.pop();
                    resultList.add(node.val);
                    pNode = node.right;
                }
            }

            return resultList;
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
