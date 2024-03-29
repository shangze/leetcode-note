package leetcode.editor.cn;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P136SingleNumber{
    public static void main(String[] args) {
        List<String> setList = new ArrayList<>();
        setList.add("1");
        setList.add("2");
        setList.add("3");
        setList.add("4");
        setList.add("5");
        int spNum = 3;
        StringBuilder cfAmbIdSql = new StringBuilder();
        for (int i = 0; i <= setList.size() / spNum; i++) {

            StringBuilder idStr = new StringBuilder();
            if(i == setList.size() / spNum){
                int lastSize = setList.size() -  i * spNum;
                for (int j = 0; j < lastSize; j++) {
                    idStr.append(",'").append(setList.get((i * spNum) + j)).append("'");
                }
            }else{
                for (int j = 0; j < spNum; j++) {
                    idStr.append(",'").append(setList.get((i * spNum) + j)).append("'");
                }
            }

            idStr = new StringBuilder(idStr.substring(1));
            cfAmbIdSql.append(" temp.CFAmbId in (").append(idStr).append(") or");
        }
        cfAmbIdSql = new StringBuilder(cfAmbIdSql.substring(0,cfAmbIdSql.lastIndexOf("or")));
        System.out.println(cfAmbIdSql);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result = result ^ num;
            }
            return result;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
