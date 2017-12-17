/*		 [Lamp].java
		 *Author: [Gregory Casey]
		 *Submission Date: [11/5/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This gets the lamp and turns it on
		
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
public class Lamp {

	/*
	 * Instance variables and methods go here, you're responsible for choosing and
	 * naming them.
	 */
	// set the lamp to on and off
	private boolean lit;

	public boolean getLamp() {
		return lit;
	}

	public void setLamp(boolean theLamp) {
		lit = true;
	}

	public boolean isLit() {
		if (lit == false) {
			return false;
		} else {
			return true;
		}
	}

}
