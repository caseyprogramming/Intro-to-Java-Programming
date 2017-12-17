/*		 [Player].java
		 *Author: [Gregory Casey]
		 *Submission Date: [11/5/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This defines what a player is.
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
public class Player {

	private Lamp theLamp;
	private Key theKey;
	private int x;
	private int y;

	public Player(int x, int y, Lamp theLamp, Key theKey) {
		this.x = x;
		this.y = y;

	}

	// set and get the players items

	public Lamp getLamp() {
		return theLamp;
	}

	public Key getKey() {

		return theKey;
	}

	public int getX() {
		return x;

	}

	public int getY() {
		return y;
	}

	public void setLamp(Lamp theLamp) {
		this.theLamp = theLamp;

	}

	public void setKey(Key theKey) {
		this.theKey = theKey;
	}

	public void setX(int x) {

		this.x = x;

	}

	public void setY(int y) {
		this.y = y;
	}

}