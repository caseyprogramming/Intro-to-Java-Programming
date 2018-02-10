import java.util.Scanner;
public class starsample {

	public static void main(String[] args) {
		double MoneyToPlay=0;
		int SecretCodeDigits=0,MaxGuesses=0,incorrectGuesses=0;
		//MoneyEarned = (MoneyToPlay*SecretCodeDigits*(MaxGuesses-incorrectGuesses))/(MaxGuesses);
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Moneytoplay:");
		MoneyToPlay = keyboard.nextDouble();
		System.out.println("Secretcodedegits: ");
		SecretCodeDigits = keyboard.nextInt();
		System.out.println("maxguesses: ");
		MaxGuesses = keyboard.nextInt();
		System.out.println("incorrectguesses: ");
		incorrectGuesses = keyboard.nextInt();
		
		double MoneyEarned = ((MoneyToPlay*SecretCodeDigits*(MaxGuesses-incorrectGuesses))/(MaxGuesses));

		System.out.printf("MoneyEarned %.2f dollars", MoneyEarned);

	}

}
