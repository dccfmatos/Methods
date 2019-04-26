package com.timbulchalka;

public class Main {

    public static void main(String[] args) {
		calculateScore(true, 800, 5, 100); // go run the method defined bellow
		calculateScore(true, 10000, 8, 200);
	}
    //method main above
	//new method bellow, must be inside class Main

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) { //method parameters

    	//use void not to return any information from the method
		//use type of data to return from method (example: int)


		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		}//my solution::
		// else{
			//return -1;

		//Tim solution:
		return -1;
		}

	}



}
