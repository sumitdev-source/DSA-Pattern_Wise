/* Fruit Into Baskets
Question Link: https://leetcode.com/problems/fruit-into-baskets/

You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

 

Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
 

Constraints:

1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length
 */


package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LC_904_FruitIntoBaskets {
  public static int totalFruit(int[] fruits) {
    int n = fruits.length; // total number of elements in the array
    
    int left = 0; // left pointer of the sliding window
    int maxLen = 0; // stores the maximum number of fruits we can collect

    Map<Integer, Integer> freq = new HashMap<>(); 
    // this map stores the count of each fruit type in the current window

    for (int right = 0; right < n; right++) {
        // add current fruit to the map or increase its count
        freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

        // if we have more than 2 types of fruits, shrink the window
        while (freq.size() > 2) {
            int leftFruit = fruits[left]; // fruit at the left pointer

            // decrease its count in the map
            freq.put(leftFruit, freq.get(leftFruit) - 1);

            // if count becomes 0, remove it from the map
            if (freq.get(leftFruit) == 0)
                freq.remove(leftFruit);

            left++; // move the left pointer to the right
        }

        // calculate the current window size and update max length
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen; // return the maximum number of fruits collected
}

public static void main(String[] args) {
  int[] n = {1,2,1};
  System.out.println("Output: " + LC_904_FruitIntoBaskets.totalFruit(n));
}
}


/*
======================== QUESTION REQUIREMENT ========================

You are given an array where each element represents a fruit type.

You have 2 baskets.
Each basket can only hold ONE type of fruit.

Goal:
Pick fruits from the array such that:
- You start from any index
- You move continuously (no skipping)
- You can only collect at most 2 types of fruits

Return the maximum number of fruits you can collect.

Example:
Input: [1,2,1]
Output: 3  (you can take all since only 2 types)

Input: [1,2,3,2,2]
Output: 4  (best subarray is [2,3,2,2])

======================================================================
*/


/*
======================== THINKING PROCESS ========================

1. We need a subarray (continuous part of array)
2. Condition: at most 2 different fruit types
3. We want the LONGEST such subarray

Brute force:
- Try all subarrays → too slow (O(n^2))

Better idea:
- Use SLIDING WINDOW

Why sliding window?
Because:
- We are dealing with a continuous subarray
- We need to expand and shrink dynamically

Steps:
1. Use two pointers:
   - left (start of window)
   - right (end of window)

2. Move right pointer forward (expand window)

3. Keep track of fruit counts using a map

4. If more than 2 fruit types:
   - shrink window from left side
   - reduce count in map
   - remove fruit if count becomes 0

5. At every step:
   - calculate window size
   - update maximum answer

==================================================================
*/


/*
======================== CODE FLOW ========================

1. Start with:
   - left pointer at 0
   - maxLen = 0
   - empty map to store fruit counts

2. Move right pointer one by one:
   - add current fruit into map
   - increase its count

3. Check condition:
   - if map size > 2 (more than 2 fruit types)

4. If condition breaks:
   - start shrinking from left
   - decrease count of left fruit
   - if count becomes 0 → remove from map
   - move left forward

5. Once valid (only 2 types):
   - calculate window size (right - left + 1)
   - update maxLen

6. Repeat until right reaches end

7. Return maxLen

===========================================================
*/


/*
======================== SHORT TRICK ========================

👉 "At most 2 types" → think Sliding Window + HashMap

👉 Rule:
   - Expand (right++)
   - If invalid → shrink (left++)

👉 Goal:
   - Always maintain a VALID window
   - Track maximum size of that window

=============================================================
*/

/*
======================== TIME COMPLEXITY ========================

Time Complexity: O(n)

Why?

- The right pointer moves from 0 → n (each element once)
- The left pointer also moves from 0 → n (at most once)

👉 Each element is added and removed from the map at most ONE time

So total operations ≈ 2 * n → ignore constant → O(n)

===============================================================


======================== SPACE COMPLEXITY ========================

Space Complexity: O(1)

Why?

- Map stores at most 2 fruit types
- So size is always small (constant)

===============================================================
*/