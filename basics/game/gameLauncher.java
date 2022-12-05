import java.lang.annotation.Target;

// guess class
class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startgame() {
//		player instances
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
//		variables holding the guess values
		int guessP1 = 0;
		int guessP2 = 0;
		int guessP3 = 0;
		
//		player answer boolean (true or false)
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
//		Number that players have to guess
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Am guessing a number between 0 and 9");
		
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			
//			calling each player's guess
			p1.guess();
			p2.guess();
			p3.guess();
			
//			loading each player's guess
			guessP1 = p1.number;
			System.out.println("Player one has guessed " + guessP1);
			
			guessP2 = p2.number;
			System.out.println("Player two has guessed " + guessP2);
			
			guessP3 = p3.number;
			System.out.println("Player three has guessed "+guessP3);
			
//			Checking if the player's guess is right
			if (guessP1 == targetNumber) {
				p1isRight = true;
				System.out.println("Player One is right ...");
			}
			if (guessP2 == targetNumber) {
				p2isRight = true;
				System.out.println("Player Two is right ...");
			}
			if (guessP3 == targetNumber) {
				p3isRight = true;
				System.out.println("Player Three is right ...");
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				 System.out.println("We have a winner!");
				 System.out.println("Player one got it right? " + p1isRight);
				 System.out.println("Player two got it right? " + p2isRight);
				 System.out.println("Player three got it right? " + p3isRight);
				 System.out.println("Game is over.");
				 break; // game over, so break out of the loop
			}else {
				 // we must keep going because nobody got it right!
				 System.out.println("Players will have to try again.");
			}
		}
	}
}

// player class
class Player{
	int number = 0;
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}

public class gameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame game = new GuessGame();
		game.startgame();
	}

}
