package com.timbulchalka;

public class Main {

    public static void main(String[] args) {
		int highScore = calculateScore(true, 800, 5, 100);
		// go run the method defined bellow Variable highScore will have the value returned
		System.out.println("Your final score was " + highScore);

		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was " + highScore);

		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Diana", position);

		position = calculateHighScorePosition(900);
		displayHighScorePosition("João", position);

		position = calculateHighScorePosition(400);
		displayHighScorePosition("Max", position);

		position = calculateHighScorePosition(50);
		displayHighScorePosition("Brutus", position);
	}
    //method main above
	//new method bellow, must be inside class Main

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //method parameters

    	//use void not to return any information from the method
		//use type of data to return from method (example: int)

		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}//my solution::
		// else{
			//return -1;

		//Tim solution:
		return -1;
		}

		//EXERCISE

	public static void displayHighScorePosition (String playerName, int position ){
		System.out.println(playerName + " managed to get into position " + position + " on the Highscore table.");
	}

	public static int calculateHighScorePosition(int playerScore) {

    	if (playerScore >= 1000){
    		return 1;
		}else if (playerScore >= 500 && playerScore < 1000){
			return 2;
				} else if (playerScore >= 100 && playerScore <500){
    		return 3;
		} else {
    		return 4;
		}
	}
	}
