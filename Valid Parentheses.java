class Solution {
    public boolean isValid(String s) {
        //如果字符串s的长度为奇数，则返回false
        if (s.length() % 2 !=0) return false;

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
//如果字符不是左括号，则不需要将其推入堆栈中
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
//如果字符c是’)‘，并且堆栈不为空，并且堆栈顶部的元素是’(‘，则从堆栈中弹出’(‘
            }else if (c == ')' && !stack.isEmpty()&& stack.peek() == '('){
                stack.pop();
//以此类推
            }else if (c == ']' && !stack.isEmpty()&& stack.peek() == '['){
                stack.pop();

            }else if (c == '}' && !stack.isEmpty()&& stack.peek() == '{'){
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}