package com.leetcode.easyQuestions.IntegersQuestions;
/*
Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1
 */
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        System.out.println(PalindromeNumber.isPalindrome(121));
        System.out.println(PalindromeNumber.isPalindrome(-121));
        System.out.println(PalindromeNumber.isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        int sum=0, r=0;
        int y=x;
        while(y>0)
        {
            r=y%10;
            sum=(sum*10)+r;
            y=y/10;
        }
        if(sum==x)
            return true;
        else
            return false;

    }
}
