package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == hashMap.get(ch)){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }

        return stack.isEmpty();
    }
}

class TestValidParentheses20 {
    public static void main(String[] args) {
        System.out.println("Result   "+ValidParentheses20.isValid("()"));

    }
}