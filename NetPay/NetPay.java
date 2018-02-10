import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		/* 
		*[NetPay].java
		 *Author: [Parker Casey]
		 *Submission Date: [9/3/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This program teaches us the basics of how to use double, int,
		 *and the scanner. It also shows us how to declare values and variables. The program 
		 *computes federal tax, state tax, medicare, and social security. We made simple equations 
		 *that input the variables into the equation and output the results. Then we used the scanner 
		 *to let us input a value for hours per week and it plugged that value into the equations 
		 *and gave us the results.
		
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
		 
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter hours per week");
		int hoursPerWeek = myScanner.nextInt();
		
		double FEDERAL_TAX_PERCENT = 10.00;
		double STATE_TAX_PERCENT = 4.5;
		double SS_PERCENT = 6.2;
		double MEDICARE_PERCENT = 1.45;
		double PAY_PER_HOUR = 7.25;
		
		double grossPay = hoursPerWeek * PAY_PER_HOUR;
		
		double federalTax = (grossPay * FEDERAL_TAX_PERCENT)/100;
		double stateTax = (grossPay * STATE_TAX_PERCENT)/100;
		double medicare = (grossPay * MEDICARE_PERCENT) / 100;
		double socialSecurity = (grossPay * SS_PERCENT)/100;
		
		double netPay = grossPay - (federalTax + stateTax + medicare + socialSecurity);
		
		System.out.println("Hours per Week: \t" + hoursPerWeek);
		System.out.println("Gross Pay:      \t" + grossPay); 
		System.out.println("Net Pay:        \t" + netPay);
		System.out.println("");
		System.out.println("Deductions      \t");
		System.out.println("Federal:        \t" + federalTax);
		System.out.println("State:          \t" + stateTax);
		System.out.println("Social Security:\t" + socialSecurity);
		System.out.println("Medicare:       \t" + medicare);
		
		
	}

}
