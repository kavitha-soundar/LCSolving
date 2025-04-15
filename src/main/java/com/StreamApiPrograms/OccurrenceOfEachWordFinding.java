package com.StreamApiPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a sentence. Find the occurrence of each word

Input : I am learning stream api in java. java is a coolest programming learning.
 */
public class OccurrenceOfEachWordFinding
{
    public static void main(String[] args) {
        // split regex details \\. -> dot regex
        // \\s -> white space, + symbol -> once or more, * -> zero or more

        String content = "I am learning stream api in java. Java is a coolest programming learning.";
        Map<String,Long> result = Arrays.stream(content.split("\\s+|\\.\\s*|,\\s*")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
        System.out.println(result);
    }
}
