package simplestartupgame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StartupBust {
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    private void setUpGame(){
        // Cria algumas Startups e lhes fornece locais.
        // Cria trẽs objetos Startup, lhes fornece nomes e os insere no ArrayList
        Startup one = new Startup();
        one.setName("poniez");
        Startup two = new Startup();
        two.setName("hacqi");
        Startup three = new Startup();
        three.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(three);
        // Printa breves instruções para usuário
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");
        // Repete isso com cada Startup na lista.
        for (Startup startup : startups){ // Solicitar ao auxiliar um local para a Startup (um ArrayList de Strings)
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation); // Chama o método setter nesta Startup para fornecer o local que vocẽ acabou de obter de auxiliar
        }
    }

    private void startPlaying(){
        while(!startups.isEmpty()){ // Desde que a listar de Startup NÃO seja vazia siginificar NÃO, é o mesmo que (startups.isEmpty() == false)
            String userGuess = helper.getUserInput("Enter a guess: "); //Obtém a entrada do usuário
            checkUserGuess(userGuess); //Chama nosso métedo checkUserGuess
        }
        finishGame(); // Chama nosso método finishGame
    }


    private void checkUserGuess(String userGuess){
        numOfGuesses++; // Incrementa o número de palpites que o usuário fez.
        String result = "miss"; // Assume que é um 'erro', a menos que seja dito o contrario

        for(Startup startupToTest : startups){ // Repete isso com todas as Startups na lista
            result = startupToTest.checkYourself(userGuess); // Solicita á Startup para verficar o palpite do usuário, procurando por um acerto(ou abate)

            if(result.equals("hit")){ // Sai antes loop, não adianta testar os outros
                break;
            }
            if (result.equals("kill")){
                startups.remove(startupToTest); // Esta foi abatida, então removida da lista de Startups e sai do loop
                break;
            }
        }
        System.out.println(result); // Exibir o resultado para usuário
    }

    private void finishGame(){ // Printa uma mensagem contando ao usuário como ele se se saiu no jogo
        System.out.println("All Startups are dead! Your stock is now worthless");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses");
        } else {
            System.out.println("Took you lang enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main() {
        StartupBust game = new StartupBust();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            try {
                System.out.print("""
                Menu Game Sink a Startup
                [1] - Start game
                [2] - Exit  game
                Choose an option
                """);
                op = sc.nextInt();

                switch (op){
                    case 1:
                        game.setUpGame(); // Solicita ao objeto game para configurar o jogo
                        game.startPlaying(); // Solicitar ao objeto game para iniciar o loop principal do jogo (permance solicitando a entrada do usuário e verificando o palpite)
                        break;
                    case 2:
                        System.out.println("Exit..");
                        break;
                    default:
                        System.out.println("Enter a number between 1 and 2.");
                }
            }catch (InputMismatchException e){
                System.out.println("Error: Enter numbers");
                sc.nextLine();
            }
        }while (op != 2);

    }







}