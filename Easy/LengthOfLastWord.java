// 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/description/

class Solution {
   public int lengthOfLastWord(String s) {
      int count = 0;
      char[] strArr = s.toCharArray();
      int index = strArr.length - 1;
      boolean isStart = false;
      while (isStart == false) {
         if (strArr[index] != ' ') {
            isStart = true;
         } else {
            index--;
         } // if
      } // while

      while (index >= 0) {
         if (strArr[index] != ' ') {
            count++;
            index--;
         } else {
            break;
         } // if

      } // while
      return count;
   } // lengthOfLastWord
} // Solution