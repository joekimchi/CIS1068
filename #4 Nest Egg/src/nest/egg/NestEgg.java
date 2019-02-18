/*
Joseph Kim
Section 1
Assignment 4
2/10/17
 */
package nest.egg;
import java.util.*;
import java.lang.Math;


public class NestEgg {
public static final String year = " Year ";
public static final String yearly = "  Yearly ";
public static final String monthly = " Monthly ";
public static final String daily = "  Daily  ";

    public static void main(String[] args) {
        
    //balance input
    System.out.println("What is the starting balance (in dollars)?");
    Scanner scan = new Scanner(System.in);
    double balanceinput = scan.nextDouble();
    
    //annual interest rate input
    System.out.println("What's the yearly interest rate (in percent)?");
    Scanner scan1 = new Scanner(System.in);
    double rateinput = scan1.nextDouble();
     
    //number of years to save ___
    System.out.println("For how many years will you be saving?");
    Scanner scan2 = new Scanner(System.in);
    int yearstosave = scan2.nextInt();
    
    //confirmation to user
    System.out.println("\nUsing: Starting balance - " + "$" + balanceinput);
    System.out.println("Yearly interest rate - " + rateinput + "%");
    System.out.println("Years to save - " + yearstosave + " years\n");
    rateinput = rateinput/100; //percentage
    
    //formulas
    //double YearlyInt = balanceinput * rateinput + balanceinput; //year
    //double MonthlyInt= balanceinput * rateinput / 12 + balanceinput; //month
    //double DailyInt =  balanceinput * rateinput / 365 + balanceinput; //day
    
    //chart
    System.out.format("|%s|%s|%s|%s|\n",year,yearly,monthly,daily);
    for(int i=1; i<= yearstosave; i++){
       
        double YearlyInt =  balanceinput * Math.pow(1+(rateinput), (i)); // for every year
        double MonthlyInt = balanceinput * Math.pow(1+(rateinput/12), (i*12)); //for every month of the year
        double DailyInt = balanceinput * Math.pow(1+(rateinput/365), (i*365)); //for every day of the year
        System.out.format("|%6d|$%.2f|$%.2f|$%.2f|\n", i, YearlyInt, MonthlyInt, DailyInt);
    }
  }  
}
