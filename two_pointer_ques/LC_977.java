/*  Squares of a Sorted Array
Question Link- https://leetcode.com/problems/squares-of-a-sorted-array/description/

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
*/

package two_pointer_ques;

import java.util.Arrays;

public class LC_977 {
  public int[] sortedSquares(int[] nums){
    int n = nums.length;
    int[] result = new int[n];
    int left=0, right=n-1;
    int index = n-1;
    while(left <= right) {
      int leftSquare = nums[left]*nums[left];
      int rightSquare = nums[right]*nums[right];
      
      if(leftSquare > rightSquare){
        result[index] = leftSquare;
        left++;
      } else {
        result[index] = rightSquare;
        right--;
      }
      index--;
    }
    return result;
  }

  public static void main(String[] args){
    int[] nums = {-7,-3,2,3,11};
    LC_977 a = new LC_977();
    int[] res = a.sortedSquares(nums);
    System.out.println(Arrays.toString(res));
  }
}

// Time Complexity: O(n)
// Reason: The array is traversed only once using two pointers (left and right).
// Each element is processed exactly one time, so it takes linear time.

/*
Flow ;
First,  we store the total number of elements in the array into a variable n.
Create a new array called result of the same size to store the squared values in sorted order.
First, take two pointers:
left at the start of the array (index 0)
right at the end of the array (index n-1)
Take a variable index = n - 1 to fill the result array from the last position.
Run a loop while left <= right means the loop will run as long as the left pointer has not crossed the right pointer.
Inside the loop, first calculate the square of both the left and right elements. Then compare these two values. 
If the left square is bigger, place it in result[index], move the left pointer forward, and keep the right pointer at the same position. 
Otherwise, place the right square in result[index], move the right pointer backward, and keep the left pointer at the same position.
After placing the value, decrease index by 1 to move to the next position.
Repeat this process until left and right cross each other.
At last, return the result array, which will have all squared values in sorted order.
*/