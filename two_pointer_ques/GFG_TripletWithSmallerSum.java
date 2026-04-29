/* Triplets with Smaller Sum
Question Link- https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1

Given an array arr[] of distinct integers and a value sum, find the count of triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than the given value sum.

Examples :

Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 
Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).
Constraints:
1 ≤ sum ≤ 105
3 ≤ arr.size() ≤ 103
-103 ≤ arr[i] ≤ 103
*/

package two_pointer_ques;

import java.util.Arrays;

class GFG_TripletWithSmallerSum {

    // Function to count triplets with sum less than given value
    public int countTriplets(int sum, int arr[]) {

        // Step 1: Sort the array (important for two-pointer approach)
        Arrays.sort(arr);

        int n = arr.length;
        int count = 0;

        // Step 2: Fix one element (arr[i])
        for (int i = 0; i < n - 2; i++) {

            // Two pointers for remaining part of array
            int left = i + 1;      // next element after i
            int right = n - 1;     // last element

            // Step 3: Use two-pointer technique
            while (left < right) {

                // Calculate current sum of triplet
                int currSum = arr[i] + arr[left] + arr[right];

                // If sum is smaller than given value
                if (currSum < sum) {

                    // IMPORTANT LOGIC:
                    // If arr[i] + arr[left] + arr[right] < sum
                    // then all elements from left to right-1 will also work
                    // So we add (right - left) to count
                    count += (right - left);

                    // Move left pointer forward
                    left++;

                } else {
                    // If sum is too large, reduce it by moving right pointer
                    right--;
                }
            }
        }

        // Return total count of valid triplets
        return count;
    }

    // Main function to test the code
    public static void main(String[] args) {

        GFG_TripletWithSmallerSum obj = new GFG_TripletWithSmallerSum();

        // Example 1
        int arr1[] = {-2, 0, 1, 3};
        int sum1 = 2;

        int result1 = obj.countTriplets(sum1, arr1);
        System.out.println("Count of triplets (Example 1): " + result1);

        // Example 2
        int arr2[] = {5, 1, 3, 4, 7};
        int sum2 = 12;

        int result2 = obj.countTriplets(sum2, arr2);
        System.out.println("Count of triplets (Example 2): " + result2);
    }
}

/*
In short = Fix 1 number + use two pointers + count many triplets in one go

Flow ;

Step 1:
Sort the array.
So all numbers are in increasing order.

Step 2:
Take one number at a time (arr[i]).
This is the first number of the triplet.

Step 3:
Now we need 2 more numbers.
So we use two pointers:
left = i + 1  (next element)
right = n - 1 (last element)

Step 4:
Run a loop while left < right.

Step 5:
Find current sum:
arr[i] + arr[left] + arr[right]

----------------------------------

Step 6 (Main Logic):

If sum < given sum:
→ This triplet is valid ✅

Now important thinking:

We are using the biggest value at "right".

If this biggest value already makes the sum valid,
then all smaller values before right will also work.

So instead of checking each one:
we directly count all those triplets:

count += (right - left)

👉 This means:
All pairs between left and right are valid with arr[i]

Then move left forward (left++)
to try next new value.

----------------------------------

Step 7:

If sum >= given sum:
→ Sum is too big ❌

So we reduce it by moving right backward (right--)

----------------------------------

Step 8:
Repeat until left and right meet.

Step 9:
Move to next i and repeat same process.

Step 10:
Return total count.
*/

// Time Complexity Analysis:

// Step 1: Sorting the array
// Arrays.sort(arr) takes O(n log n)

// Step 2: Outer loop runs (n - 2) times → approx O(n)

// Step 3: Inner while loop (two-pointer)
// For each i, left and right pointers move at most n times total
// So inner loop runs O(n) for each i

// Total Time Complexity:
// O(n log n) + O(n * n)
// = O(n^2)

// Final Time Complexity: O(n^2)