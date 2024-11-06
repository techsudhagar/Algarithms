import java.util.*;

public class Calculator {

    public static int calculator(String expression) {

        int result = 0;
        int signValue = 1;
        int currentNumber = 0;

        char strChar = '\0';
        Stack<String> stack = new Stack<>();

        char[] exprArray = expression.toCharArray();

        for (int i = 0; i < exprArray.length; i++) {
            strChar = exprArray[i];
            if (Character.isDigit(strChar)) {
                currentNumber = currentNumber * 10 + Character.getNumericValue(strChar);

            } else if (strChar == '+' || strChar == '-') {

                result = result + (currentNumber * signValue);

                if (strChar == '+') {
                    signValue = 1;
                } else {
                    signValue = -1;
                }
                currentNumber = 0;

            } else if (strChar == '(') {

                stack.push(String.valueOf(result));
                stack.push(String.valueOf(signValue));
                result = 0;
                signValue = 1;

            } else if (strChar == ')') {

                result = result + (currentNumber * signValue);

                currentNumber = 0;

                result = result * Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());

            }

        }

        result = result + (currentNumber * signValue);

        return result;
    }
}