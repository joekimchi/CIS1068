/*Joseph Kim 
  January 19, 2017
  1068
  Homework 1
*/
package greeting;
import java.util.Scanner;

public class Greeting {


public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("What is your first name?");
        String first = keyboard.nextLine();
        System.out.println(first);
        
        System.out.println("What is your last name?");
        String last = keyboard.nextLine();
        System.out.println(last);
        
        System.out.println("Greetings, " + first + " " + last + "!");
        
        
        }
}