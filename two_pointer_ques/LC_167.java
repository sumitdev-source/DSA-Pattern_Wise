/* Two Sum II - Input Array Is Sorted
Question Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 

Constraints:

2 <= numbers.length <= 3 * 104
-1000 <= numbers[i] <= 1000
numbers is sorted in non-decreasing order.
-1000 <= target <= 1000
The tests are generated such that there is exactly one solution.
*/

package two_pointer_ques;
import java.util.Arrays;
public class LC_167 {
  public int[] twoSum(int[] numbers, int target) {
     int first = 0;
     int second = numbers.length - 1;
     while(first < second){
       int sum = numbers[first] + numbers[second];
       if(sum == target){
         return new int[]{first+1, second+1};
       } else if(sum < target) {
        first++;
       } else {
        second--;
       }
     }
     return new int[]{};
  }

  public static void main(String[] args){
    int[] s = {1,2,3}; 
    int target = 5;
    LC_167 a = new LC_167();
    a.twoSum(s, target);
    int[] res = a.twoSum(s, target);
    System.out.println(Arrays.toString(res));
  }
}


// Step 1: Start with two pointers
// 'first' at the beginning (index 0)
// 'second' at the end (last index)

// Step 2: Run a loop while first < second

// Step 3: Inside loop, calculate sum of elements at both pointers

// Step 4: Check conditions:

// If sum == target:
// → We found the required pair
// → Return their positions (add +1 because index is 1-based)

// If sum < target:
// → Current sum is too small
// → Move 'first' forward to increase sum

// If sum > target:
// → Current sum is too large
// → Move 'second' backward to decrease sum

// Step 5: Repeat until pointers meet

// Step 6: If no pair is found:
// → Return empty array


// Time Complexity: O(n)
//
// Explanation:
// The algorithm uses two pointers (one at the start and one at the end).
// In each iteration, either the first pointer moves forward or the second pointer moves backward.
// Each element is processed at most once, so the total number of operations is proportional to n.