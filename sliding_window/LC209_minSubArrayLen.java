/*
209. Minimum Size Subarray Sum 
Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Question_Link - https://leetcode.com/problems/minimum-size-subarray-sum/

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
*/

package sliding_window;

public class LC209_minSubArrayLen {
   public static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length; // total number of elements
        int left = 0;        // start of window
        int minLen = Integer.MAX_VALUE; // store smallest length found
        int sum = 0;         // current window sum

        // move right pointer to expand the window
        for(int right = 0; right < n; right++){

            sum += nums[right]; // add current element to sum

            // when current sum is >= target, window is valid
            while(sum >= target){

                // calculate window size and update minimum length
                minLen = Math.min(minLen, right - left + 1);

                // shrink the window from left side
                sum -= nums[left]; // remove left element from sum
                left++;            // move left pointer forward
            }
        }

        // if minLen was never updated, return 0
        return minLen == Integer.MAX_VALUE ? 0 : minLen; 
    }
  public static void main(String[] args) {
    int[] arr = {2,3,1,2,4,3};
    int k = 7;
    System.out.println(minSubArrayLen(k, arr));
  }
}


/*
FLOW OF THE CODE:

1. Start with:
   - left = 0 (window start)
   - sum = 0 (current window sum)
   - minLen = infinity (to track minimum length)

2. Move right pointer from 0 → n-1:
   - Add nums[right] to sum (window expand)

3. Check:
   - If sum >= target → window is valid

4. While window is valid:
   - Calculate current window length (right - left + 1)
   - Update minLen with smaller value
   - Remove nums[left] from sum (shrink window)
   - Move left pointer forward

5. Repeat:
   - Expand with right
   - Shrink with left when condition is met

6. After loop ends:
   - If minLen is still infinity → no valid subarray → return 0
   - Else → return minLen

KEY IDEA:
Expand → Make valid → Shrink → Find minimum
*/

/*
TIME COMPLEXITY ANALYSIS:

1. Outer for loop runs from 0 to n-1
   → So it runs O(n) times

2. Inner while loop:
   → At first glance, it looks nested (O(n²))
   → But actually NOT O(n²)

3. Important observation:
   - Each element is added to sum ONCE (by right pointer)
   - Each element is removed from sum ONCE (by left pointer)

   → left pointer moves from 0 to n only once
   → right pointer also moves from 0 to n only once

4. So total operations:
   → right moves n times
   → left moves n times

   → Total = O(n + n) = O(n)

FINAL TIME COMPLEXITY:
→ O(n) (linear time)

SPACE COMPLEXITY:
→ O(1) (no extra space used, only variables)

KEY IDEA:
Even though there is a while loop inside for loop,
both pointers move only forward → no repeated work
*/