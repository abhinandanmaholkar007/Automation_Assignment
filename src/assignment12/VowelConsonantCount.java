package assignment12;

import java.util.Locale;

public class VowelConsonantCount {
    public static void main(String[] args) {
        int vowel_count=0;
        int consonant_count=0;
        String str="I am Abhinandan Maholkar";
        str=str.toLowerCase();
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowel_count++;
            } else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                consonant_count++;
            }}
            System.out.println("There are "+vowel_count+" vowels in the given string");
            System.out.println("There are "+consonant_count+" consonant in the given string");

    }
}
