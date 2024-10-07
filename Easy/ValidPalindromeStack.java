// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/

import java.util.Stack;

class Solution {
   public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      s = s.replaceAll("[^a-zA-Z0-9]", "");
      // [^a-zA-Z0-9]
      s = s.replaceAll(" ", "");
      System.out.println(s);
      Stack<Character> rev = new Stack<>();
      char[] str = s.toCharArray();
      for (char c : str) {
         rev.push(c);
      } // for
      for (int i = 0; i < str.length; i++) {
         if (str[i] != rev.pop()) {
            return false;
         } // if
      } // for
      return true;
   } // isPalindrome
} // Solution