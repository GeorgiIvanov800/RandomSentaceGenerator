import java.util.Random;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class RandomSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"John", "Izabela", "Mike", "Jin", "Maira", "Sushi"};
        String[] places = {"Bangladesh","New York", "Berlin", "Monaco", "Paris", "London"};
        String[] verbs = {"eats", "sleeps", "holds", "claps", "jumps", "snores", "pokes"};
        String[] adverbs = {"fast", "diligently", "slowly", "passionately", "hardly", "stupidly", "sadly"};
        String[] details = {"on the beach", "in the MALL", "at home", "at the party", "in the park", "in the restaurant"};
        System.out.println("Hello there,\nlet's try and see what will come form these random sentences");
        System.out.println("Press [Enter] to continue");
        String input = scanner.nextLine();

        while (input.equals("")) {

            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);

            System.out.printf("%s from %s %s %s  %s%n", randomName, randomPlace, randomAdverb, randomVerb, randomDetail);
            System.out.println("Click [Enter] to generate a new one");

            input = scanner.nextLine();
        }

    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}