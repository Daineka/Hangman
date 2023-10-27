package main;
//Проверка на наличие введеной буквы в секретное слово
public class CheckSecretWord {
    public static StringBuilder checkSecretWord(StringBuilder guessedWord, String word, char c) {

        if (guessedWord == null && c == 0) {
            guessedWord = new StringBuilder();
            guessedWord.append("*".repeat(word.length()));
        } else if (c != 0 && guessedWord != null) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    guessedWord.setCharAt(i, c);
                }
            }
        }
        return guessedWord;
    }
}
