package com.StreamApiPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a word, find the occurrence of each character
input : giving
output g =2, i =2 , v=1,n=1
 */
public class OccurrenceOfEachCharFinding
{
    public static void main(String[] args) {
        String content = "giving";
        Map<String,Long> result= Arrays.stream(content.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(result);
    }
}
