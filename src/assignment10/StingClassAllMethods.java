package assignment10;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StingClassAllMethods {
    public static void main(String[] args) {
        String str="Abhinandan";
        String str1="Abhinandan";
        //charAt returns the char value as per the given index
        System.out.println(str.charAt(7));
        System.out.println("==================");
        //length() returns the number of char present in the string.
        System.out.println(str.length());
        System.out.println("==================");
        //Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        System.out.println("==================");

        System.out.println(str.toLowerCase());
        System.out.println("==================");

        System.out.println(str.toUpperCase());
        System.out.println("==================");

        System.out.println(str.compareTo(str1));
        System.out.println("==================");

        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println("==================");

        System.out.println(str.contains(str1));
        System.out.println("==================");

        System.out.println(str.contentEquals(str1));
        System.out.println("==================");

        System.out.println(str.startsWith("Abhi"));
        System.out.println("==================");

        System.out.println(str.hashCode());
        System.out.println("==================");

        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println("==================");

        System.out.println(str.indexOf('n'));
        //concat is used to concat the string.
        str=str.concat(" Maholkar");
        System.out.println(str);
        System.out.println("==================");
    }
}
