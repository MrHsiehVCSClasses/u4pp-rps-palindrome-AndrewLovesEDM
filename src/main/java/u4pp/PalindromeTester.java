package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
	Scanner sc;
    @SuppressWarnings("removal")
	public static void execute(Scanner sc) {
    	sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Tester");
        System.out.println("Would you like to play the game?" + " Answer: ");
        String meow = sc.nextLine();
        while (keepTesting(meow)) {
	        System.out.println("Enter a phrase: ");
	        String input2 = sc.nextLine();
	        if (isPalindrome(input2)) {
	        	System.out.println(input2 + " is a Palindrome");
	        }
	        else if (!isPalindrome(input2)) {
	        	System.out.println(input2 + " is not a Palindrome");
	        }
	        
	        System.out.println("Keep Testing? (Y)es or (N)o: ");
	        meow = sc.nextLine();
//	        System.out.println("Keep testing?");
//	        String input3 = sc.nextLine();
//	        if (input3.equals("no")) {
//	        	
//	        }
        }
        sc.close();
    }

    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) {
    	String input = phrase;
    	int strLength = input.length();
    	int a = strLength - 1;
    	String flipString = "";
    	
    	// flips string to make sure its a palindrome
    	
//		String isTrue = (input + " is a Palindrome");
//    	String isFalse = (input + " is a Palindrome");
    	while (a >= 0) {
    		flipString = flipString + input.charAt(a);
    		a--;
    	}
    	flipString.toLowerCase();
    	input.toLowerCase();
    	String flipString2 = "";
    	strLength = flipString.length();
    	a = strLength - 1;
    	String urmom = flipString;
    	
    	// flips the string again to make sure the palindrome matches its original input
    	while (a >= 0) {
    		flipString2 = flipString2 + flipString.charAt(a);
    		a--;
    	}
    	
    	if (flipString2.equals(urmom)) {
    		return true;
    		//System.out.println(input + " is a Palindrome");
    		//return (input + " is not a Palindrome");
    	}
    	else {
    		return false;
    		//return (input + " is not a Palindrome");
    		//System.out.println(input + " is not a Palindrome");
    	}
    }

    /* Any helper methods you might need */

	public static boolean keepTesting(String cat) {
		//converts user ipput for going again to return true or false
		String inputting = cat;
		inputting.toLowerCase();
		if (inputting.equals("yes")) {
			return true;
		}
		else if (inputting.equals("y")) {
			return true;
		}
		else if (inputting.equals("no")){
			return false;
		}
		else if (inputting.equals("n")) {
			return false;
		}
		else {
			return false;
		}
		
	}
}