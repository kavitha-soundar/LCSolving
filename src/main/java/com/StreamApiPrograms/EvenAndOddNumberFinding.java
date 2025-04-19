package com.StreamApiPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of integers. Divide it into  two lists one having an even  numbers and another one having an odd numbers.
input : int[] arr = {1,2,3,4,5,6,7,8,9,10}
output: {2,4,6,8,10], [1,3,5,7,9]
 */
public class EvenAndOddNumberFinding
{
    public static void main(String[] args)
    {
    int[] content =  {1,2,3,4,5,6,7,8,9,10};

    // first way to find odd and even number using stream api
List<List<Integer>> result= new ArrayList<>(Arrays.stream(content).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
        .values());

//2nd way to find odd and even numbers using stream api
List<List<Integer>> result2 =Arrays.stream(content).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        System.out.println("Result one is : " +result);
        System.out.println("Result two is : " +result2);

     // Normal way to find the odd and even numbers.
     List<List<Integer>> result3 = new ArrayList<>();
     List<Integer> odd= new ArrayList<>();
     List<Integer> even = new ArrayList<>();
     for(int i=0;i<content.length;i++)
        {
            if( content[i]%2==0)
            {
                even.add(content[i]);
            }
            else
                odd.add(content[i]);
        }
     result3.add(odd);
     result3.add(even);
        System.out.println(result3);

    }
}
