import java.util.Random;
import java.util.Scanner;

public class guessTheWord {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        String guess = getRandomWord(words);
        String sharpedGuess = sharpedWord(guess);



        while (true) {
            String playerWord = scanner.next();
            playerWord = sharpedWord(playerWord);
            if (sharpedGuess.equals(playerWord)) {
                System.out.println("Ответ верный");
                break;
            } else {
                String maskedResult = "";
                for (int i = 0; i < sharpedGuess.length() - 1; i++) {
                    if (sharpedGuess.charAt(i) == playerWord.charAt(i)) maskedResult += sharpedGuess.charAt(i);
                    else maskedResult += "#";
                }
                System.out.println(maskedResult);
                System.out.println("Ответ не верный, попробуй ещё раз.");
            }
        }

    }

    public static String getRandomWord(String[] s) {
        return s[random.nextInt(s.length - 1)];
    }

    public static String sharpedWord(String s) {
        String sharp = "###############";
        for (int i = s.length() - 1; i < sharp.length() - 1; i++) {
            s += sharp.charAt(i);
        }
        return s;
    }
}

