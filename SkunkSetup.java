import java.util.*;

class SkunkSetup {
	Random dice = new Random();
	Scanner answer = new Scanner(System.in);
	String player = "";
	int die1 = 0;
	int die2 = 0;
	int score = 0;
	int roundScore = 0;
	boolean skunk = false;
	public String playerSetup() {
		System.out.println("What is your name?");
		player = answer.next();
		return player;
	}
	public int roll() {
		int rounds = 0;
		String rolls = "";
		System.out.println("How many rounds do you want to play?");
		rounds = answer.nextInt();
		for (int i = 1; i <= rounds; i ++) {
			while (skunk == false) {
				die1 = dice.nextInt(7 - 1) + 1;
				die2 = dice.nextInt(7 - 1) + 1;
				System.out.println("die1 is " + die1 + " and die2 is " + die2);
				roundScore = roundScore + die1 + die2;
				if (die1 == 1 && die2 == 1) {
					skunk = true;
					score = 0;
					roundScore = 0;

				}
				if (die1 == 3 && die2 == 5 || die1 == 5 && die2 == 3) {
					skunk = true;
					roundScore = 0;
				} 
				if (die1 == 2 && die2 == 6 || die1 == 6 && die2 == 2) {
					skunk = true;
					roundScore = 0;
				}
				System.out.println("Your current score for round " + i + " is " + roundScore + ".");
				System.out.println("Do you want to roll again?");
				rolls = answer.next();
				if (rolls.equals("yes")) {
					skunk = false;
				} 
				if (rolls.equals("no")) {
					skunk = true;
				} 
			}
			score += roundScore;
			System.out.println("Your score after round " + i + " is " + score + ".");
			skunk = false;		
		}
		System.out.println("Your final score is" + score + ".");
		return score;
	} 

	
	public String toString() {
		return (player + " you are the player.");
		 
	}
}
