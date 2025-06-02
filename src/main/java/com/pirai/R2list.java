package com.pirai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class R2list
{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("python is good");
        list.add("python is really good");
        list.add("python is really very good");
//        for(int i=0;i< list.size();i++){
//            list.set(i, list.get(i).replace("python","java"));
//        }
//        System.out.println(list);
//        list.stream()
//                .map(s->s.replace("good","gooood"))
//                .forEach(System.out::println);
        List<String> list1= Arrays.asList(" is good java","java is really good","java is very good");
//        list1.stream()
//                //.map(s->s.replaceAll("(?i)java", "Go"))//(?i) it makes every word as small or big and replace everything
//                //.map(s->s.replaceAll("(?m)^java","jio"))//JAVA is good , jio is really good , jio is very good...if java is first word it will change to jio
//                .map(s->s.replaceAll("(?m)java$","jio"))//if java is last word it will change to jio....//is good jio ,java is really good ,java is very good
//                .forEach(System.out::println);
        list1.stream()
                .map(s->s.startsWith("java")?s.replace("java","kol"):s)//if java is first word it will change to kol
                .forEach(System.out::println);

    }
}
