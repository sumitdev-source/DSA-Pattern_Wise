/* Longest Substring with K Uniques
  
 Question Link: https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

   You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
Input: s = "aaaa", k = 2
Output: -1
Explanation: There's no substring with 2 distinct characters.
Input: s = "aabaaab", k = 2
Output: 7
Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
Constraints:
1 ≤ s.size() ≤ 105
1 ≤ k ≤ 26

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)
*/


package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class GFG_LongSubstrgKUniq {
     public static int longestKSubstr(String s, int k) {
    int n = s.length();
    int low = 0;          // left pointer (start of window)
    int res = -1;         // answer (default is -1 if no valid substring found)

    Map<Character, Integer> freq = new HashMap<>(); // stores frequency of characters

    for (int high = 0; high < n; high++) {  // right pointer (expands window)
        char c = s.charAt(high);

        // increase count of current character
        // if character is not present, default value 0 is used, then +1
        freq.put(c, freq.getOrDefault(c, 0) + 1);

        // if number of unique characters becomes more than k
        // shrink the window from the left side
        while (freq.size() > k) {
            char leftChar = s.charAt(low);

            // decrease count of left character
            freq.put(leftChar, freq.get(leftChar) - 1);

            // if count becomes 0, remove it from map
            // because it is no longer in the current window
            if (freq.get(leftChar) == 0) {
                freq.remove(leftChar);
            }

            low++; // move left pointer to the right
        }

        // if exactly k unique characters are present
        if (freq.size() == k) {
            // calculate window length and update max result
            res = Math.max(res, high - low + 1);
        }
    }

    // if no valid substring found, return -1
    return res;
  
}
 public static void main(String[] args) {
    String s = "aabacbebebe";
    int k = 3;
    System.out.println(GFG_LongSubstrgKUniq.longestKSubstr(s, k));
 }
}


// ===================== PROBLEM REQUIREMENT =====================
// You are given a string and a number k.
// Find the length of the longest substring that has exactly k unique characters.
// If no such substring exists, return -1.


// ===================== CORE IDEA =====================
// We use a sliding window technique.
// A "window" means a part of the string we are currently looking at.

// We use two pointers:
// - left pointer → start of window
// - right pointer → end of window

// We also use a map to:
// - store characters in the current window
// - track how many times each character appears


// ===================== THINKING PROCESS =====================
// 1. Start expanding the window from the right.
// 2. Add characters to the map and update their count.
// 3. Keep track of how many unique characters are inside the window.

// 4. If number of unique characters becomes MORE than k:
//    → window is invalid
//    → shrink the window from the left
//    → keep removing characters until unique count becomes ≤ k

// 5. If number of unique characters becomes EXACTLY k:
//    → window is valid
//    → calculate its length
//    → update the maximum length


// ===================== IMPORTANT CONDITIONS =====================
// Case 1: unique < k
// → not enough characters yet
// → keep expanding

// Case 2: unique == k
// → valid substring
// → update answer

// Case 3: unique > k
// → invalid substring
// → shrink window from left


// ===================== WHY WE USE MAP =====================
// The map helps us:
// - know how many times each character appears
// - know when a character completely leaves the window (count becomes 0)
// - know how many unique characters exist (map size)


// ===================== FINAL RESULT =====================
// If we found at least one valid substring:
// → return maximum length

// If we never found any valid substring:
// → return -1 (default value)


// ===================== ONE LINE SUMMARY =====================
// Expand window → if invalid shrink → if valid update answer


// ===================== TIME COMPLEXITY =====================

// Overall Time Complexity: O(n)

// Reason:
// - The right pointer (high) moves from left to right → O(n)
// - The left pointer (low) also moves from left to right → O(n)

// Important:
// Each character is added to the window once (by high)
// Each character is removed from the window at most once (by low)

// So even though there is a while loop inside the for loop,
// it does NOT make the complexity O(n^2)

// Because:
// total movements of low + high ≤ 2n

// Therefore:
// Time Complexity = O(n)


// ===================== SPACE COMPLEXITY =====================

// Space Complexity: O(k)  (or O(26) for lowercase letters)

// Reason:
// - We store at most k unique characters in the map
// - In worst case, map can hold all unique characters (max 26)

// So:
// Space Complexity = O(1) (since 26 is constant)
