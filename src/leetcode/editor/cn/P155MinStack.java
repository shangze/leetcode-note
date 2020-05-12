package leetcode.editor.cn;

//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计


import java.util.Stack;

public class P155MinStack {
    public static void main(String[] args) {
        MinStack obj = new P155MinStack().new MinStack();
        obj.push(1);
        obj.push(-1);
        obj.push(5);
        obj.push(9);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println(param_3);
        System.out.println(param_4);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {
        Stack<Integer> dataStack;
        Stack<Integer> helpStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            dataStack = new Stack<>();
            helpStack = new Stack<>();
        }

        public void push(int x) {
            dataStack.push(x);
            if (helpStack.isEmpty() || helpStack.peek() > x) {
                helpStack.push(x);
            }else{
                helpStack.push(helpStack.peek());
            }
        }

        public void pop() {
            dataStack.pop();
            helpStack.pop();
        }

        public int top() {
            return dataStack.peek();
        }

        public int getMin() {
            return helpStack.peek();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    //leetcode submit region end(Prohibit modification and deletion)

}
