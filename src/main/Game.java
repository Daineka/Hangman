package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static main.CheckSecretWord.checkSecretWord;
import static main.ChoiceSecretWord.choiceSecretWord;
import static main.PrintGallow.drawGallows;

public class Game {
    private static final Scanner scanner = new Scanner(System.in);

    public static void game() {

        Set<Character> usedLetters = new HashSet<>();
        String secretWord = choiceSecretWord();
        System.out.println(secretWord);
        StringBuilder guessedWord = null;
        char usedLetter = 0;
        int countMistakes = 7;

        System.out.println("Начинаем игру (можно допустить " + (countMistakes - 1) + " ошибок).\n" +
                "=========================================");

        guessedWord = checkSecretWord(guessedWord, secretWord, usedLetter);
        drawGallows(countMistakes);

        do {

            System.out.println(guessedWord);

            while (usedLetter == 0) {
                usedLetter = enterLetter();
                if (usedLetters.contains(usedLetter)) {
                    System.out.println("Такую букву уже вводили! Попробуйте еще раз!");
                    usedLetter = 0;
                } else {
                    usedLetters.add(usedLetter);
                }
            }

            if (secretWord.indexOf(usedLetter) != -1) {
                guessedWord = checkSecretWord(guessedWord, secretWord, usedLetter);
            } else {
                countMistakes--;
                System.out.println("Ошиблись. Такой буквы в слове нет.");
            }

            drawGallows(countMistakes);
            System.out.println("Допущено ошибок: " + (7 - countMistakes) + "\n" +
                    "=========================================");

            if (guessedWord.indexOf("*") == -1) {
                System.out.println("Вы выиграли!!! Слово: " + secretWord);
                break;
            }

            usedLetter = 0;
        } while (countMistakes != 1);
    }

    private static char enterLetter() {
        System.out.print("Введите один кириллический символ: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 1) {
            System.out.println("Неверный ввод. Нужно ввести всего лишь один кириллический символ.");
            return 0;
        }

        char c = input.toLowerCase().charAt(0);
        if (isCyrillic(c)) {
            return c;
        } else {
            System.out.println("Неверный ввод. Символ не похож на кириллический.");
            return 0;
        }
    }

    public static boolean isCyrillic(char c) {
        return (c >= 'а' && c <= 'я');
    }
}
