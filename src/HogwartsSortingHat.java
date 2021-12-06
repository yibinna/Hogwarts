import java.util.Random;

/*Extremely simple Chance algorithm to find your House for Hogwarts! It was
 * in the beginning stages of learning Java. Created by yibinna on GitHub.
 */
public class HogwartsSortingHat {

	public static void main(String[] args) {
		Menu myMenu = new Menu();
		String answer = "";
		while (myMenu.getOption() != 2) {
			myMenu.outputMenu();
			sortingHat();
			System.out.println("Would you like to play again?");
			answer = myMenu.userAnswer();
			myMenu.setAnswer(answer);
			if (!myMenu.getAnswer().equalsIgnoreCase("yes") 
					&& !myMenu.getAnswer().equalsIgnoreCase("y")) {
				System.out.println("Exiting.");
				System.out.println("Program by yibinna");
				return;
			}else {
				myMenu.setOption(0);
			}
		}
	}


	public static void sortingHat() {
		String[] hogwarts = { "Hufflepuff", "Griffindor", "Ravenclaw", "Slitherin" };
		Random r = new Random();
		int randomNumber = r.nextInt(hogwarts.length);
		System.out.println("You've got " + hogwarts[randomNumber] + "!");
	}
}