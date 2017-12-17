/*		 [Chest].java
		 *Author: [Gregory Casey]
		 *Submission Date: [11/5/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? this locks and unlocks the chest, and gets the gold.
		
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
public class Chest {

	/*
	 * Instance variables go here, you're responsible for choosing which ones are
	 * needed and naming them
	 */

	private Key correctKey;
	private boolean locked;
	private String contents;

	/**
	 * This method is used by the Map class, you won't need to call it yourself It
	 * should result in this chest being locked and storing which key locked it.
	 */
	// set the ket to lock and unlock as well as set the gold and get it
	public void lock(Key theKey) {

		this.correctKey = theKey;
		locked = true;
	}

	/**
	 * If theKey is the same key that was used to lock this chest, then the chest is
	 * unlocked. Otherwise this method does nothing.
	 */
	public void unLock(Key theKey) {

		if (locked == true) {
			if (theKey.equals(this.correctKey)) {
				locked = false;
			}
		}
	}

	/**
	 * Should return true if the chest is locked, false otherwise
	 */
	public boolean isLocked() {
		if (locked == true) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Return a string describing the contents of the chest.
	 */
	public String getContents() {

		return contents;

	}

	/**
	 * Set the contents of the chest to this string. You should not need to call
	 * this method in your program (though you have to implement it anyway).
	 */
	public void setContents(String contents) {
		this.contents = contents;

	}

}
