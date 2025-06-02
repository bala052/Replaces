package com.pirai;

import java.util.Arrays;
import java.util.List;
//Write a Java program to replace all occurrences of "a" with "@" in a given string.
//
//Replace the word "hello" with "hi" in the sentence "hello world, hello user!".
//
//Replace spaces " " with hyphens "-" in a string.
//
//Replace the word "Java" with "Python" only once (first occurrence).
//
//Replace all vowels in a string with * using replace() (not regex).
public class qa
{
    public static void main(String[] args) {
        List<String> a= Arrays.asList("arabian","broadway","operation");
        a.stream()
                .map(s->s.replace("a","@"))
                .forEach(s-> System.out.println(s));

        String text="hello world, hello user!";
        String replacee=text.replace("hello","hi");
        System.out.println(replacee);

        String s="goof guh";
        String replace = s.replace("f","d");
        System.out.println(replace);

        String text1="hello world, hello user!";
        String replace2=text1.replaceAll("\\s","-");
        System.out.println(replace2);

        String input = "Java is great Java is popular Java is powerful.";
//      String s=input.replace("Java","python");//python is great python is popular python is powerful.
        String s2=input.replaceFirst("Java","python");//python is great Java is popular Java is powerful.
        System.out.println(s2);

        String s1="all is good and well";
        String s11=s1.replaceAll("[aeiouAEIOU]","*");
        System.out.println(s11);

    }
}
