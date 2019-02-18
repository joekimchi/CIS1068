/*
Joseph Kim
Assignment 7
Due March 20, 2017
 */
package practicewithstatic;
import java.util.Scanner;
public class StringMethods {
    
    /* returns true if c is an upper case or lower case vowel
     * or false otherwise */
    public static boolean isVowel(char c) { 
        boolean vowel;
     if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')){
        vowel = true;
         return vowel;
     }else {
         vowel = false;
        return vowel;
     }
    }

    /* returns the index of the first vowel in s or -1
     * if s contains no vowels */
    public static int indexOfFirstVowel(String s) { 
      int i;
        for (i=0; i<s.length(); i++) { 
            char c = s.charAt(i);
            if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U'))
                return i;  
            }
        return -1;
    }
       
    /* returns the index of the first occurrence of a vowel
     * in s starting from index startPosition or -1 if
     * there are no vowels in s at index startPosition or later */

    /* notice that this method has the same name as the previous
     * one, but that it takes a different number of arguments.
     * This is perfectly legal in Java. It's called "method overloading" */
    public static int indexOfFirstVowel(String s, int startPosition) {
        int i;
        for (i=startPosition; i<s.length(); i++) { 
            char c = s.charAt(i);
            if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U'))
                return i;  
            }
        return -1;
    }
    
    /* returns the index of the last occurrence of a vowel in
     * s or -1 if s contains no vowels */
    public static int indexOfLastVowel(String s) {
        for (int i=s.length()-1; i>0; i--) { 
        char c = s.charAt(i);
            if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')){
            return i;  
            }
        }
        return -1;
    }

    /* returns s in reverse. For example, if s is "Apple", the method
     * returns the String "elppA" */
    public static String reversed(String s) {
	String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return rev;
    }

    /* returns the number of times that n occurs
     * in h. For example, if h is "Mississippi" and n is "ss"
     * the method returns 2. */
    public static int numOccurrences(String h, String n) {
    int lastIndex = 0;
    int count = 0;

    while(lastIndex != -1){
        lastIndex = h.indexOf(n,lastIndex);
        if(lastIndex != -1){
            count ++;
            lastIndex += n.length();
        }
    }
        return count;
    }

    /* returns true if s is the same backwards and forwards
     * and false otherwise */
    public static boolean sameInReverse(String s) {
    String reverse = "";
    int length = s.length(); {
    for (int i = length - 1; i >= 0; i--)
        reverse = reverse + s.charAt(i);
        if (s.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
      }   
}

    
    /* returns a new String which is the same as s, but with
     * all of the vowels removed. For example, if s is "summer vacation"
     * the method returns "smmr vctn" */
    public static String devoweled(String s) {
        int i; 
        for(i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')){
                System.out.print("");}
            else{
                System.out.print(c);}
        }
	return "";
    }

    /* Returns a new string consisting of all of the characters of s1
     * and s2 interleaved with each other. For example, if s1 is
     * "Spongebob" and s2 is "Patrick", the
     * function returns the string "SPpaotnrgiecbkob" */
    public static String zipped(String s1, String s2) {
        int i;
        if(s1.length()>= s2.length()){
        for(i=0; i<s2.length(); i++){
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
        }
        for(i=s2.length(); i<s1.length(); i++){
            System.out.print(s1.charAt(i));
        }
	}
        
        if(s2.length()>= s1.length()){
            for(i=0; i<s1.length(); i++){ 
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
        }
        for(i=s1.length(); i<s2.length(); i++){
            System.out.print(s2.charAt(i));
        }
    }
        return "";
    }

    /* returns a new String consisting of all of the letters
     * of s, but where tab characters ('\t') are replaced
     * with n spaces */
    public static String tabToSpace(String s, int n) {
        int i;
        for(i=0; i<s.length(); i++){
            s.replaceAll("\t", Integer.toString(n)); 
            n++;
        }
	return s;
    }


    /* returns true if all of the characters in chars are
     * found in the String s, or false otherwise */
    public static boolean containsAll(String s, String chars) {
        if(s.contains(chars))
            return true;
        else
            return false;
    }

    /* returns the index of the first occurrence of any of the
     * characters in chars in String s or -1 if none of the characters
     * in chars are found in s. */
    public static int indexOfAny(String s, String chars) {
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){
            lastIndex = s.indexOf(chars,lastIndex);
            if(lastIndex != -1){
                return lastIndex;
        }
    }
        return -1;
}
    
    public static void main(String[] args) {  
        java.util.Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter a character to determine whether it's a vowel: ");
            char c = keyboard.next().charAt(0);
            System.out.println(isVowel(c));
            
            System.out.println("");
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word to learn where its vowels are: ");
            String s = scan.nextLine();
            System.out.println("The index of the first vowel is " + indexOfFirstVowel(s));
            System.out.println(indexOfFirstVowel(s,0)); //from position 0
            System.out.println("The index of the last vowel is " + indexOfLastVowel(s));
            System.out.println(s + " reversed is " + reversed(s));
            System.out.println(sameInReverse(s));
            
            System.out.println(""); //blank line
            
            System.out.println("It appears " + numOccurrences("banana","an") + " times");
            
            System.out.println(""); //blank line
                   
            System.out.println(devoweled("Summer vacation"));
            System.out.println(zipped("Spongebob", "Patrick"));           
            System.out.println("tab to space " + tabToSpace("h\t\t\t\t\ti", 5));
            System.out.println(containsAll("hello man", "ell"));
            System.out.println("The index of the first occurence is at index " + indexOfAny("Mississippi", "ss"));
    }
}
