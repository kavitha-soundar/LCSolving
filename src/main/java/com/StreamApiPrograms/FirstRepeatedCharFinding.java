package com.StreamApiPrograms;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Given a string, find the first repeated character
input: Hello world
output :l
 */
public class FirstRepeatedCharFinding
{
    public static void main(String[] args)
    {
        String content= "Helo wrd";
        Map<Character,Long> result= content.toLowerCase().chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        Optional<Character> repeat=  result.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst();
        if(repeat.isPresent())
        {
            System.out.println("First repeated character is : "+ repeat.get());
        }
        else
            System.out.println("there is no single character without repetition");
    }
}
