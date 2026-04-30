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
    int n = s.length(); // length of the string
    int left = 0, maxLen = 0; // left pointer and maximum length found so far
    Map<Character, Integer> lastIndex = new HashMap<>(); // stores last seen index of each character

    for (int right = 0; right < n; right++) { // move right pointer through the string
        char c = s.charAt(right); // current character

        // if the character has been seen before
        if (lastIndex.containsKey(c)) {
            // move left pointer to the position after its last occurrence
            left = Math.max(left, lastIndex.get(c) + 1);
        }

        // update the latest index of the current character
        lastIndex.put(c, right);

        // calculate current window length and update max length
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen; // return the final answer
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