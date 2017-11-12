
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!word.contains(letter) && !guessedLetters.contains(letter)){
            numberOfFaults++;
        }
        if (!guessedLetters.contains(letter)){
            guessedLetters += letter;
        }

    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++){
            String letter = "" + word.charAt(i);
            if (guessedLetters.contains(letter)){
                hiddenWord += letter;
            }else {
                hiddenWord += "_";
            }
        }

        return hiddenWord;
    }

}
