/* Medium
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/


package two_pointer_ques;

import java.util.Arrays;

public class LC_75_SortColors {
  static class Solution {
   public void sortColors(int[] nums){
      int low = 0, mid = 0, high = nums.length-1;
      while (mid <= high) {
        if(nums[mid]==0){
          int temp = nums[low];
          nums[low] = nums[mid];
          nums[mid] = temp;
          low++;
          mid++;
        } else if(nums[mid]==1){
          mid++;
        } else {
          int temp = nums[mid];
          nums[mid] = nums[high];
          nums[high] = temp;
          high--;
        }
      }
   }
 }
 public static void main(String[] args) {
  int[] nums = {2,0,2,1,1,0};
  Solution sl = new Solution();
  sl.sortColors(nums);
  System.out.println(Arrays.toString(nums));
 }
}

/*
Dutch National Flag Algorithm:

Think of the array divided into 4 parts:

[0 ... low-1]     → all 0s
[low ... mid-1]   → all 1s
[mid ... high]    → unknown (to be processed)
[high+1 ... end]  → all 2s

Goal:
Process the unknown part and sort the array in one pass

Rules:
1. nums[mid] == 0 → swap with low (move left)
2. nums[mid] == 1 → just move mid
3. nums[mid] == 2 → swap with high (move right)

Time Complexity: O(n)
Space Complexity: O(1)

This is an in-place, one-pass sorting algorithm 🚀
*/

/*
FLOW OF THE CODE:

1. Start:
   low = 0        → where 0s should go
   mid = 0        → current index we check
   high = n - 1   → where 2s should go

2. Loop:
   while (mid <= high)
   → run loop until mid crosses high

3. In each step, check nums[mid]:

   CASE 1: nums[mid] == 0
   → move 0 to the left side
   → swap nums[low] and nums[mid]
   → increase low (0 area grows)
   → increase mid (move forward)

   CASE 2: nums[mid] == 1
   → 1 is already in correct place
   → just move mid forward

   CASE 3: nums[mid] == 2
   → move 2 to the right side
   → swap nums[mid] and nums[high]
   → decrease high (2 area grows)
   → do NOT move mid
     because new element at mid is not checked yet

4. Loop stops when:
   mid > high

5. Final result:
   → array becomes sorted
   → all 0s at left, 1s in middle, 2s at right


ARRAY IDEA (How it works):

[0 ... low-1]     → all 0s
[low ... mid-1]   → all 1s
[mid ... high]    → unknown (still checking)
[high+1 ... end]  → all 2s

Goal:
→ check unknown part and sort in one pass


SHORT TRICK:
0 → move left
1 → skip
2 → move right
*/

/*
Time Complexity is O(n) because mid moves at most n times and high moves at most n times, so total operations are n + n = 2n, which simplifies to O(n).
*/