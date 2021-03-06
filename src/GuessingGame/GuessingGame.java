package GuessingGame;

/* This game will have the user find a random number between 1 and 50.
 * Date:9/16/20
 * Name: Sarah Temple
 */

import java.util.Scanner;

public class GuessingGame {
	
	public GuessingGame() {
		boolean stillPlaying = true;
		Scanner scanner = new Scanner(System.in);
		while (stillPlaying== true) {
			System.out.println("I am thinking of a number between 0 and 50. Type your best guess below and I will tell you if it is too high or low.");
			int randomNum = (int) (Math.random() * 51);
			int guess = -1;
			int numtry = 0;
			// This is where the bulk of the game happens. 
			while (guess != randomNum) {
				String input = scanner.nextLine();
				System.out.println("You typed: " + input);
				// this will turn guess into an int so it can be compared to the randomNum
				guess = Integer.parseInt(input);
				if (guess < randomNum) {
					System.out.println("Your guess is less than the random number.");
					System.out.println("Try again!");
					numtry = numtry + 1;
				}
				if (guess > randomNum) {
					System.out.println("Your guess is more than the random number.");
					System.out.println("Try again!");
					numtry = numtry + 1;
				}
			}
			// getting it correct is here
			if (guess == randomNum){
				System.out.println("You are correct!");
				System.out.println("You guessed incorrectly " + numtry + " times.");
			}
			// This will ask you to play again and will redo the game if you say yes
			System.out.println("Play again?");
			String yesno = scanner.nextLine();
			if (yesno.equals("yes") || yesno.equals("y") ) {
				stillPlaying = true;
			}
			else {
				stillPlaying = false;
				scanner.close(); // this will close the scanner
			}
		}
	}


	public static void main(String[] args) {
		new GuessingGame();

	}

}
