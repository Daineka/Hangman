package main;

import java.util.Scanner;

import static main.Game.game;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String newGame = """
            =========================================
            Начать игру Висилица)? (Да/Нет)
            =========================================""";

    public static void main(String[] args) {
        while (true) {
            System.out.println(newGame);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("да") || input.equals("д")) {
                game();
            } else if (input.equals("нет") || input.equals("н")) {
                System.out.println("Выход из игры.");
                break;
            } else {
                System.out.println("Неверный ввод. Попробуйте ввести еще раз.");
            }
        }
    }

}