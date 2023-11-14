package u4pp;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to u4pp! Use this space to test your code as you go.\nGood luck! :)\n");
        
        Scanner sc = new Scanner(System.in);
        
        //RockPaperScissors.play(sc);
        //PalindromeTester palindromeTester = new PalindromeTester();
        PalindromeTester.execute(sc);
        sc.close();
        System.out.println("Thanks for playing!");
    }
}
