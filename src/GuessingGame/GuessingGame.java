package GuessingGame;

/* This game will have the user find a random number between 1 and 50.
 * Date:9/16/20
 * Name: Sarah Temple
 */

import java.util.Scanner;

public class GuessingGame {
	
	public GuessingGame() {
		boolean stillPlaying = true;
		
		while (stillPlaying== true) {
			
			int randomNum = (int) (Math.random() * 51);
			System.out.println(randomNum);
			Scanner scanner = new Scanner(System.in);
			int guess = -1;
			while (guess != randomNum) {
				String input = scanner.nextLine();
				System.out.println("You typed: " + input);
				guess = Integer.parseInt(input);
				System.out.println(guess);
				if (guess < randomNum) {
					System.out.println("Your guess is less than the random number.");
				
				}
			}
			System.out.println("Play again?");
		}
	}
	


	public static void main(String[] args) {
		new GuessingGame();

	}

}
