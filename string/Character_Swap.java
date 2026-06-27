package string;
/*
Write a Java program to swap specific characters in a string.

Given a string, replace every occurrence of 'a' with 'c' and every occurrence of 'c' with 'a'. Characters other than 'a' and 'c' should remain unchanged.

Example 1:
Input:  "abc"
Output: "cba"
Explanation:
'a' becomes 'c'
'b' remains 'b'
'c' becomes 'a'

So, "abc" becomes "cba".
*/

public class Character_Swap {

  public static void main(String[] args) {
    String s = "abc";
    char[] arr = s.toCharArray();
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == 'a'){
        arr[i] = 'c';
      } else if(arr[i] == 'c'){
        arr[i] = 'a';
      }
    }

    s = new String(arr);
    System.out.print(arr);
  }
}