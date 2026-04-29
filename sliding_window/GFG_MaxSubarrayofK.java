/* Max Sum Subarray of size K
Question Link - https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 106
1 ≤ k ≤ arr.size()

*/

package sliding_window;


 public class GFG_MaxSubarrayofK{
   
  static class Solution {
    public int maxSubarraySum(int[] arr, int k) {
    int n = arr.length;     // total number of elements
    int sum = 0;            // to store current window sum

    // Step 1: calculate sum of first window (size = k)
    for(int i = 0; i < k; i++){
        sum += arr[i];      // add first k elements
    }

    int res = sum;          // store max sum found so far

    // Step 2: slide the window from index k to end
    for(int i = k; i < n ; i++){
        // remove left element and add new right element
        sum = sum - arr[i - k] + arr[i];

        // update maximum sum if needed
        res = Math.max(res, sum);
    }

    return res;             // return maximum subarray sum of size k
}
   }

   public static void main(String[] args) {
      Solution sol = new Solution();
      int[] arr = {100, 200, 300, 400};
      int k = 2;
      int res = sol.maxSubarraySum(arr, k);
      System.out.println(res);
   }
 }


 /*
 Flow of the code (easy English)
First, take the size of the array.
Then, calculate the sum of the first k elements.
This becomes the first window.
Store this sum as the current maximum result.
Now start moving the window one step at a time:
Remove the element that is going out from the left side
Add the new element that is coming in from the right side
After updating the sum, compare it with the current maximum.
If it is bigger, update the maximum.
Repeat this process until you reach the end of the array.
Finally, return the maximum sum found among all windows.

One-line understanding

👉 Build first window → slide it → update max → return answer

Agar beginner ho, to bas itna yaad rakho:
👉 Har baar pura sum dobara nahi nikalte, sirf ek element minus aur ek plus karte hain 👍
 */

/* 
Time Complexity Analysis:

Step 1: First loop runs k times → O(k)
Step 2: Second loop runs (n - k) times → O(n - k)

Total Time = O(k) + O(n - k)
           = O(n)

Final Time Complexity: O(n)
(linear time, very efficient)
*/