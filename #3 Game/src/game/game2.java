/*
Joseph Kim
Section 1
Assignment 3
February 3, 2017
*/

package game;
import java.util.Random;
import java.util.Scanner;

public class game2 {
    public static final int SHULT = 1, KNUBBIG = 2, ANGLAND = 3, HANSAKOGG = 4; //user input -> name of viking

    public static void main(String args[]) {
        int guess;		// USER'S choice of fighter
	int viking;		// viking selection
	
        //instructions and intro for user to read
        System.out.println("Eldshult the Game\nIn a round, players choose a move, which may be either Shult, Knubbig, Angland, or Hansakogg.\nThe rules are:\n\n-Shult beats Knubbig and Angland\n-Knubbig beats Angland\n-Angland beats Hansakogg\n-Hansakogg beats Shult and Knubbig\n-The computer wins in the event of a tie.\n");
        
	Scanner in = new Scanner(System.in);
	Random rnd = new Random();
	viking=rnd.nextInt(4)+1;
        
        //selecion for user to choose their choice of viking
	System.out.print("The moves are: \n 1) Shult \n 2) Knubbig \n 3) Angland \n 4) Hansakogg \n \n Please enter your choice (1,2,3,4)> ");
	guess=in.nextInt();

        //if user picks Shult
        if (guess == SHULT){
         if (viking == KNUBBIG) {  
	    System.out.println("User chooses Shult and Computer chooses Knubbig");
            System.out.println("User wins");
        }
         else if (viking ==  ANGLAND) {
           System.out.println("User chooses Shult and Computer chooses Angland");
           System.out.println("User wins");
        }
         else if (viking == HANSAKOGG){
           System.out.println("User chooses Shult and computer chooses Hansakogg ");
           System.out.println("Computer wins");
        }
         else if (viking == guess){
           System.out.println("User and computer both choose Shult");
           System.out.println("Computer wins");
        }
    }
        //if user picks Knubbig
        if (guess ==KNUBBIG){
         if (viking == SHULT) {  
	    System.out.println("User chooses Knubbig and Computer chooses Shult");
            System.out.println("Computer wins");
        }
         else if (viking ==  ANGLAND) {
           System.out.println("User chooses Knubbig and Computer chooses Angland");
           System.out.println("User wins");
        }
         else if (viking == HANSAKOGG){
           System.out.println("User chooses Knubbig and computer chooses Hansakogg ");
           System.out.println("Computer wins");
        }
         else if (viking == guess){
           System.out.println("User and computer both choose Knubbig");
           System.out.println("Computer wins");
        }
    }
     
        //if user chooses Angland
        if (guess ==ANGLAND){
         if (viking == SHULT) {  
	    System.out.println("User chooses Angland and Computer chooses Shult");
            System.out.println("Computer wins");
        }
         else if (viking ==  KNUBBIG) {
           System.out.println("User chooses Angland and Computer chooses Knubbig");
           System.out.println("Computer wins");
        }
         else if (viking == HANSAKOGG){
           System.out.println("User chooses Angland and computer chooses Hansakogg ");
           System.out.println("User wins");
        }
         else if (viking == guess){
           System.out.println("User and computer both choose Angland");
           System.out.println("Computer wins");
        }
    }
        //if user chooses Hansakogg
        if (guess == HANSAKOGG){
         if (viking == SHULT) {  
	    System.out.println("User chooses Hansakogg and Computer chooses Shult");
            System.out.println("User wins");
        }
         else if (viking ==  KNUBBIG) {
           System.out.println("User chooses Hansakogg and Computer chooses Knubbig");
           System.out.println("User wins wins");
        }
         else if (viking == ANGLAND){
           System.out.println("User chooses Hansakogg and computer chooses Angland ");
           System.out.println("Computer wins");
        }
         else if (viking == guess){
           System.out.println("User and computer both choose Hansakogg");
           System.out.println("Computer wins");
        }
      }
   }
} 
    

