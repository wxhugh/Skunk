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
	String skunky = ("1111111111111111111111111111111111111111111````111111111111111111111" + "\n" +
"111111111111111111111111111111111111111``      `11111111111111111111" + "\n" +
"111111111111111111111111111111111111` aaa@      11111111111111111111" + "\n" +
"1111111111111111111111111111111111`a@@@@`  a    `1111111111111111111" + "\n" +  
"11111111111111111111111111111111` `@` @  a@@`a   1111111111111111111" + "\n" +
"11111111111111111111111111111111,  @ @@ @@@ ` @  1111111111111111111" + "\n" + 
"111111111111111111111111```     ``a  ``a a@@a`   1111111111111111111" + "\n" +
"111111111111111111111`  a@a@@@aa@@`  a@@@        1111111111111111111" + "\n" +
"1111111111111111111` aa#` ` ``` `   @@@@@@     ,11111111111111111111" + "\n" +
"111111111111111111` @`   aa@@@@@@@@a ````    11111111111111111111111" + "\n" +
"111111111111111111 @  aaa@@@@@@@@@`          `111111111111111111111P" + "\n" +
"111111111111111111 @@@@``@   `   `            `11111111111111111111h" + "\n" +
"111111111111111111 @@@                  .      `1111111111111111111o" + "\n" +
"111111111111111@@@@@@                    .         `111111111111111e" + "\n" +
"11111111111@@@@@@@@`                 `  ,1,        ,111111111111111n" + "\n" +
"11111111@@@@@@ @  1,               ,`,,11111....:::::::111111111111i" + "\n" +
"111111@@@@@@@@`  111,             .11111111:::::::::::::.1111111111x" + "\n" +
"11111@@@@@@@ @  11111.               `111.:::::::::::::::.1111111111");
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
					System.out.println("You got skunk!");
					System.out.println(skunky);
					break;
				}
				if (die1 == 3 && die2 == 5 || die1 == 5 && die2 == 3) {
					skunk = true;
					roundScore = 0;
					System.out.println("You got skunk!");
					System.out.println(skunky);
					break;
				} 
				if (die1 == 2 && die2 == 6 || die1 == 6 && die2 == 2) {
					skunk = true;
					roundScore = 0;
					System.out.println("You got skunk!");
					System.out.println(skunky);
					break;
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
		System.out.println("Your final score is " + score + ".");
		return score;
	} 

	
	public String toString() {
		return (player + " you are the player.");
		 
	}
}
