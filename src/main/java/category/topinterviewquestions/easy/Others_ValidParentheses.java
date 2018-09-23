package category.topinterviewquestions.easy;

import java.util.Stack;

/**
 * 괄호가 제대로 닫혀있는지 판단한라
 *
 */
public class Others_ValidParentheses {
    public static void main(String[] args) {
//        Input: "()"
//        Output: true
//
        String s = "()[]{}";
//        Output: true
//
//        Input: "(]"
//        Output: false
//
//        Input: "([)]"
//        Output: false
//
        String s2 = "{[]}";
//        Output: true
        isValidByAnswer(s2);

    }

    public static boolean isValidByAnswer(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
