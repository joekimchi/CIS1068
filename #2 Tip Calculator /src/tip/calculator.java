/*
Joseph Kim
Section 1
Assignment 2
January 27, 2017
 */

package tip;
import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Tip = 0;
        String s ="";
  
        //bill cost
        System.out.println("How much was the bill?: ");
        double bill = scan.nextDouble();
        
        //people amount
        System.out.println(s);
        System.out.println("How many people were in your party?: ");
        int amountOfPeople = scan.nextInt();
        
        //satisfaction level from 1-3
        System.out.println("How satisfied were you (1-3)?: ");
        Scanner sat = new Scanner(System.in);
        int rating = scan.nextInt();
        if(rating==1){Tip = 0.10;} //VERY DISSATISFIED
        else if(rating==2){Tip = 0.15;} //SATISFIED
        else if(rating==3){Tip = 0.25;} //VERY SATISFIED

        double tip = bill * Tip + amountOfPeople * 0.50;
        tip = Math.round(tip*100)/100.0d; //limits to 2 decimal places
        System.out.println("Your tip should be: " + tip);
        

    }
    
}
