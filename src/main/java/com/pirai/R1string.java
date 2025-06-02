package com.pirai;

public class R1string
{
    public static void main(String[] args) {
        String s="Hello987 hi098 rookie2355";
        String s2=s.replace("h","hh");
        System.out.println(s2);
        String s3=s.replace("Hello","Arumugam");
        System.out.println(s3);
        String s4=s.replaceAll("\\s","#");
        System.out.println(s4);
        String s5=s.replaceAll("rookie2355","ki");
        System.out.println(s5);
        String s6=s.replaceAll("[aeiouAEIOU]","*");
        System.out.println(s6);
        String s7=s.replaceAll("[aeiouAEIOU\\d]","&");
        System.out.println(s7);
        String input="Java is cool & funky";
        String s8=customReplace(input,"funky","fun");
        System.out.println(s8);

    }
    public static String customReplace(String input, String original, String replacement){
 return input.replace(original,replacement);
}
}
