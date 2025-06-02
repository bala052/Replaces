package com.pirai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a function that performs case-insensitive replacement but preserves the original case (e.g., "Java" → "Python", "JAVA" → "PYTHON").
//
//Replace email addresses in a text with [email hidden] using regex.
//
//Replace every third character in a string with # (custom logic).
//
//Replace the last word in every sentence of a paragraph.
//
//Replace all HTML tags from a string using regex.
public class qa3
{
    public static void main(String[] args) {
        String y="java is good and Java is great and Java is complex";
        String ress=caseSensitive(y,"java","python");
        System.out.println(ress);

        String text="hello from@gmail.com to kiol@gmail.com set";
        String email="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String res=text.replaceAll(email,"emailhidden");
        System.out.println(res);

        String te="ndjnjejjnjknnkmnjl";
        String result=changeHash(te);
        System.out.println(result);

        String para="hi hello.greets ji!lpgp op?";
        String p=para.replaceAll("\\b(\\w+)(?=[.!?])","replaced");
        System.out.println(p);
    }

    private static String caseSensitive(String y, String target, String replace) {
        StringBuilder sb=new StringBuilder();
        Pattern p=Pattern.compile(target,Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(y);
        while(m.find()){
            String word=m.group();
            String rep;
            if(word.equals(word.toUpperCase())){
                rep=replace.toUpperCase();
            }
            else if(word.equals(word.toLowerCase())){
                rep=replace.toLowerCase();
            }
            else{
                rep=replace.substring(0,1).toUpperCase()+replace.substring(1).toLowerCase();
            }
            m.appendReplacement(sb,rep);
        } m.appendTail(sb);
        return sb.toString();
    }

    private static String changeHash(String tee) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<tee.length();i++){
            if((i+1)%3==0){
                sb.append("#");
            }
            else sb.append(tee.charAt(i));
        }
        return sb.toString();
    }
}
