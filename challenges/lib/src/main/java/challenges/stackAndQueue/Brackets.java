package challenges.stackAndQueue;

public class Brackets<T> {
    public boolean bracketsBalance(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push(str.charAt(i));
                    break;
                case '}':
                    if (stack.peek() == '{') stack.pop();
                    break;
                case ')':
                    if (stack.peek() == '(') stack.pop();
                    break;
                case ']':
                    if (stack.peek() == '[') stack.pop();
            }
        }
        return stack.isEmpty();


    }

    public static void main(String[] args) {

    }
}


