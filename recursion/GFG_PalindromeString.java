/* Palindrome String using Recursion
Question Link : https://www.geeksforgeeks.org/problems/palindrome-string0817/1

You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

Examples :

Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
Constraints:
1 ≤ s.size() ≤ 106
The string s contains only lowercase english letters (a-z).

Expected Complexities :
Time Complexity: O(n)
Auxiliary Space: O(1)
Company Tags :
PaytmZohoMorgan StanleyAmazonD-E-ShawFactSetCiscoFacebook
 
*/


package recursion;

public class GFG_PalindromeString {

  static class Solution {

    boolean isPalindrome(String s) {

        // Start checking from first and last index
        return check(s, 0, s.length() - 1);
    }

    boolean check(String s, int low, int high) {

        // Find current substring length
        int len = high - low + 1;

        // Base case:
        // Length 0 or 1 means palindrome
        if(len <= 1) return true;

        // If characters are different,
        // not a palindrome
        if(s.charAt(low) != s.charAt(high)) {
            return false;
        }

        // Check remaining substring
        return check(s, low + 1, high - 1);
    }
}
   public static void main(String[] args) {
    String s = "a";

        // Create object of Solution class
        Solution obj = new Solution();

        // Store answer
        boolean ans = obj.isPalindrome(s);

        // Print result
        System.out.println(ans);
    
   }
}


// Flow of the Code:
//
// 1. isPalindrome(s) function is called.
//
// 2. It starts checking the string from:
//    - first index -> 0
//    - last index  -> s.length() - 1
//
//    Example:
//    "madam"
//      0 1 2 3 4
//
// 3. Then check() function is called:
//
//    check(s, 0, 4)
//
// 4. Inside check():
//    Current substring length is calculated.
//
//    len = high - low + 1
//
// 5. Base Case:
//    If length becomes 0 or 1,
//    it means all characters matched.
//
//    So return true.
//
// 6. Characters at low and high are compared.
//
//    Example:
//    s.charAt(low)
//    s.charAt(high)
//
// 7. If characters are different:
//    return false.
//
//    Example:
//    "abc"
//
//    a != c
//
//    So it is not palindrome.
//
// 8. If characters are same:
//    move inward:
//
//    low + 1
//    high - 1
//
// 9. Function calls itself again
//    for remaining substring.
//
//    Example:
//
//    "madam"
//
//    m == m
//    check("ada")
//
//    a == a
//    check("d")
//
// 10. When middle is reached,
//     base case returns true.
//
// 11. Finally true returns back
//     through all recursive calls.
//
// So:
// "madam" -> true
// "acv"   -> false



```java id="b2cd2i"
// Time Complexity: O(n)
//
// Easy Explanation:
//
// Here, n = length of the string.
//
// Example:
// s = "madam"
// length = 5
//
// Step-by-step recursion:
//
// check(0,4)  -> compare 'm' and 'm'
// check(1,3)  -> compare 'a' and 'a'
// check(2,2)  -> middle character
// stop
//
// Total recursive calls = 3
//
// Notice:
// In every recursive call,
// we move:
// low  -> forward by 1
// high -> backward by 1
//
// So each call removes 2 characters.
//
// Formula:
//
// Number of calls ≈ n / 2
//
// Example:
//
// n = 6
// calls = 3
//
// n = 8
// calls = 4
//
// n = 10
// calls = 5
//
// We are checking characters only one time.
//
// That is why time complexity is:
//
// O(n)
//
// because work grows linearly with string size.
//
// --------------------------------------------
//
// Space Complexity: O(n)
//
// Because recursion uses function call stack.
//
// Every recursive call waits in memory
// until all smaller calls finish.
//
// Example:
//
// check(0,4)
//   check(1,3)
//     check(2,2)
//
// These calls stay in memory stack.
//
// Maximum recursive depth ≈ n/2
//
// So space complexity is:
//
// O(n)
```


