package simplestartupgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleStartupGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum , randomNum + 1 , randomNum + 2};
        theStartup.setLocationCells(locations);
        int numOfGuesses = 0;
        boolean isAlive = true;
        int op = 0;
        GameHelper helper = new GameHelper();

        do{
            try {
                System.out.println();
                System.out.print("""
                        Menu Game Simple Startup
                        [1] - Start Game
                        [2] - Exit
                        Choose an option:
                        """);
                op = sc.nextInt();

                switch (op){
                    case 1:
                        while (isAlive){
                            int guess = helper.getUserInput("Enter a number:");
                            String result = theStartup.checkYourself(guess);
                            numOfGuesses++;
                            if(result.equals("kill")){
                                isAlive = false;
                                System.out.println("You took " + numOfGuesses + " guesses");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Exit...");
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 2");
                }
            }catch (InputMismatchException e){
                System.out.println("Error, please provide numbers.");
                sc.nextLine();
            }
        }while (op != 2);




    }
}