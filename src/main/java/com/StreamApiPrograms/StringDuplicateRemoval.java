package com.StreamApiPrograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/* Remove duplicate from the string and return in the same order

Input:
String = dabcadefg
output:
dabcefg

 */public class StringDuplicateRemoval 
{
    public static void main(String[] args) {
        String content = "dDbcadefg";
        String name = Arrays.stream(content.split("")).distinct().collect(Collectors.joining());
        System.out.println(name);
    }
}




