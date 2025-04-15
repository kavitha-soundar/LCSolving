package com.StreamApiPrograms;

import java.util.Arrays;

/*

given a sentence, find the words with the specified number of vowels
No.of vowels :2
Input :  I am learning stream api in java.
output: stream
api
java

 */
public class VowelsOccurrenceFinding
{
    public static void main(String[] args)
    {
// Using Stream api finding the word with the mentioned vowel count
        String content = "I am Learning Stream API in Java.";
        Arrays.stream(content.split(" ")).filter( x ->
            x.replaceAll("[^aeiouAEIOU]", "").length()==2).forEach(System.out::println);


//normal way to find the word with the mentioned vowel count
        String[] res =  content.split(" ");
        String result ;
        for(String ele: res)
        {
            result =  ele.replaceAll("[^aeiouAEIOU]","");
            if(result.length()==2)
                System.out.println(ele);
        }
    }
}
