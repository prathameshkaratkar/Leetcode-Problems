package String;

import java.util.Stack;

public class BackSpaceCompare {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";

        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }

    private static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch != '#') {
                stack1.push(ch);
            } else {
                stack1.pop();
            }

        }

        for(char ch : t.toCharArray()) {
            if(ch != '#') {
                stack2.push(ch);
            } else {
                stack2.pop();
            }
        }

        return stack1.equals(stack2);
    }
}
