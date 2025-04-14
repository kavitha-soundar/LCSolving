package com.StreamApiPrograms;

import java.util.Arrays;
import java.util.Comparator;
//Given a sentence, find the word that has the longest length

public class LongestString {
    public static void main(String[] args) {
        String[]  names = {"Kavi", "Naresh Kumar","Dhanalakshmi","DevaRakshitha", "Krishali"};
        String name = Arrays.stream(names).max(Comparator.comparing(String::length)).get();
        System.out.println(name);

        String paragraph = "This is java programming practicing with stream api coding exercises";
        String longestword = Arrays.stream(paragraph.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(longestword);
    }
}
