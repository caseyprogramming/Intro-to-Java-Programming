
/*		 [StarGraph].java
		 *Author: [Gregory Casey]
		 *Submission Date: [10/17/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This program creates arrays that plug values into an equation
		 *and output a new array with those values. It then creates a graph of those values using
		 *astericks. 
		
		 *Statement of Academic Honesty:
		
		 *The following code represents my own work. I have neither
		 *received nor given inappropriate assistance. I have not copied
		 *or modified code from any source other than the course webpage
		 *or the course textbook. I recognize that any unauthorized
		 *assistance or plagiarism will be handled in accordance with
		 *the University of Georgia's Academic Honesty Policy and the
		 *policies of this course. I recognize that my work is based
		 *on an assignment created by the Department of Computer
		 *Science at the University of Georgia. Any publishing
		 *or posting of source code for this project is strictly
		 *prohibited unless you have written consent from the Department
		 *of Computer Science at the University of Georgia. 	
		 */
import java.util.Arrays;
import java.util.Scanner;

public class StarGraph {

	public static void main(String[] args) {
		double xmin = 0, yvalue = 0;
		double increment;
		int N = 0;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of x values to process: ");
		N = keyboard.nextInt();
		if (N > 0) {
			System.out.print("Enter a minimum value for x: ");
			xmin = keyboard.nextDouble();
			System.out.print("Enter the amount to increment x: ");
			increment = keyboard.nextDouble();
			double[] x = new double[N];
			double[] y = new double[N];
			if (increment > 0) {

				System.out.println("");
				System.out.print("Values");
				for (int i = 0; i < x.length; i++) {

					x[i] = (float) xmin;
					yvalue = 20.0 * Math.abs((Math.sin(Math.abs(xmin))));
					System.out.printf("\nx:%.3f", xmin);
					System.out.printf(", y: %.3f", yvalue);
					x[i] = xmin;
					xmin = xmin + increment;
					Math.floor(yvalue);
					x[i] = xmin;
					y[i] = yvalue;
				}
				System.out.println("");
				System.out.println("");
				System.out.println("Graph");

				Math.floor(yvalue);
				for (int i = 0; i < y.length; i++) {

					System.out.print(":");
					for (int j = 1; j <= y[i]; j++) {

						System.out.print("" + "*");
					}
					System.out.println("");
				}

			} else {
				System.out.println("The increment must be a decimal number greater than 0.");
			}
		} else {
			System.out.println("The number of x values must be an integer greater than 0.");
		}

	}

}
