package com.leetcode.easyQuestions.StringQuestions;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
 */
public class LongestCommonPrefix {


    public static void main(String[] args) {
        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};
        LongestCommonPrefix prefix = new LongestCommonPrefix();
        System.out.println("Longest prefix for input 1 is " + prefix.lcp1(input1));
        System.out.println("Longest prefix for input 1 is " + prefix.lcp1(input2));
        System.out.println("Longest prefix for input 1 is " + prefix.longestCommonPrefix(input1));
        System.out.println("Longest prefix for input 1 is " + prefix.longestCommonPrefix(input2));
    }

    public String lcp1(String[]  strs)
    {
        int length= strs.length;
        String Prefix = strs[0];
        for(int i=1; i<length;i++)
        {
            while(strs[i].indexOf(Prefix) !=0)
            {
                Prefix=Prefix.substring(0,Prefix.length()-1);
                if(Prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return Prefix;

    }

    public String longestCommonPrefix(String[] strs) {

        String firstOne= strs[0];
        int i=0, j=Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        int length = strs.length;
        for (String str : strs) {
            if (str.length() < j) {
                j = str.length();
            }
        }
        while(i<j)
        {
            int l=0;
            for(int k =1;k<length;k++)
            {
                if(firstOne.charAt(i)==strs[k].charAt(i))
                {
                   l++;
                }
                else
                    break;
            }
          if(l==length-1)
          {
              result.append(firstOne.charAt(i));
          }
          i++;
        }
         return result.toString();
    }

}




