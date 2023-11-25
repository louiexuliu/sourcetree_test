import java.util.Stack;

class Solution_2 {
    public static boolean isValid(String s) {
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
                //为了防止其他情况被误认为true，其他情况全部false
            }else
                return false;

        }
        return stack.isEmpty();
    }
    public static void test1() {
        String s = "()";
        boolean r = isValid(s);
        if (r) {
            System.out.println("test1 pass");
        }else {
            System.out.println("test1 failed");
        }
    }

    public static void test2() {
        String s = "()[]{}";
        boolean r = isValid(s);
        if (r) {
            System.out.println("test2 pass");
        }else {
            System.out.println("test2 failed");
        }
    }


    public static void test3() {
        String s = "(]";
        boolean r = isValid(s);
        if (!r) {
            System.out.println("test3 pass");
        }else {
            System.out.println("test3 failed");
        }
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
}