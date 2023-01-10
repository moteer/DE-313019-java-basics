package exercise_3;

/**
 * Implement the following validation rules. Write “OK” on the console when the rule is met. Otherwise “Input Error”.
 *
 * Important: Do the validation one after the other (no nesting).
 *
 * The length of the input string must be greater than 5.
 * The length of the input string must be between 4-8 characters.
 * Input string must start with 2 numeric characters. Hint: Use Character.isDigit()
 * String must contain "chen", such as "München".
 * String must end with a colon.
 * All characters in the input are uppercase.
 * The input string must contain the characters '(' and ')'. And the ')' must come after the '('.
 */
public class StringValidation {
    public static void main(String[] args) {
        String input = "this is my test string";

        if (input.length() >= 4 && input.length() <= 8) {
            System.out.println("OK");
        }
        else {
            System.out.println("Input error: ");
        }

        if (input.length() >= 2 && Character.isDigit(input.charAt(0)) && Character.isDigit(input.charAt(1))) {
            System.out.println("OK");
        }
        else {
            System.out.println("Input error");
        }

        if (input.length() > 0 && input.charAt(input.length() - 1) == ':') {
            System.out.println("OK");
        }
        else {
            System.out.println("Input error");
        }

        boolean allUppercase = true;
        for (char c : input.toCharArray()) {
            if (c != Character.toUpperCase(c)) {
                allUppercase = false;
            }
        }
        if (allUppercase) {
            System.out.println("OK");
        }
        else {
            System.out.println("Input error");
        }

        int leftIndex = input.indexOf('(');
        int rightIndex = input.indexOf(')');

        if(leftIndex >= 0 && rightIndex >= 0 && leftIndex < rightIndex) {
            System.out.println("OK");
        }
        else {
            System.out.println("Input error");
        }
    }
}