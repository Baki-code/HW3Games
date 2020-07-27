import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Хочешь сыграть? 1 - \"ДА\", 0 - \"НЕТ\"");
        int wannaPlay = scanner.nextInt();

        if (wannaPlay == 1) {
            startGame();
        } else {
            System.out.println("Пока!");
            System.exit(1);
        }
    }

    public static void startGame() {
        System.out.println("Угадай число от 0 до 9. У тебя 3 попытки");

        int quest = random.nextInt(9);
        int answer = scanner.nextInt();

        for (int i = 2; i > 1; ) {
            if (answer > quest) {
                i--;
                System.out.printf("Загаданное число меньше. Осталось %d попыток \n", i);
                scanner.nextInt();
                if (i == 0) {
                    System.out.println("Ты проиграл");
                    break;
                }

            } else if (answer < quest) {
                i--;
                System.out.printf("Загаданное число больше. Осталось %d попыток \n", i);
                scanner.nextInt();
                if (i == 0) {
                    System.out.println("Ты проиграл");
                    break;
                }

            } else {
                System.out.println("Верно!");
                break;
            }
        }
        gameRepeat();
    }

    public static void gameRepeat() {

        System.out.println("Повторить игру еще раз? 1 – \"ДА\" / 0 – \"НЕТ\"");
        int answerRepeat = scanner.nextInt();
        if (answerRepeat == 1) {
            startGame();
        } else {
            System.out.println("Пока!");
            System.exit(1);
        }

    }
    }
}
