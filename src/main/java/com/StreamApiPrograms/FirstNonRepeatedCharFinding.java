package com.StreamApiPrograms;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Given a String, Find the first non repeated character
input: Hello world
output : H
 */
public class FirstNonRepeatedCharFinding
{
    public static void main(String[] args) {
        String content =  "Hello World";
        // first way to find the non-repeated char using stream api
        Optional<String> result =  Arrays.stream(content.toLowerCase().split(""))
                .filter(c->content.toLowerCase().indexOf(c)==content.toLowerCase()
                .lastIndexOf(c)).findFirst();
        if(result.isPresent())
        {
            System.out.println(" The first way to find the non repeated char :" +result.get());
        }
        else
            System.out.println(" No character is non repeated ");

        // Second way to find the non-repeated char using stream api
        Map<Character, Long> result2= content.toLowerCase().chars().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> res = result2.entrySet().stream().
                filter(x->x.getValue()==1).map(Map.Entry::getKey).findFirst();

        if(res.isPresent())
        {
            System.out.println("second way to find the non repeated char: "+res.get());
        }
        else
            System.out.println(" No char found without repetition");
        System.out.println(result2);

        // Third way to find the  non-repeated char
        char[] arr= content.toLowerCase().toCharArray();
        int firstIndex;
        int lastIndex;
        for (char c : arr) {
            firstIndex = content.toLowerCase().indexOf(c);
            lastIndex = content.toLowerCase().lastIndexOf(c);
            if (firstIndex == lastIndex) {
                System.out.println("first non repeated char is : " + c);
                break;
            }
        }




    }
}
