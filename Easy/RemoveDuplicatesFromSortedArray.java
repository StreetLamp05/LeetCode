// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
   public int removeDuplicates(int[] nums) {
      int prev = nums[0];
      int count = 1;
      for (int i = 0; i < nums.length; i++) {
         if (prev != nums[i]) {
            prev = nums[i];
            nums[count] = prev;
            count++;
         } // if
      } // for

      return count;
   } // removeDuplicates
} // Solution