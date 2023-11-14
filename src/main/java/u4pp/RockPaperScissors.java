package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */

    /**
     * JAVADOC HERE
     */
	Scanner sc;
    public static void play(Scanner sc) {
    	sc = new Scanner(System.in);
        System.out.println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny:");
        //System.out.println(results);
        String input = sc.nextLine();
        String computerChoice;
        computerChoice = random();
        
        input.toLowerCase();
        if (input.equals("any") || input.equals("a")) {
        	input = random();
        }
        
//        input.toLowerCase();
//        if (input.equals("r")) {
//    		input = "Rock";
//    	}
//    	else if (input.equals("p")) {
//    		input = "Paper";
//    	}
//    	else if (input.equals("s")) {
//    		input = "Scissors";
//    	}
        
        int poop = results(input, computerChoice);
        // win and lose and tie count
        int winCount = 0;
        int loseCount = 0;
        int tieCount = 0;

        // first runthrough of code is different then the rest
        if (poop == 1) {
        	System.out.println("You win! The computer chose " + computerChoice + " and you chose " + input + ".");
        	winCount = winCount + 1;
        }
        else if (poop == 0) {
        	System.out.println("You tied! The computer chose " + computerChoice + " and you chose " + input + ".");
        	tieCount = tieCount + 1;
        }
        else if (poop == -1) {
        	System.out.println("You lose! The computer chose " + computerChoice + " and you chose " + input + ".");
        	loseCount = loseCount + 1;
        }
        else if (poop == 2) {
        	System.out.println("Invalid Input, please try again");
        }

    	System.out.println("You have " + winCount + " wins and " + loseCount + " losses and " + tieCount + " ties!");
        
        
        
        System.out.println("Go again? Yes or no? ");
        input = input.toLowerCase();
        input = sc.nextLine();
        
        // after asking go again? - it goes to the main loop for the game
        while (!input.equals("no")) {
        	
        	if (input.equals("yes")) {
        		System.out.println("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny:");
                //System.out.println(results);
                input = sc.nextLine();
                computerChoice = random();
                
                poop = results(input, computerChoice);
        		if (poop == 1) {
                	System.out.println("You win! The computer chose " + computerChoice + " and you chose " + input + ".");
                	winCount = winCount + 1;
                }
                else if (poop == 0) {
                	System.out.println("You tied! The computer chose " + computerChoice + " and you chose " + input + ".");
                	tieCount = tieCount + 1;
                }
                else if (poop == -1) {
                	System.out.println("You lose! The computer chose " + computerChoice + " and you chose " + input + ".");
                	loseCount = loseCount + 1;
                }
                else if (poop == 2) {
                	System.out.println("Invalid Input, please try again");
                }
            	System.out.println("You have " + winCount + " wins and " + loseCount + " losses and " + tieCount + " ties!");
        	}
        	else {
            	System.out.println("Invalid Input, please try again");
        	}
        	System.out.println("Would you like to go again? Yes or no?");
        	input = input.toLowerCase();
        	input = sc.nextLine();
        	
        }
        sc.close();
        
	
    }

    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
    	//Random any = new Random();
    	
    	playerChoice = playerChoice.toLowerCase();
    	
    	// simplifies user input by making it one letter
    	if (playerChoice.equals("any") || playerChoice.equals("a")) {
    		playerChoice = "a";
    		playerChoice = random();
    		playerChoice = playerChoice.toLowerCase();
    		if (playerChoice.equals("rock")) {
        		playerChoice = "r";
        	}
        	else if (playerChoice.equals("paper")) {
        		playerChoice = "p";
        	}
        	else if (playerChoice.equals("scissors")) {
        		playerChoice = "s";
        	}
    	}
    	
    	else if (playerChoice.equals("rock")) {
    		playerChoice = "r";
    	}
    	else if (playerChoice.equals("paper")) {
    		playerChoice = "p";
    	}
    	else if (playerChoice.equals("scissors")) {
    		playerChoice = "s";
    	}
    	//create an "any" choice for playerChoice
    	
    	
    	
    	computerChoice = computerChoice.toLowerCase();
    	playerChoice = playerChoice.toLowerCase();
    	
    	if (computerChoice.equals("rock")) {
    		computerChoice = "r";
    	}
    	else if (computerChoice.equals("paper")) {
    		computerChoice = "p";
    	}
    	else if (computerChoice.equals("scissors")) {
    		computerChoice = "s";
    	}
    	

    	//create thing to make sure playerhoice is lowercase (R) turns to (r)
    	if (playerChoice.equals(computerChoice)) {
    		return 0;
    	}
    	/*return 1 if player wins
    	 * return 0 if player ties with computer
    	 * return -1 is computer wins
    	 */


    	// simplifies user input and computer input by showing who won the game
    	if (playerChoice.equals("r") && computerChoice.equals("s")) {
    		return 1;
    	}
    	if (playerChoice.equals("s") && computerChoice.equals("r")) {
    		return -1;
    	}
    	if (playerChoice.equals("p") && computerChoice.equals("s")) {
    		return -1;
    	}
    	if (playerChoice.equals("s") && computerChoice.equals("p")) {
    		return 1;
    	}
    	if (playerChoice.equals("r") && computerChoice.equals("p")) {
    		return -1;
    	}
    	if (playerChoice.equals("p") && computerChoice.equals("r")) {
    		return 1;
    	}
//    	if (playerChoice == "s" && computerChoice == "r") {
//    		return -1;
//    	}
//    	if (playerChoice == "p" && computerChoice == "s") {
//    		return -1;
//    	}
//    	if (playerChoice == "s" && computerChoice == "p") {
//    		return 1;
//    	}
//    	if (playerChoice == "r" && computerChoice == "p") {
//    		return -1;
//    	}
    	else {
    		return 2;
    	}

    	

    	//output the number returned
    	
    	//String Player input
    	//String Random Computer input
    }


    /* create a helper method that returns a random choice 
     * between "r", "p", or "s"
     */
    public static String random() {
    	
    	// math random between 1 and 3.
    	// if 1, s
    	// if 2, p
    	// if 3, r
    	// return that
    	int rps = (int)(Math.random()*3);
    	if (rps == 1) {
    		return "Scissors";
    	}
    	else if (rps == 2) {
    		return "Rock";
    	}
//    	else if (rps == 3) {
//    		return "p";
//    	}
    	else {
    		return "Paper";
    	}
    	
    }
}
    /* any helper methods you might need */
    
//    public static String yes(String computer) {
//    	// get computer to randomly choose rock, paper, or scissors
//    	//String computer = randomChoice;
//    	String laptop = computer;
//    	String computerChoice = new random();
//    	String random = computerChoice;
//    }

	
//	public static void wow(Boolean ginesoae, Scanner sc) {
//	// should we continue?
//		sc = new Scanner(System.in);
//        System.out.println("Go again? Yes or no? ");
//        //while (input = "Yes") {
//        	
//        //}
//        sc.close();
//		
//	}
//}