
/*		[Mastermind].java
		 *Author: [Gregory Casey]
		 *Submission Date: [10/16/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? This program is a series of if else statement, for loops, while loops and nested
		 *loops. It is a game that allows the player to bet money. There are 3 different difficulty levels in which
		 *a player must guess 3,4 or 5 number. 
		
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
import java.util.Random;

public class Mastermind {

	// naming variables
	public static void main(String[] args) {
		double MoneyEarned = 0;
		double MoneyToPlay = 0;
		double userMoney = 0;
		double MIN_BET = 2;
		int SecretCodeDigits = 0;
		int MaxGuesses = 0;
		int incorrectGuesses = 0;
		boolean testingMode = true;
		String veriFication = null;
		String difficultyLevel;
		Scanner keyboard = new Scanner(System.in);

		MoneyEarned = (MoneyToPlay * SecretCodeDigits * (MaxGuesses - incorrectGuesses)) / (MaxGuesses);

		// asking if they want to play, how much money and bet
		while (true) {

			System.out.print("Would you like to play Mastermind (yes/no) ?");
			veriFication = keyboard.next();

			if (veriFication.equalsIgnoreCase("yes")) {

				System.out.print("Enter the amount of money you have to play: ");
				userMoney = keyboard.nextDouble();

				if (userMoney >= MIN_BET) {
					parent: while (true) {
						System.out.print("Please enter the level of difficulty (beginner, intermediate, advanced) :  ");
						difficultyLevel = keyboard.next();

						if (difficultyLevel.equalsIgnoreCase("beginner")) {
							incorrectGuesses = 0;
							MaxGuesses = 0;
							SecretCodeDigits = 3;
							while (true) {
								System.out.print("Enter the amount of money you want to bet: ");
								MoneyToPlay = keyboard.nextDouble();

								if ((userMoney >= MoneyToPlay) && (MoneyToPlay >= MIN_BET)) {
									int secretCode = (int) (Math.random() * 900) + 100;
									if (testingMode) {
										System.out.println("Testing Mode - the 3 digits number: " + secretCode);
									}
									MaxGuesses = 1;
									for (MaxGuesses = 1; MaxGuesses < 31; MaxGuesses++) {

										System.out.print("Please guess the 3 digits number: ");

										int userGuess = keyboard.nextInt();

										if ((userGuess >= 100) && (userGuess <= 999)) {
											int correctDigits = 0;
											int sumCorrectdigits = 0;
											int userUnparsedguess = userGuess;
											String parsedGuess = "";
											parsedGuess = Integer.toString(userUnparsedguess);
											String firstNumber = parsedGuess.substring(0, 1);
											String secondNumber = parsedGuess.substring(1, 2);
											String thirdNumber = parsedGuess.substring(2, 3);

											int unparsedSecretcode = secretCode;
											String parsedSecretcode = "";
											parsedSecretcode = Integer.toString(unparsedSecretcode);
											String firstSolution = parsedSecretcode.substring(0, 1);
											String secondSolution = parsedSecretcode.substring(1, 2);
											String thirdSolution = parsedSecretcode.substring(2, 3);

											if (parsedSecretcode.equals(parsedGuess)) {
												MaxGuesses = 30;
												MoneyEarned = (MoneyToPlay * SecretCodeDigits
														* (MaxGuesses - incorrectGuesses)) / (MaxGuesses);
												userMoney = userMoney - MoneyToPlay;
												userMoney = MoneyEarned + userMoney;

												System.out.println("\tYou won!!");
												System.out.println("\tYou had " + incorrectGuesses + " wrong guesses.");
												System.out.printf("\tYou have earned $%.2f dollars", MoneyEarned);
												System.out.printf("\n\tYour balance is now $%.2f dollars", userMoney);
												System.out.println("\n");
												playagain: while (true) {
													System.out.print("Would you like to play again?");
													veriFication = keyboard.next();
													if (userMoney < MIN_BET) {
														System.out.println(
																"Sorry, you do not have enough money to play again.");
														System.exit(0);
													}
													if (veriFication.equalsIgnoreCase("yes")) {
														continue parent;
													} else if (veriFication.equalsIgnoreCase("no")) {
														System.out.print(
																"The game is terminated. Bye. Come to play again!!");
														System.exit(0);
													} else {
														System.out.println("Answer is invalid. Please enter yes/no.");
														continue playagain;
													}

												}
											}

											if (firstNumber.equals(firstSolution)) {
												correctDigits++;
												int firstNumberback = Integer.parseInt(firstNumber);
												sumCorrectdigits += firstNumberback;

											}
											if (secondNumber.equals(secondSolution)) {
												correctDigits++;
												int secondNumberback = Integer.parseInt(secondNumber);
												sumCorrectdigits += secondNumberback;

											}
											if (thirdNumber.equals(thirdSolution)) {
												correctDigits++;
												int thirdNumberback = Integer.parseInt(thirdNumber);
												sumCorrectdigits += thirdNumberback;

											}

											System.out.println("Number of correct digits: " + correctDigits);
											System.out.println("Sum: " + sumCorrectdigits);

										} else {
											System.out.println("The guess you have entered is ill-formed.");
											MaxGuesses--;
										}
										incorrectGuesses++;
									}
									userMoney = userMoney - MoneyToPlay;
									System.out.println("");
									System.out.println("Sorry, you lost!!!");
									System.out.println("The number was " + secretCode);
									System.out.println("You have lost " + MoneyToPlay + " dollars.");
									System.out.println("Your balance is now " + userMoney + " dollars");
									if (userMoney < MIN_BET) {
										System.out.print("Sorry, you do not have enough money to play again.");
										System.exit(0);
									}
									again: while (true) {
										System.out.print("Would you like to play again?");
										veriFication = keyboard.next();

										if (veriFication.equalsIgnoreCase("yes")) {
											continue parent;
										} else if (veriFication.equalsIgnoreCase("no")) {
											System.out.print("The game is terminated. Bye. Come to play again!!");
											System.exit(0);
										} else {
											System.out.println("Answer is invalid. Please enter yes/no.");
											continue again;
										}
									}

								}

								if (userMoney < MoneyToPlay) {
									System.out.println("Sorry, you cannot bet more money than what you have.");
									continue;
								}

								if (MoneyToPlay < MIN_BET) {
									System.out.println("Sorry, the minimum amount of money is 2.00 dollars.");
									continue;
								}
								break;
							}
						} else if (difficultyLevel.equalsIgnoreCase("intermediate")) {
							incorrectGuesses = 0;
							MaxGuesses = 0;
							SecretCodeDigits = 4;
							while (true) {
								System.out.print("Enter the amount of money you want to bet: ");
								MoneyToPlay = keyboard.nextDouble();

								if ((userMoney >= MoneyToPlay) && (MoneyToPlay >= MIN_BET)) {
									int secretCode = (int) (Math.random() * 9000) + 1000;
									if (testingMode) {
										System.out.println("Testing Mode - the 4 digits number: " + secretCode);
									}
									MaxGuesses = 1;
									for (MaxGuesses = 1; MaxGuesses < 21; MaxGuesses++) {
										System.out.print("Please guess the 4 digits number: ");
										int userGuess = keyboard.nextInt();

										if ((userGuess >= 1000) && (userGuess <= 9999)) {
											int correctDigits = 0;
											int sumCorrectdigits = 0;
											int userUnparsedguess = userGuess;
											String parsedGuess = "";
											parsedGuess = Integer.toString(userUnparsedguess);
											String firstNumber = parsedGuess.substring(0, 1);
											String secondNumber = parsedGuess.substring(1, 2);
											String thirdNumber = parsedGuess.substring(2, 3);
											String fourthNumber = parsedGuess.substring(3, 4);

											int unparsedSecretcode = secretCode;
											String parsedSecretcode = "";
											parsedSecretcode = Integer.toString(unparsedSecretcode);
											String firstSolution = parsedSecretcode.substring(0, 1);
											String secondSolution = parsedSecretcode.substring(1, 2);
											String thirdSolution = parsedSecretcode.substring(2, 3);
											String fourthSolution = parsedSecretcode.substring(3, 4);

											if (parsedSecretcode.equals(parsedGuess)) {
												MaxGuesses = 20;
												MoneyEarned = (MoneyToPlay * SecretCodeDigits
														* (MaxGuesses - incorrectGuesses)) / (MaxGuesses);
												userMoney = userMoney - MoneyToPlay;
												userMoney = MoneyEarned + userMoney;

												System.out.println("\tYou won!!");
												System.out.println("\tYou had " + incorrectGuesses + " wrong guesses.");
												System.out.printf("\tYou have earned $%.2f dollars", MoneyEarned);
												System.out.printf("\n\tYour balance is now $%.2f dollars", userMoney);
												System.out.println("\n");
												playagain: while (true) {
													System.out.print("Would you like to play again?");
													veriFication = keyboard.next();

													if (veriFication.equalsIgnoreCase("yes")) {
														continue parent;
													} else if (veriFication.equalsIgnoreCase("no")) {
														System.out.print(
																"The game is terminated. Bye. Come to play again!!");
														System.exit(0);
													} else {
														System.out.println("Answer is invalid. Please enter yes/no.");
														continue playagain;
													}
												}
											}

											if (firstNumber.equals(firstSolution)) {
												correctDigits++;
												int firstNumberback = Integer.parseInt(firstNumber);
												sumCorrectdigits += firstNumberback;

											}
											if (secondNumber.equals(secondSolution)) {
												correctDigits++;
												int secondNumberback = Integer.parseInt(secondNumber);
												sumCorrectdigits += secondNumberback;

											}
											if (thirdNumber.equals(thirdSolution)) {
												correctDigits++;
												int thirdNumberback = Integer.parseInt(thirdNumber);
												sumCorrectdigits += thirdNumberback;

											}
											if (fourthNumber.equals(fourthSolution)) {
												correctDigits++;
												int fourthNumberback = Integer.parseInt(fourthNumber);
												sumCorrectdigits += fourthNumberback;

											}

											System.out.println("Number of correct digits: " + correctDigits);
											System.out.println("Sum: " + sumCorrectdigits);

										} else {
											System.out.println("The guess you have entered is ill-formed.");
											MaxGuesses--;
										}
										incorrectGuesses++;
									}
									userMoney = userMoney - MoneyToPlay;
									System.out.println("");
									System.out.println("Sorry, you lost!!!");
									System.out.println("The number was " + secretCode);
									System.out.println("You have lost " + MoneyToPlay + " dollars.");
									System.out.println("Your balance is now " + userMoney + " dollars");
									if (userMoney < MIN_BET) {
										System.out.print("Sorry, you do not have enough money to play again.");
										System.exit(0);
									}
									again: while (true) {
										System.out.print("Would you like to play again?");
										veriFication = keyboard.next();

										if (veriFication.equalsIgnoreCase("yes")) {
											continue parent;
										} else if (veriFication.equalsIgnoreCase("no")) {
											System.out.print("The game is terminated. Bye. Come to play again!!");
											System.exit(0);
										} else {
											System.out.println("Answer is invalid. Please enter yes/no.");
											continue again;
										}
									}

								}
								if (userMoney < MoneyToPlay) {
									System.out.println("Sorry, you cannot bet more money than what you have.");
									continue;
								}
								if (MoneyToPlay < 2) {
									System.out.println("Sorry, the minimum amount of money is 2.00 dollars.");
									continue;
								}
								break;
							}
						}

						else if (difficultyLevel.equalsIgnoreCase("advanced")) {
							incorrectGuesses = 0;
							int correctDigits = 0;
							int sumCorrectdigits = 0;
							MaxGuesses = 0;
							SecretCodeDigits = 5;
							while (true) {
								System.out.print("Enter the amount of money you want to bet: ");
								MoneyToPlay = keyboard.nextDouble();

								if ((userMoney >= MoneyToPlay) && (MoneyToPlay >= 2)) {
									int secretCode = (int) (Math.random() * 90000) + 10000;
									if (testingMode) {
										System.out.println("Testing Mode - the 5 digits number: " + secretCode);
									}
									MaxGuesses = 1;
									for (MaxGuesses = 1; MaxGuesses < 11; MaxGuesses++) {
										System.out.print("Please guess the 5 digits number: ");
										int userGuess = keyboard.nextInt();

										if ((userGuess >= 10000) && (userGuess <= 99999)) {
											correctDigits = 0;
											sumCorrectdigits = 0;
											int userUnparsedguess = userGuess;
											String parsedGuess = "";
											parsedGuess = Integer.toString(userUnparsedguess);
											String firstNumber = parsedGuess.substring(0, 1);
											String secondNumber = parsedGuess.substring(1, 2);
											String thirdNumber = parsedGuess.substring(2, 3);
											String fourthNumber = parsedGuess.substring(3, 4);
											String fifthNumber = parsedGuess.substring(4, 5);

											int unparsedSecretcode = secretCode;
											String parsedSecretcode = "";
											parsedSecretcode = Integer.toString(unparsedSecretcode);
											String firstSolution = parsedSecretcode.substring(0, 1);
											String secondSolution = parsedSecretcode.substring(1, 2);
											String thirdSolution = parsedSecretcode.substring(2, 3);
											String fourthSolution = parsedSecretcode.substring(3, 4);
											String fifthSolution = parsedSecretcode.substring(4, 5);

											if (parsedSecretcode.equals(parsedGuess)) {
												MaxGuesses = 10;
												MoneyEarned = (MoneyToPlay * SecretCodeDigits
														* (MaxGuesses - incorrectGuesses)) / (MaxGuesses);
												userMoney = userMoney - MoneyToPlay;
												userMoney = MoneyEarned + userMoney;

												System.out.println("\tYou won!!");
												System.out.println("\tYou had " + incorrectGuesses + " wrong guesses.");
												System.out.printf("\tYou have earned $%.2f dollars", MoneyEarned);
												System.out.printf("\n\tYour balance is now $%.2f dollars", userMoney);
												System.out.println("\n");
												if (userMoney < MIN_BET) {
													System.out.println(
															"Sorry, you do not have enough money to play again.");
													System.exit(0);
												}
												playagain: while (true) {
													System.out.print("Would you like to play again?");
													veriFication = keyboard.next();

													if (veriFication.equalsIgnoreCase("yes")) {
														continue parent;
													} else if (veriFication.equalsIgnoreCase("no")) {
														System.out.print(
																"The game is terminated. Bye. Come to play again!!");
														System.exit(0);
													} else {
														System.out.println("Answer is invalid. Please enter yes/no.");
														continue playagain;
													}
												}
											}

											if (firstNumber.equals(firstSolution)) {
												correctDigits++;
												int firstNumberback = Integer.parseInt(firstNumber);
												sumCorrectdigits += firstNumberback;

											}
											if (secondNumber.equals(secondSolution)) {
												correctDigits++;
												int secondNumberback = Integer.parseInt(secondNumber);
												sumCorrectdigits += secondNumberback;

											}
											if (thirdNumber.equals(thirdSolution)) {
												correctDigits++;
												int thirdNumberback = Integer.parseInt(thirdNumber);
												sumCorrectdigits += thirdNumberback;

											}
											if (fourthNumber.equals(fourthSolution)) {
												correctDigits++;
												int fourthNumberback = Integer.parseInt(fourthNumber);
												sumCorrectdigits += fourthNumberback;

											}
											if (fifthNumber.equals(fifthSolution)) {
												correctDigits++;
												int fifththNumberback = Integer.parseInt(fifthNumber);
												sumCorrectdigits += fifththNumberback;

											}

											System.out.println("Number of correct digits: " + correctDigits);
											System.out.println("Sum: " + sumCorrectdigits);

										} else {
											System.out.println("The guess you have entered is ill-formed.");
											MaxGuesses--;
										}
										incorrectGuesses++;
									}
									userMoney = userMoney - MoneyToPlay;
									System.out.println("");
									System.out.println("Sorry, you lost!!!");
									System.out.println("The number was " + secretCode);
									System.out.println("You have lost " + MoneyToPlay + " dollars.");
									System.out.println("Your balance is now " + userMoney + " dollars");
									if (userMoney < MIN_BET) {
										System.out.print("Sorry, you do not have enough money to play again.");
										System.exit(0);
									}
									again: while (true) {
										System.out.print("Would you like to play again?");
										veriFication = keyboard.next();

										if (veriFication.equalsIgnoreCase("yes")) {
											continue parent;
										} else if (veriFication.equalsIgnoreCase("no")) {
											System.out.print("The game is terminated. Bye. Come to play again!!");
											System.exit(0);
										} else {
											System.out.println("Answer is invalid. Please enter yes/no.");
											continue again;
										}
									}

								}
								if (userMoney < MoneyToPlay) {
									System.out.println("Sorry, you cannot bet more money than what you have.");
									continue;
								}
								if (MoneyToPlay < 2) {
									System.out.println("Sorry, the minimum amount of money is 2.00 dollars.");
									continue;
								}
								break;
							}
						}

						else {
							System.out.println("Sorry, this is not a correct level.");
							continue;
						}
						break;
					}

				} else {
					System.out.println("Sorry, you should have at least 2.0 to play the game. Bye!");
				}
			} else if (veriFication.equalsIgnoreCase("no")) {
				System.out.println("Bye, see you next time.");
				System.exit(0);
			} else {
				System.out.println("Answer is invalid. Please enter yes/no.");
				continue;
			}
			break;
		}
	}
}
