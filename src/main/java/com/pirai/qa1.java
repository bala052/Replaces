package com.pirai;

import java.util.Arrays;
import java.util.List;
//Replace all digits in a string with "#" using replaceAll() and regex.
//
//Write a program to replace all whitespace (\s) with underscores using regex.
//
//Replace all occurrences of the word "java" regardless of case (use (?i)).
//
//Replace every word that starts with "j" or "J" with "REPLACED" using regex.
//
//Replace "is" with "was" only if it's a whole word, not part of other words (e.g., don’t change “this”).
public class qa1
{
    public static void main(String[] args) {
        List<String> k= Arrays.asList("hi09ll2028","destroyer2021","collapse2017");
        k.stream()
                .map(s->s.replaceAll("\\d","#"))
                .forEach(System.out::println);

        String ko="hello all hi everyone";
        String ko1=ko.replaceAll("\\s","_");
        System.out.println(ko1);

        String r="java is good,jAVa is great,JAVA is goodgreat";
        String l=r.replaceAll("(?i)java","javaC");
        System.out.println(l);

        List<String> p=Arrays.asList(" is java python","Java is kotlin"," is c++ java");
        p.stream()
                //.map(s->s.replaceAll("(?i)(?m)^java","REPLACED"))//It only change replaced when java at very first
                .map(s->s.replaceAll("(?i)\\bj\\w*","REPLACED"))// It change java if java in middle ,first or last
                .forEach(System.out::println);

        String text = "This is important. This is not a dish.";
        //String t1=text.replace("is","and");//Thand and important. Thand and not a dandh.
        String t1=text.replaceAll("\\bis\\b","was");// \\b it set boundary ---> (This was important. This was not a dish.)
        System.out.println(t1);

    }
}
