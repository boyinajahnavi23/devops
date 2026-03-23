public class BalancedString {
    public static void main(String[] args) {

        String exp = "{([])}";

        if (isBalanced(exp)) {
            System.out.println( "  Balanced");
        } else {
            System.out.println( " → Not Balanced");
        }
    }

    static boolean isBalanced(String exp) {

        String stack = "";  // using string as stack

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Push: add to string
            if (ch == '(' || ch == '{' || ch == '[') {
                stack = stack + ch;
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If empty → not balanced
                if (stack.length() == 0) return false;

                // Get top character manually
                char top = stack.charAt(stack.length() - 1);

                // Check matching
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }

                // Pop: remove last character
                stack = stack.substring(0, stack.length() - 1);
            }
        }

        // If stack empty → balanced
        return stack.length() == 0;
    }
}
