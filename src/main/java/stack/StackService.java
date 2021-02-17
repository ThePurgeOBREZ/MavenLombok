package stack;
import lombok.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
@AllArgsConstructor
@Setter
@Getter
public class StackService {

    private Stack<Character> stack = new Stack<>();
    private String initialString;
    private Set<Character> openedBraces = new HashSet<>();

    public StackService() {
        openedBraces.add('{');
        openedBraces.add('(');
        openedBraces.add('[');
    }

    public boolean isStatementCorrect(String s) throws IOException {
        this.initialString = s;
        if (checkIsStatementCorrect(s)) return false;

        return stack.isEmpty();
    }

    private boolean checkIsStatementCorrect(String s) {
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
                    return true;
                }
            }
        }
        return false;
    }


}
