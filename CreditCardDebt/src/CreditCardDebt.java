
/* 
		*[CreditCardDebt].java
		 *Author: [Gregory Casey]
		 *Submission Date: [9/11/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This code allows the user to enter values for interest rate, principal
		 *and monthly payments. It then takes those values and puts them into equations that calculate the 
		 *months needed to pay off, amount paid, interest paid, and overpayment. I used new parts of java as
		 *well as previously taught material to give me the exact value with 2 decimal places. 
		
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

public class CreditCardDebt {

	public static void main(String[] args) {

		// here I declared the variables I will be using in my code
		double numerator, denominator, totalAmountPaid, totalInterestPaid, rawanswer, overpayment, answer;

		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter Principal: \t\t");
		double principal = myScanner.nextDouble();
		System.out.print("Enter Annual Interest Rate: \t");
		double annualInterestRate = myScanner.nextDouble();
		System.out.print("Enter Monthly Payment: \t\t");
		double monthlyPayment = myScanner.nextDouble();

		// here I have created my numerator and denominator and all the formula I will
		// use in my code
		numerator = Math.log(monthlyPayment) - Math.log((monthlyPayment) - (annualInterestRate / 1200.0) * principal);
		denominator = Math.log((annualInterestRate / 1200.0) + 1.0);
		rawanswer = (numerator / denominator);
		answer = Math.ceil(numerator / denominator);
		totalAmountPaid = (monthlyPayment * answer);
		totalInterestPaid = (totalAmountPaid - principal);
		
		overpayment = (answer * monthlyPayment) - (rawanswer * monthlyPayment);

		
		System.out.printf("\nPrincipal: \t\t\t$%.2f", principal);
		System.out.print("\nAnnual Interest Rate (%): ");
		System.out.printf("      %.2f", annualInterestRate);
		System.out.printf("\nMonthly Payment: \t\t$%.2f", monthlyPayment);
		System.out.println("\n");
		System.out.println("Months Needed to Pay Off:   \t" + answer);
		System.out.printf("Total Amount Paid: \t\t$%.2f", totalAmountPaid);
		System.out.printf("\nTotal Interest Paid: \t\t$%.2f", totalInterestPaid);
		System.out.printf("\nOverpayment: \t\t\t$%.2f", overpayment);

	}

}
