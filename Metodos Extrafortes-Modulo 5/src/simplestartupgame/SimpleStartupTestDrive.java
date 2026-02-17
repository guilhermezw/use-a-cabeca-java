package simplestartupgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleStartupTestDrive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2 , 3 , 4};
        dot.setLocationCells(locations);
        int op = 0;
        do{
            try{
                System.out.println();
                System.out.println("""
                    [Test Menu]
                    [1] - Start test
                    [2] - Exit test
                    Choose an option:
                    """);
                op = sc.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Give your guess.");
                        int userGuess = sc.nextInt();
                        String result = dot.checkYourself(userGuess);

                        String testResult = "failed";
                        if(result.equals("hit")){
                            testResult = "passed";
                        }
                        System.out.println(testResult);
                        break;
                    case 2:
                        System.out.println("Exit..");
                        break;
                    default:
                        System.out.println("Enter a number from 1 to 2");
                }
            }catch (InputMismatchException e){
                System.out.println("Error, please provide numbers.");
                sc.nextLine();
            }

        }while(op != 2);


    }
}