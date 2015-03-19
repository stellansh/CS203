import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author stella
 */
public class GuessWord {

    public static void main(String[] args) {
        Things things = new Things();

        ArrayList<String> words = things.getWords();
        String word = things.pickWords(words);

        String[] dashes = new String[word.length()];
        for (int i = 0; i < dashes.length; i++) {
            dashes[i] = "_";
        }
        System.out.println("give me any letter of the word u are guessing: ");
        
        things.printWord(dashes);
        
        System.out.println("word: "+word);

       int error = 0;
        boolean success = false;
        while (error < 5 && success == false) {
            Scanner userInput = new Scanner(System.in);
            String chr = userInput.nextLine();
            if (chr.length() == 1) {
                if (things.charInWordAndNotGuessedYet(word, dashes, chr)) {
                    things.addToGuessedChar(word, dashes, chr);
                    if (word.equalsIgnoreCase(String.join("", dashes))) {
                        System.out.println("Success Game over!");
                        break;
                    }
                } else {
                    error++;
                    System.out.println("Try again!before u enter serious danger Error: " + error);
                }
                things.printWord(dashes);

            } else {
                System.out.println("Wrong input try again!");
                error++;

            }
            if (error == 1) {

                System.out.println("Try again! you already have " + error + "error");
                System.out.println("  o  ");
                System.out.println(" /|\\ ");
                System.out.println(" / \\ ");
            }
            if (error == 2) {

                System.out.println("Try again! you now have " + error + "errors");
                System.out.println("oops you lost your leg");
                System.out.println("  o  ");
                System.out.println(" /|\\ ");
                System.out.println("   \\ ");
            }
            if (error == 3) {

                System.out.println("Try again! you now have " + error + "errors");
                System.out.println("so sad you r left with no legs");
                System.out.println("  o  ");
                System.out.println("  |\\ ");
                System.out.println("   \\ ");
            }
            if (error == 4) {

                System.out.println("Try again! you now have " + error + "errors");
                System.out.println("oh lala you r left u also lost an arm ");
                System.out.println("  o  ");
                System.out.println("  |\\ ");
                System.out.println("    ");
            }
            if (error == 5) {

                System.out.println("Try again! you now have " + error + "errors");
                System.out.println("oops you r left with no arms and legs");
                System.out.println("  o  ");
                System.out.println("  | ");
                System.out.println("    ");
            }
            if (error == 6) {

                System.out.println("Try again! you now have " + error + "errors");
                System.out.println("and you still got your head"); 
                System.out.println("  o  ");
                System.out.println("    ");
                System.out.println("    ");
            }
            if (error == 5) {
                System.out.println("You only had " + error + " tries");
                System.out.println("haha, you lost your head too?  ");
                
                break;
            }
        }
    }

}
