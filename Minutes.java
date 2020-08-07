/** Minutes.java - add your solutiuon to program 2 of homework 1 here.
 * 
 */
import java.util.Scanner;

public class Minutes {

	public static final void main(String[] args) {

		//Prompt to gather user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age in years, months, weeks, days, and hours.");

		//Numerical user input
		int years = in.nextInt();
		int months = in.nextInt();
		int weeks = in.nextInt();
		int days = in.nextInt();
		int hours = in.nextInt();
		System.out.println();

		//Output user input age chart
		String ageChart = ("Your age chart: " + years + " years, " + months + " months, "
				+ weeks + " weeks, " + days + " days, " + hours + " hours.");
		System.out.println(ageChart);
		System.out.println();

		//Output user input converted to minutes
		int numYearMinutes = years*525600;
		System.out.println("You have been alive for " + numYearMinutes + " minutes and counting...");

	}    
}
