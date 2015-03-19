





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stella
 */
import java.util.ArrayList;
public class Things {

    private String word;
    //private ArrayList<Character> guessed = new ArrayList<>();

    public ArrayList<String> getWords() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("java");
        words.add("library");
        words.add("method");
        words.add("function");
        words.add("static");
        words.add("void");
        words.add("main");
        words.add("string");
        words.add("array");
        words.add("class");
        words.add("package");
        words.add("static");
        words.add("program");
        words.add("getters");
        words.add("setters");
        words.add("object");
        words.add("heap");
        words.add("stack");
        
        return words;

    }

    public String pickWords(ArrayList<String> words) {
        int s= words.size();
        int letter = (int) (Math.random() * s - 1);
        word = words.get(letter);
        return word;

    }

    private String [] getArrayOfCharString(String word) {
        String[] chars = new String[word.length()];        
        for (int i = 0; i < word.length(); i++) 
            chars[i] = Character.toString(word.charAt(i));
        return chars;

    }

    public boolean charInWordAndNotGuessedYet(String word, String[] chars, String guessedChar) {
        boolean inWord = false;
        boolean inChars = false;
        for (String ch : chars) {
            if (guessedChar.equalsIgnoreCase(ch)) {
                inChars = true;
                break;
            }
        }
        if (inChars == false && word.contains(guessedChar)) {
            inWord = true;
        }
        return inWord;
    }

    public void addToGuessedChar(String word, String[] dashed, String guessedChar) {
        
        String [] wordChar = getArrayOfCharString(word);
        for(int i=0; i<word.length(); i++){
            if(guessedChar.equalsIgnoreCase(wordChar[i])){
                dashed[i]=guessedChar;
            }
        }
    }

    public void printWord(String[] word) {
        String chr = "";
        for (String w : word) {
            chr += " " + w;
        }
        System.out.println(chr);
    }

}

