/** Change.java - add your solutiuon to program 3 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the total purchase amount?");

        //Numerical user input purchase amount
        int due = scanner.nextInt();
        System.out.println();
        System.out.println("What is the total payment amount?");

        //Numerical user input payment amount
        int payment = scanner.nextInt();
    
        //Output change due
        int numChange = payment - due;
        System.out.println();
        System.out.println("Change Due: " + numChange);
        System.out.println(); 
        System.out.println("Change Due by Denomination");
        
        //Change by denomination
        int pennies = numChange;
    
        final int NUM_PENNIES_IN_TWENTY_DOLLARS = 2000;
    
        int twentydollars = pennies / NUM_PENNIES_IN_TWENTY_DOLLARS;
        pennies = pennies % NUM_PENNIES_IN_TWENTY_DOLLARS;
  
        final int NUM_PENNIES_IN_TEN_DOLLARS = 1000;
    
        int tendollars = pennies / NUM_PENNIES_IN_TEN_DOLLARS;
        pennies = pennies % NUM_PENNIES_IN_TEN_DOLLARS;
    
        final int NUM_PENNIES_IN_FIVE_DOLLARS = 500;
  
        int fivedollars = pennies / NUM_PENNIES_IN_FIVE_DOLLARS; 
        pennies = pennies % NUM_PENNIES_IN_FIVE_DOLLARS;
    
        final int NUM_PENNIES_IN_ONE_DOLLAR = 100;
    
        int onedollar = pennies / NUM_PENNIES_IN_ONE_DOLLAR;  
        pennies = pennies % NUM_PENNIES_IN_ONE_DOLLAR;
  
        final int NUM_PENNIES_IN_QUARTERS = 25;
    
        int quarters = pennies / NUM_PENNIES_IN_QUARTERS;
        pennies = pennies % NUM_PENNIES_IN_QUARTERS;
  
        final int NUM_PENNIES_IN_DIMES = 10;
    
        int dimes = pennies / NUM_PENNIES_IN_DIMES;
        pennies = pennies % NUM_PENNIES_IN_DIMES;
    
        final int NUM_PENNIES_IN_NICKELS = 5;
    
        int nickels = pennies / NUM_PENNIES_IN_NICKELS;
        pennies = pennies % NUM_PENNIES_IN_NICKELS;
        
        System.out.println("Twenties: " + twentydollars);
        System.out.println("Tens: " + tendollars);
        System.out.println("Fives: " + fivedollars);
        System.out.println("Ones: " + onedollar);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
    }    
}
