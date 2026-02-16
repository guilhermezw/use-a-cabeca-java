import java.util.Random;

public class PhraseGenerator {
    public static void main(String[] args) {
        String[] pets = {"Nino" , "Bob" , "James"};
        int pet = pets.length;

        Random randomGenerator = new Random();

        int rand = randomGenerator.nextInt(pet);

        String s = pets[rand];

        System.out.println(s + " is a dog");

    }
}
