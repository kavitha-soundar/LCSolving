package com.StreamApiPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given an array of integers. Group the numbers by the range in which they belong
input: arr ={2,3,10,14,20,24,35,34,48,5,50,67};
output:  {0=[2,3,5],10=[10,14],20=[20,24],30=[35,34],40=[48],50=[50],60=[67]}

logic x is a number  (x/10)*10 will be key, add the x in the value
 */
public class NumbersByRange
{
    public static void main(String[] args)
    {
        int[] content= {2,3,10,14,20,24,35,34,48,5,50,67};
        Map<Integer, List<Integer>> result = Arrays.stream(content).boxed().collect(Collectors.groupingBy(x-> (x/10)*10, LinkedHashMap::new,Collectors.toList()));
        System.out.println(result);
    }
}
