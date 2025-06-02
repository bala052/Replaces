package com.pirai;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a custom method to replace all vowels with * in a string using StringBuilder.
//
//Replace a substring at the end of each line in a multiline string (e.g., replace "done" only if it ends a line).
//
//Replace each element in a List<String>: replace "error" with "ok" in all elements.
//
//Replace based on a Map<String, String>: for example, replace "dog" → "cat", "apple" → "banana" in a sentence.
//
//Replace all numbers greater than 100 in a string with "BIG" (hint: use regex and Matcher).
public class qa2
{
    public static void main(String[] args) {
        String s1="hello hi everyone,ask blast";
        String s2=replaceVowels(s1);
        System.out.println(s2);

        String ss="hello job done\njob is progressing\nalmost job is done\njob is ongoing";
        String sss=ss.replaceAll("(?m)done$","dunee");
        System.out.println(sss);

        List<String> list=new ArrayList<>();
        list.add("it causes error");
        list.add("it will be Error");
        list.add("error is alright");
        list.stream()
                .map(s->s.replaceAll("(?i)error","ok"))
                .forEach(System.out::println);


        String s="hello dog ,hotdog, eat apple";
        Map<String,String> map=new HashMap<>();
        map.put("dog","cat");
        map.put("apple","banana");
        for(Map.Entry<String,String> entry:map.entrySet()){
            //s=s.replaceAll(entry.getKey(), entry.getValue();// if you don't use \\b you will get output like this ---> hello cat ,hotcat, eat banana
            s=s.replaceAll("\\b"+entry.getKey()+"\\b",entry.getValue());// if you use \\b you will get output like this ---> hello cat ,hotdog, eat banana
        }
        System.out.println(s);

        String q="124,100,120,13,140,15,165,178,19,10,240";
        Pattern p=Pattern.compile("\\d+");
//        Use \\d+ when you want to match complete numbers.it checks every number if it 101 it will take it as a 101 not 1,0,1
//        Use \\d only when you want to work with individual digits. this one break the 124 to --> 1,2,4 so it doesn't give proper answer
        Matcher m=p.matcher(q);
        StringBuilder result=new StringBuilder();
       while (m.find()){
           int n=Integer.parseInt(m.group());
           if(n>=100){
             m.appendReplacement(result,"Big");
           }
           else m.appendReplacement(result,m.group());
       }
       m.appendTail(result);
        System.out.println(result);
    }


    public static String replaceVowels(String input){
StringBuilder sb=new StringBuilder();
for(char c:input.toCharArray()){
    if(isVowel(c)){
     sb.append("*");
    }
    else sb.append(c);
}
return String.valueOf(sb);
    }
    public static boolean isVowel(char s){
        return s=='a'|| s=='e' || s=='i' || s=='o' || s=='u';
    }
}


