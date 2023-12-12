import java.util.Stack;

/**
 * Author: Louie Liu
 * Time: 2023/12/12 3:31
 */
public class Solution_10 {
        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;


        public Solution_10() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }


        public void push(int x) {
            inputStack.push(x); // 将元素推入输入栈
        }


        public int pop() {
            if (outputStack.isEmpty()) { // 如果输出栈为空，将输入栈中的元素依次弹出并压入输出栈
                while (!inputStack.isEmpty()) {
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.pop();
        }


        public int peek() {
            if (outputStack.isEmpty()) {
                while (!inputStack.isEmpty()) {
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.peek();
        }

        
        public boolean empty() {
            return inputStack.isEmpty() && outputStack.isEmpty(); // 输入栈和输出栈都为空时队列为空
        }


        public static void main(String[] args) {
            Solution_10 Solution_10 = new Solution_10();
            Solution_10.push(1);
            Solution_10.push(2);
            System.out.println(Solution_10.peek());
            System.out.println(Solution_10.pop());
            System.out.println(Solution_10.empty());
        }



}
