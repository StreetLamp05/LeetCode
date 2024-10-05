// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;
import java.lang.Iterable;

class Solution {
   public boolean isValid(String s) {
      Stack<Character> bracket = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c == '{' || c == '[' || c == '(') { // if it is an opening bracket
            bracket.push(c);
         } else if (bracket.size() == 0) { // if it is a closing bracket and there are no opening brackets in stack.
            return false;
         } // if
         if (c == '}' || c == ']' || c == ')') {
            if (c == ')' && bracket.peek() == '(') { // if inner most bracket is paired.
               bracket.pop();
            } else if (c == '}' && bracket.peek() == '{') { // if inner most bracket is paired.
               bracket.pop();
            } else if (c == ']' && bracket.peek() == '[') { // if inner most bracket is paired.
               bracket.pop();
            } else { // if a closing has no corresponding
               return false;
            } // if
         } // if
      } // for
      if (bracket.size() == 0) {
         return true;
      }
      return false;
   } // isValid
} // Solution