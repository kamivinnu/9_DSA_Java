package stackPackage;

public class InfixToPostfix {

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {

        String result = "";
        StackL<Character> stack = new StackL<>();

        for (int i = 0; i < exp.length(); i++) {

            char c = exp.charAt(i);

            // Ignore spaces
            if (c == ' ')
                continue;

            // Operand
            if (Character.isLetterOrDigit(c)) {
                result = result + c;
            }

            // Opening parenthesis
            else if (c == '(') {
                stack.push(c);
            }

            // Closing parenthesis
            else if (c == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result = result + stack.pop();
                }

                if (stack.isEmpty())
                    return "Invalid Expression";

                stack.pop(); // remove '('
            }

            // Operator
            else {

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(c) <= precedence(stack.peek())
                        && c != '^') {

                    result = result + stack.pop();
                }

                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String exp = "a + b * (c^d-e) ^ (f + g * h) - i";
        System.out.println(infixToPostfix(exp));
    }
}
