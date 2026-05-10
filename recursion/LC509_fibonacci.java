/* 509. Fibonacci Number
Question Link : https://leetcode.com/problems/fibonacci-number/description/

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30

*/

package recursion;

public class LC509_fibonacci {

  static int fib(int n){
      if(n == 0) return 0; 
      if(n == 1) return 1;

      return fib(n-1) + fib(n-2);

  }

  public static void main(String[] args) {
    /* 
    //if you want to find fibonacci number at 8 index.
    int n = 8;
    System.out.println(fib(n));
    */

    /* 
    //if you want print fibonacci till 8 index
    int n = 8;
    for(int i= 0; i<n; i++ ){
      System.out.print(fib(i) + " ");
    }
    */
  }
}


// Flow of the Code:
//
// 1. The fib(n) function is called with a number n.
//
// 2. The function first checks:
//    - If n == 0, return 0
//    - If n == 1, return 1
//
// 3. If n is greater than 1:
//    - The function calls itself two times:
//         fib(n-1)
//         fib(n-2)
//
// 4. Then it adds both results:
//         fib(n-1) + fib(n-2)
//
// 5. This process keeps repeating until
//    it reaches the base cases (0 or 1).
//
// 6. Finally, all returned values are added
//    together to get the Fibonacci number.


// Example Flow for fib(4)
//
// fib(4)
// = fib(3) + fib(2)
//
// fib(3)
// = fib(2) + fib(1)
//
// fib(2)
// = fib(1) + fib(0)
//
// fib(1) = 1
// fib(0) = 0
//
// Now add values back:
//
// fib(2) = 1 + 0 = 1
// fib(3) = 1 + 1 = 2
// fib(4) = 2 + 1 = 3
//
// So:
// fib(4) = 3



// Time Complexity: O(2^n)
//
// Easy Explanation:
//
// For every function call, the code creates
// two more function calls:
//
// fib(n-1)
// fib(n-2)
//
// Example:
//
// fib(5)
// ├── fib(4)
// │   ├── fib(3)
// │   └── fib(2)
// └── fib(3)
//     ├── fib(2)
//     └── fib(1)
//
// The function keeps splitting into more calls,
// like branches of a tree.
//
// Many values are calculated again and again.
// Example:
// fib(3) is calculated multiple times.
//
// As n becomes bigger,
// the number of function calls increases very fast.
//
// That is why time complexity is:
// O(2^n)
//
// Simple imagination:
//
// n increases a little
// but work increases DOUBLE again and again.
//
// So this recursive Fibonacci solution
// is slow for large numbers.