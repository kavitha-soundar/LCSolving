package com.StreamApiPrograms;


import java.util.Arrays;
import java.util.Comparator;

/*
Given a sentence. Find the word that has the second highest length.
Input:  I am learning stream api in java
output : stream
 */
public class StringSecondHighestLengthFinding
{
    public static void main(String[] args)
    {
        // This one prints the string value the second highest string
        String content = "I am learning stream api in java ";
        String result = Arrays.stream(content.split(" ")).sorted(Comparator.comparing(String::length)
                .reversed()).skip(1).findFirst().get();
        System.out.println(result);

        // this one using map - converting the result from string to string length
        // and then getting the result of 2nd highest length integer
        int length = Arrays.stream(content.split(" ")).map(String::length).
                sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(length);
    }
}
