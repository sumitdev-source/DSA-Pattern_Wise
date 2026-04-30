/* 3. Longest Substring Without Repeating Characters
  Question link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

  Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
*/

// Find length of longest substring with all unique characters

// Substring = continuous (no skipping)
// Subsequence is NOT allowed

// Only return length, not the substring

// Characters inside window must be unique (no duplicates)

// No 'k' is given → window size is dynamic (we control it using left & right pointers)

// Multiple valid substrings possible → return max length

// Edge cases:
// "" → 0
// "aaaa" → 1

// Input can contain letters, digits, symbols, spaces

// Constraint is large → use O(n) (sliding window), avoid O(n²)



package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LC_3_longsubstrngwithoutrepeat {
    public static int lengthOfLongestSubstring(String s) {
     int n = s.length(); 
        // total length of string → loop will run till here

        int left = 0, maxLen = 0; 
        // left = start of current window
        // maxLen = best answer we have found so far

        Map<Character, Integer> lastIndex = new HashMap<>();
        // store where each character was last seen
        // → helps us quickly detect duplicates

        for (int right = 0; right < n; right++) {
            // right pointer moves forward → window grows

            char c = s.charAt(right);
            // get current character

            if (lastIndex.containsKey(c)) {
                // if duplicate found → shrink window

                left = Math.max(left, lastIndex.get(c) + 1);
                // move left forward to remove duplicate
            }
            // if NO duplicate:
            // → do nothing with left
            // → window automatically expands as right moves

            lastIndex.put(c, right);
            // update latest position of current character

            maxLen = Math.max(maxLen, right - left + 1);
            // calculate window size and update max length
        }

        return maxLen;
        // return longest length found
}
  
}

// Start with an empty window
// left = start of window, right = end (moving forward)

// Move right pointer one by one through the string
// → take current character

// If character is already seen before:
// → move left pointer to skip the duplicate
// → jump to (last seen index + 1)

// Store/update current character’s latest index

// Calculate current window size
// → (right - left + 1)

// Update max length if this window is bigger

// Repeat until end of string

// Return the maximum length found



/*
// One-line idea:
// Expand window, if duplicate found → shift left, keep updating max length

// Do’s:
// Always update last index of character
// Move left pointer only forward (never backward)

// Don’ts:
// Don’t move left pointer backward (breaks window logic)
// Don’t ignore duplicates (window must have unique characters)
*/

// Time Complexity: O(n)
// → right pointer runs from 0 to n-1 (single loop)
// → left pointer also moves forward (never goes back)
// → each character is processed at most once
// → HashMap operations (put/get/containsKey) are O(1)

// So overall: O(n)

// Space Complexity: O(n)
// → in worst case, all characters are unique
// → HashMap stores all n characters
// → so space = O(n)