import java.util.Scanner;
//Generic menu created by yibinna on GitHub while learning Java!
public class Menu {
	private static final int MENU = 0;
	private static final int START = 1;
	private static final int EXIT = 2;
	private Scanner keyboard = new Scanner(System.in);
	int option;
	String answer; 

	public int userOption() {
		try {
		option = Integer.parseInt(keyboard.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("Please input valid number.");
		}
		return option;
	}
	public String userAnswer() {
		answer = keyboard.nextLine();
		return answer;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public int getOption() {
		return option;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswer() {
		return answer;
	}
	void outputMenu() {
		int selection = 0;
		String answer = "";
		while(true) {
			switch (selection) {
			case MENU:
				System.out.println("Press 1 to Begin");
				System.out.println("Press 2 to Exit");
				System.out.println("Press 0 to return to menu");
				selection = userOption();
				break;
			case START:
				System.out.println("Would you like to begin program");
				answer = userAnswer();
				if (!answer.equalsIgnoreCase("no")&&(!answer.equalsIgnoreCase("n"))) {
					System.out.println("Starting Program.");
					return;
				} else {
					System.out.println("Going back to menu");
					selection = 0;
					break;
				}
			case EXIT:
				System.out.println("Closing Program.");
				System.exit(EXIT);
			}
		}
	}
}
