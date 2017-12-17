/* 
		*[Palindrome].java
		 *Author: [Gregory Casey]
		 *Submission Date: [10/3/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? We make a program that takes a number figures out if it is a palindrome, 
		 *if it is then it adds all the integers from one to 
		 *the given number. 
		
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

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int usernumber = 0, n, q = 0, m = 0;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("please enter an integer > 0: ");
		n = keyboard.nextInt();

		if (n > 0) {
			usernumber = n;

			while (n > 0) {

				q = n % 10;

				n = n / 10;

				m = m * 10 + q;
			}

			if (usernumber == m) {
				System.out.println("The integer " + usernumber + " is a palindrome.");
				int x = 1;
				int sum = 0;

				while (x <= usernumber) {
					sum += x;
					x++;
				}

				System.out.print("The sum of the numbers from 1 to " + usernumber + " is " + sum);
			}

			else {
				System.out.println("The integer " + usernumber + " is not a palindrome.");
				System.exit(0);
			}

		}

		else {

			System.out.println("Sorry, you must enter an integer greater than zero.");
		}

	}

}
