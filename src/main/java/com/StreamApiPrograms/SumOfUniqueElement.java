package com.StreamApiPrograms;

import java.util.*;

/*
Given an array to find the sum of unique elements.
input:
int[] arr = {1,6,7,8,1,1,8,8,7};
output: 22 (1+6+7+8)
 */
public class SumOfUniqueElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,6,7,8,1,1,8,8,7};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println("sum is : " +sum);

        //normal way to find the sum of unique elements
        List<Integer> ar =  new LinkedList<Integer>();
        for( int a: arr)
        {
            ar.add(a);
        }
        Set<Integer> distinct =  new HashSet<Integer>();
        distinct.addAll(ar);
        System.out.println(distinct);
        int sum1 =0;
        for ( int i: distinct)
        {
            sum1= sum1+i;
        }
        System.out.println("Using set finding sum of unique elements :" + sum1);
// third way to find the unique element
        int[] unique = new int[arr.length];
        int sum2=0, k=0;
        for( int i=0;i<arr.length;i++)
        {
            for( int j=0;j<=i;j++)
            {
                if(i==j)
                {
                    unique[k++]=arr[i];
                   sum2 = sum2+arr[i];
                }
                else if(arr[i]==arr[j])
                {
                    break;
                }
            }
        }
        System.out.println("Third way to find the sum of unique elements : " + sum2);
    }




}
