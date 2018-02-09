/* 
		*[MultipleChoiceFlashCards].java
		 *Author: [Parker Casey]
		 *Submission Date: [9/25/2014]
		 *
		 *Purpose: A brief paragraph description of the
		 *program. What does it do? In this project we created a study game. The game
		 *randomly gives the user 3 questions and and allows them to answer. At the end 
		 *of the game it gives the user their score. I used if else statements and various other 
		 *strategies in this project.
		
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
public class MultipleChoiceFlashCards {

	public static void main(String[] args) {
		System.out.println("Welcome to CSCL 1301 Multiple Choice Flash Cards");
		System.out.println("");
		Scanner keyboard = new Scanner(System.in);
		
		// here I have named the variables
		String choiceA,choiceB,choiceC,choiceD,questionAndChoices,answer,userAnswer = null;
		int amountcorrect = 0;
		// here the previously written code is loaded
		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		
		System.out.print(questionAndChoices);
		System.out.print("Enter your answer A-D: ");
	
		//here i take the users answer and make it equal to the flash cards corresponding answer
		userAnswer = keyboard.nextLine();
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d"))
		{	
			if (userAnswer.equalsIgnoreCase("a")){
				userAnswer = choiceA;}
			else if (userAnswer.equalsIgnoreCase("b")){
				userAnswer = choiceB;}
			else if (userAnswer.equalsIgnoreCase("c")){
				userAnswer = choiceC;}
		    else if (userAnswer.equalsIgnoreCase("d")){
		    	userAnswer = choiceD;}
		}
	    // here any answer that is not acceptable makes the game exit out
		else 
		{
			System.out.println("Invalid answer.");
			System.out.println("An answer must begin with a,A,b,B,c,C,D or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
			
		// here if the answer is correct it gives you a point to your score 		
		if (userAnswer.equals(answer)) {
			amountcorrect += 1;
			System.out.println("Correct Answer!");
			System.out.println("Your score: " + amountcorrect + " out of 1 point(s)");
			System.out.println("");
		}
		else  
		{
			System.out.println("Incorrect Answer!");
			System.out.println("Your score:" + amountcorrect + " out of 1 point(s)");
		}
		System.out.println("");

		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();		
	
		System.out.println(questionAndChoices);
		System.out.print("Enter your answer A-D: ");
	
	
		userAnswer = keyboard.nextLine();
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d"))
		{
			if (userAnswer.equalsIgnoreCase("a")){
				userAnswer = choiceA; }
			else if (userAnswer.equalsIgnoreCase("b")){
				userAnswer = choiceB;}
			else if (userAnswer.equalsIgnoreCase("c")){
				userAnswer = choiceC;}
		    else if (userAnswer.equalsIgnoreCase("d")) {
		    	userAnswer = choiceD;}
		}
		else {
			System.out.println("Invalid answer.");
			System.out.println("An answer must begin with a,A,b,B,c,C,D or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
	
		if (userAnswer.equals(answer)) {
			amountcorrect += 1;
			System.out.println("Correct Answer!");
			System.out.println("Your score: " + amountcorrect + " out of 2 point(s)");
			System.out.println("");
		}
		else  
		{
			System.out.println("Incorrect Answer!");
			System.out.println("Your score: " + amountcorrect + " out of 2 point(s)");
		}
		System.out.println("");

		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		
				
		System.out.print(questionAndChoices);
		System.out.print("Enter your answer A-D: ");
		
		
		userAnswer = keyboard.nextLine();
		if (userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d"))
		{
	
			if (userAnswer.equalsIgnoreCase("a")){
				userAnswer = choiceA; }
			else if (userAnswer.equalsIgnoreCase("b")){
				userAnswer = choiceB;}
			else if (userAnswer.equalsIgnoreCase("c"))
			{
				userAnswer = choiceC;
			}
		    else if (userAnswer.equalsIgnoreCase("d")) {
		    	userAnswer = choiceD;}
		}
		else
		{
			System.out.println("Invalid answer.");
			System.out.println("An answer must begin with a,A,b,B,c,C,D or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}

		if (userAnswer.equals(answer)) {
			amountcorrect += 1;
			System.out.println("Correct Answer!");
			System.out.println("Your score: " + amountcorrect + " out of 3 point(s)");
		}
		else  {
			System.out.println("Incorrect Answer!");
			System.out.println("Your score: " + amountcorrect + " out of 3 point(s)");
		}
		
		System.out.println("");
		System.out.println("Your final score: " + amountcorrect + " out of 3 point(s)");
		
		//here the game evaluates your overall score for the game and gives you a message
		if (amountcorrect == 0){
			System.out.println("Your computer wit needs sharpening.");}
		else if (amountcorrect == 1) {
			System.out.println("Your computer wit needs sharpening.");}
		else if (amountcorrect == 2){
			System.out.println("Your computer wit is sharp.");} 
		else if (amountcorrect == 3) {
			System.out.println("Your computer science wit is as sharp as Occam's razor."); }
		
		System.out.println("Game Over!");
	}
}


