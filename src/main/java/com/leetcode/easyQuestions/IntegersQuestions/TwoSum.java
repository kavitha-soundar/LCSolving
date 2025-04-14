package com.leetcode.easyQuestions.IntegersQuestions;

import java.util.Arrays;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
 */
public class TwoSum {

    public static void main(String[] args)
    {
        int [] nums1= {2,7,11,15};
        int [] nums2= {3,2,4};
        int [] nums3 = {3,3};
        int target1 = 9, target2= 6, target3= 6;
        TwoSum sum = new TwoSum();

        System.out.println(Arrays.toString(sum.twoSum(nums1, target1)));
        System.out.println(Arrays.toString(sum.twoSum(nums2, target2)));
        System.out.println(Arrays.toString(sum.twoSum(nums3, target3)));
    }
    public int[] twoSum(int[] nums, int target)
    {
        int [] result = {0,0};
        if( 2 <= nums.length && nums.length <= Math.pow(10,4))
        {
            for( int i=0 ;i < nums.length;i++)
            {
                if((Math.pow(-10,9) <= nums[i] && nums[i] <= Math.pow(10,9)) &&
                        (Math.pow(-10,9) <= target && target <= Math.pow(10,9)))
                {
                    for( int j=1 ;j < nums.length;j++)
                    {
                        if((nums[i]+nums[j])== target)
                        {
                            result[0]=i;
                            result[1]=j;
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }
}
