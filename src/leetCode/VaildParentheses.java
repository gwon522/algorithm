package leetCode;

import java.util.*;

public class VaildParentheses {
    public static void main(String[] args) {
        String input1 = "({)}";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([])";
        System.out.println(solution(input1));
    }

    private static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if(c == '('|| c=='['||c=='{'){
                stack.push(c);
            } else{
                if(stack.isEmpty()) return false;

                char pop = stack.pop();
                if ((c == ')' && pop != '(') ||
                    (c == '}' && pop != '{') ||
                    (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
