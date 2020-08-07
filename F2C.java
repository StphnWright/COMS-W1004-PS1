/** F2C.java - add your solutiuon to program 1 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        int fahrenheit, celsius;
		
        //Prompt for fahrenheit user input
        Scanner in = new Scanner(System.in);
	System.out.print("Temperature in Fahrenheit:");
		
        //Fahrenheit to celsius conversion
        fahrenheit = in.nextInt();
	celsius = (fahrenheit-32)*5/9;
		
        //Output to celsius
        System.out.println("Temperature in Celsius:"+celsius);
              
    }    
}
