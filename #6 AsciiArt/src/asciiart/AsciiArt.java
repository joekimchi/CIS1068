/*
Joseph Kim
Assignment 6
Due March 3, 2017
 */

//prints diamond5
package asciiart;
import java.util.*;
public class AsciiArt {
    public static final int SIZE = 10; //changes proportions of the diamond
    public static void main(String[] args) {
    int j, i, s, space = 1;
    
        space = SIZE - 1;   //prints top half
        for(j = 1; j <= SIZE; j++){
            for(i = 1; i <= space; i++){
            System.out.print(" ");
            }
            space--;
            for(i = 1; i <= 2 * j - 1; i++){
            System.out.print("*");
            }
            System.out.println("");
            }
        
        //rectangle in the middle
        int length = SIZE;
        length = length + length;
        rectangle(length);
        System.out.print(length);
    }
        public static void rectangle(int r) {
        for(int rect = 0; rect < r; rect++) 
            System.out.print("*");
            System.out.print("\n*");
        for(int space = 0; space < r - 2; space++) 
            System.out.print(" ");
            System.out.print("*\n");
        for(int star = 0; star < r; star++) 
            System.out.print("*");
            System.out.println();
        
        
    int space = 1, j,k, i, width; //prints bottom half
        for(j = 1; j <= SIZE; j++){
            for(i = 1; i <= space; i++){
                System.out.print(" ");
            }   
            space++;
            for(i = 1; i <= 2 * (SIZE - j) - 1; i++){
                for (k = 1; k <= SIZE - i; k++){
                    System.out.print("*");
                }
                    System.out.println("");
                }
                break;
    }
  }
}

        