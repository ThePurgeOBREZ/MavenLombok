package stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StackService {

    private Stack<Character> stack = new Stack<>();
    private String initialString;
    private Set<Character> openedBraces = new HashSet<>();

    public StackService() {
        openedBraces.add('{');
        openedBraces.add('(');
        openedBraces.add('[');
    }

    public boolean isStatementCorrect(String s) {
        this.initialString = s;
        for (int i = 0; i < s.length(); i++) {
            if (openedBraces.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                if (stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }


}
