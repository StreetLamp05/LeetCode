// 1652. Defuse the Bomb
// https://leetcode.com/problems/defuse-the-bomb/description/?envType=daily-question&envId=2024-11-18

class Solution {
   public int[] decrypt(int[] code, int k) {
      int sum = 0;
      int pointer;
      int kCount = 0;
      int solution[] = new int[code.length];

      if (k > 0) { // replace ith num w/ sum of next k nums
         pointer = 1;
         for (int i = 0; i < code.length; i++) {
            if (i != code.length - 1) {
               pointer = i + 1;
            } else {
               pointer = 0;
            } // if
            while (kCount < k) {
               sum += code[pointer];
               kCount++;
               if (pointer + 1 != code.length) {
                  pointer++;
               } else {
                  pointer = 0;
               } // if
            } // while
            solution[i] = sum;
            kCount = 0;
            sum = 0;
         } // for
      } else if (k < 0) { // replace ith num w/ sum of prev k nums
         pointer = code.length - 1;
         for (int i = 0; i < code.length; i++) {
            if (i != 0) {
               pointer = i - 1;
            } else {
               pointer = code.length - 1;
            } // if
            while (kCount < Math.abs(k)) {
               sum += code[pointer];
               kCount++;
               if (pointer - 1 >= 0) {
                  pointer--;
               } else {
                  pointer = code.length - 1;
               } // if
            } // while
            solution[i] = sum;
            kCount = 0;
            sum = 0;
         } // for
      } else { // replace ith num w/ 0
         for (int i = 0; i < code.length; i++) {
            solution[i] = 0;
         } // for
      } // if
      return solution;
   } // decrypt
} // solution
