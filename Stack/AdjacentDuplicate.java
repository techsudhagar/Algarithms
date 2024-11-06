package Algarithms.Stack;

import java.util.*;
public class AdjacentDuplicate{
    public static String removeDuplicates(String s) {
        
        Stack<Character> strStack = new Stack<>();
        char eachChar = '\0';
        Character topChar = '\0';
        for (int i=0; i<s.length();i++){
          eachChar = s.charAt(i);
          
          if (!strStack.empty()){
            topChar = strStack.peek();
            if (eachChar == topChar){
              strStack.pop();
            } else {
               strStack.push(eachChar);
            }
          } else {
            strStack.push(eachChar);
          }
        }
        
        Stack<Character> reverseStack = new Stack<>();
        while(!strStack.empty()){
          reverseStack.push(strStack.pop());
        }
        
        s = "";
        while(!reverseStack.empty()) {
          s += reverseStack.pop();
        }
        
        return s;
    }
}
