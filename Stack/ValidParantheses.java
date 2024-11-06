import java.util.*;

public class ValidParantheses{
    public static String minRemoveParentheses(String s) {

        Stack<String> stack = new Stack<>();
        char strChar = '\0';
        char peekChar = '\0';
        
        for(int i=0;i<s.length();i++){
          strChar = s.charAt(i);
          
          if(strChar == '(' || strChar == ')') {
            if(stack.empty()){
                stack.push(i+","+strChar);
            } else {
              peekChar = stack.peek().split(",")[1].charAt(0);
            
              if(peekChar == '(' && strChar == ')') {
                stack.pop();
              } else {
                stack.push(i+","+strChar);
              }
            }
          }
            
        }
        
        System.out.println("Stack:"+stack);
          int removeIndex = 0;
          StringBuilder strBuilder = new StringBuilder(s);
           System.out.println("Builder:"+strBuilder);
           String popStr = "";
          while(!stack.empty()){
            System.out.println("peek"+stack.peek());
            popStr = stack.pop();
            System.out.println("Pop Str"+popStr);
            removeIndex = Integer.parseInt(popStr.split(",")[0]);
            System.out.println("index"+removeIndex);
            strBuilder.deleteCharAt(removeIndex);
          }
        
        return strBuilder.toString();
    }

    public static void main(String[] args) {

        ValidParantheses.minRemoveParentheses("{}");
    }
}