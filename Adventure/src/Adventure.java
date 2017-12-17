
/*		 [Adventure].java
		 *Author: [Gregory Casey]
		 *Submission Date: [11/5/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This is what actually executes the Story and 
		 *uses all the other classes.

		
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

public class Adventure {

	public static void main(String[] args) {
		Player thePlayer = new Player(0, 0, null, null);
		Map theMap = new Map();
		int x = thePlayer.getX();
		int y = thePlayer.getY();
		Room theRoom = theMap.getRoom(x, y);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to UGA Adventures: Episode I");
		System.out.println("The Adventure of the Cave of Redundancy Adventure");
		System.out.println("By: Gregory Casey");
		System.out.println(theRoom.getDescription());
		String userinput = keyboard.nextLine();
		// assign the commands
		while (true) {
			if (userinput.equalsIgnoreCase("get lamp") || userinput.equalsIgnoreCase("light lamp")
					|| userinput.equalsIgnoreCase("north") || userinput.equalsIgnoreCase("south")
					|| userinput.equalsIgnoreCase("east") || userinput.equalsIgnoreCase("west")
					|| userinput.equalsIgnoreCase("look") || userinput.equalsIgnoreCase("get key")
					|| userinput.equalsIgnoreCase("open chest") || userinput.equalsIgnoreCase("unlock chest")) {
				// GET LAMP
				if (userinput.equalsIgnoreCase("get lamp")) {
					if (theRoom.getLamp() == (null)) {

						System.out.println("No lamp present");
						userinput = keyboard.nextLine();
					} else {
						thePlayer.setLamp(theRoom.getLamp());
						theRoom.clearLamp();
						System.out.println("OK");
						userinput = keyboard.nextLine();

					}
				}

				// LIGHT LAMP
				if (userinput.equalsIgnoreCase("light lamp")) {

					if (thePlayer.getLamp() == (null)) {
						System.out.println("You don't have the lamp to light");
						userinput = keyboard.nextLine();
					} else {
						thePlayer.getLamp().setLamp(true);
						System.out.println("OK");
						userinput = keyboard.nextLine();

					}
				}

				// LOOK
				if (userinput.equalsIgnoreCase("look")) {

					if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
							&& theMap.getRoom(x, y).isDark()) {
						System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
						userinput = keyboard.nextLine();
					} else {
						System.out.println(theRoom.getDescription());
						if (theRoom.getLamp() != null) {
							System.out.println("There is an old oil lamp here that was made long ago");
						}
						if (theRoom.getKey() != null) {
							System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
						}
						if (theRoom.getChest() != null) {
							System.out.println(
									"There is a large, wooden, massive, oaken chest here with the word \"CHEST\" carved into it");
						}

					}

					System.out.println("Exits are: ");
					if (theRoom.canGoNorth() == true) {
						System.out.println("north");
					}
					if (theRoom.canGoSouth() == true) {
						System.out.println("south");
					}
					if (theRoom.canGoEast() == true) {
						System.out.println("east");
					}
					if (theRoom.canGoWest() == true) {
						System.out.println("west");
					}
					userinput = keyboard.nextLine();
				}

				if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
						&& theMap.getRoom(x, y).isDark()) {
					System.out.println("You have stumbled into a passing grue, and have been eaten");
					System.exit(0);
				}

				else {
					if (userinput.equalsIgnoreCase("north")) {
						if (theRoom.canGoNorth() == false) {
							System.out.println("Can't go that way");
							userinput = keyboard.nextLine();
						} else {
							x = x - 1;
							theRoom = theMap.getRoom(x, y);
							if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
									&& theRoom.isDark()) {
								System.out.println(
										"It is pitch black, you can't see anything. You may be eaten by a grue!");
								userinput = keyboard.nextLine();
								if (userinput.equalsIgnoreCase("north") || userinput.equalsIgnoreCase("south")
										|| userinput.equalsIgnoreCase("east") || userinput.equalsIgnoreCase("west")) {
									System.out.println("You have stumbled into a passing grue, and have been eaten");
									System.exit(0);
								}
							} else {
								System.out.println(theRoom.getDescription());
								userinput = keyboard.nextLine();
							}
							// userinput=keyboard.nextLine();
						}
					}
					if (userinput.equalsIgnoreCase("south")) {
						if (theRoom.canGoSouth() == false) {
							System.out.println("Can't go that way");
							userinput = keyboard.nextLine();
						} else {
							x = x + 1;
							theRoom = theMap.getRoom(x, y);
							if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
									&& theMap.getRoom(x, y).isDark()) {
								System.out.println(
										"It is pitch black, you can't see anything. You may be eaten by a grue!");
								userinput = keyboard.nextLine();
								if (userinput.equalsIgnoreCase("north") || userinput.equalsIgnoreCase("south")
										|| userinput.equalsIgnoreCase("east") || userinput.equalsIgnoreCase("west")) {
									System.out.println("You have stumbled into a passing grue, and have been eaten");
									System.exit(0);
								}
							} else {
								System.out.println(theRoom.getDescription());
								userinput = keyboard.nextLine();
							}
							// System.out.println(theRoom.getDescription());
							// userinput=keyboard.nextLine();
						}
					}
					if (userinput.equalsIgnoreCase("east")) {
						if (theRoom.canGoEast() == false) {
							System.out.println("Can't go that way");
							userinput = keyboard.nextLine();
						} else {
							y = y + 1;
							theRoom = theMap.getRoom(x, y);
							if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
									&& theMap.getRoom(x, y).isDark()) {
								System.out.println(
										"It is pitch black, you can't see anything. You may be eaten by a grue!");
								userinput = keyboard.nextLine();
								if (userinput.equalsIgnoreCase("north") || userinput.equalsIgnoreCase("south")
										|| userinput.equalsIgnoreCase("east") || userinput.equalsIgnoreCase("west")) {
									System.out.println("You have stumbled into a passing grue, and have been eaten");
									System.exit(0);
								}
							} else {
								System.out.println(theRoom.getDescription());
								userinput = keyboard.nextLine();
							}
							// System.out.println(theRoom.getDescription());
							// userinput=keyboard.nextLine();
						}
					}
					if (userinput.equalsIgnoreCase("west")) {
						if (theRoom.canGoWest() == false) {
							System.out.println("Can't go that way");
							userinput = keyboard.nextLine();
						} else {
							y = y - 1;
							theRoom = theMap.getRoom(x, y);
							if ((thePlayer.getLamp() == (null) || thePlayer.getLamp().isLit() == false)
									&& theMap.getRoom(x, y).isDark()) {
								System.out.println(
										"It is pitch black, you can't see anything. You may be eaten by a grue!");
								userinput = keyboard.nextLine();
								if (userinput.equalsIgnoreCase("north") || userinput.equalsIgnoreCase("south")
										|| userinput.equalsIgnoreCase("east") || userinput.equalsIgnoreCase("west")) {
									System.out.println("You have stumbled into a passing grue, and have been eaten");
									System.exit(0);
								}
							} else {
								System.out.println(theRoom.getDescription());
								userinput = keyboard.nextLine();
							}
							// System.out.println(theRoom.getDescription());
							// userinput=keyboard.nextLine();
						}
					}

				}
				// GET KEY
				if (userinput.equalsIgnoreCase("get key")) {
					if (theRoom.getKey() == (null)) {
						System.out.println("No key present");
						userinput = keyboard.nextLine();
					} else {

						thePlayer.setKey(theRoom.getKey());
						theRoom.clearKey();
						System.out.println("OK");
						userinput = keyboard.nextLine();
					}
				}

				// OPEN CHEST
				if (userinput.equalsIgnoreCase("open chest")) {

					if (theRoom.getChest() == (null)) {
						System.out.println("No chest present");
						userinput = keyboard.nextLine();
					} else {
						if (theRoom.getChest().isLocked() == false) {

							System.out.println(theRoom.getChest().getContents());
							System.exit(0);
						}

						if (theRoom.getChest().isLocked() == true) {
							System.out.println("The chest is locked");
							userinput = keyboard.nextLine();
						}
					}
				}

				// UNLOCK CHEST
				if (userinput.equalsIgnoreCase("unlock chest")) {
					if (theRoom.getChest() == (null)) {
						System.out.println("No chest to unlock");
						userinput = keyboard.nextLine();
					}

					else {
						if (thePlayer.getKey() == (null)) {
							System.out.println("Need a key to do any unlocking!");
							userinput = keyboard.nextLine();
						} else {
							thePlayer.getKey();
							theRoom.getChest().unLock(thePlayer.getKey());
							System.out.println("OK");
							userinput = keyboard.nextLine();
						}
					}

				}
			} else {
				System.out.println("I don't know how to do that");
				userinput = keyboard.nextLine();
			}

		}

	}

}
