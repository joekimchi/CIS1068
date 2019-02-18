/*
Joseph Kim
Section 1
Assignment 5
2/17/17
 */
package very.mini.string;
import java.util.Scanner;
public class VeryMiniString {
    public static void main(String[] args) {
      String input;
      String reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter a word and I'll tell you some things about it: "); //user inputs a string
      input = in.nextLine();
      
      //checks to see if its a palindrome
      int length = input.length(); {
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + input.charAt(i);
      if (input.equalsIgnoreCase(reverse))
         System.out.println(input + " is a palindrome.");
      else
         System.out.println(input + " is not a palindrome.");
      }   
      
      //counts amount of vowels in user inputs word
      int count = 0; 
      for (int i = 0; i < input.length(); i++) {
      char vowel = input.charAt(i);
      if (vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u' || vowel=='A' || vowel=='E' || vowel=='I' || vowel=='O' || vowel=='U')
        count++;}
      System.out.println(input + " has " + count + " vowels.");
      
      //index of the first vowel
      String vowels = "aeiou"; 
      for (int i=0; i<input.length(); i++) { 
        if (vowels.indexOf(input.substring(i, i+1)) != -1) {
            System.out.println("The first vowel in " + input + " is at index " + i + "."); 
            break;
        }
      }

      //index of the last vowel
      for (int i=input.length()-1; i>0; i--) { 
        if (vowels.indexOf(input.substring(i, i+1)) != 0) {
            System.out.println("The last vowel in " + input +" is at index " + i + "."); 
            break;
        }
      } 
      
      //amount of times second string appears in first string
        Scanner scan2= new Scanner(System.in);
        int count2 = 0; //2nd counter for amount of second strings in first string
        String word;
        
        System.out.print("Enter a second word to see how many times it shows up in the first word: ");
        word = scan2.nextLine();
        
        char c = input.charAt(0); //initial input
        char w = word.charAt(0); //second input

        for (int i = 0 ; i < input.length() ; i++ ); 
            if (c == w); {
                count2 += 1;
                System.out.println(word + " appears " + count2 + " times.");
    }
                
                
  }
}


        

       
	