package Inlämningsuppgift_Annelie_Hagen;

import java.util.ArrayList;

public class TextClass {

    private ArrayList<String> inputLines; //Array med dynamisk storlek.

    public TextClass() { //Konstruktor
        this.inputLines = new ArrayList<>(); //Skapar en ny tom ArrayList som startvärde för inputLines,
        // vilket är att föredra framför en vanlig konstruktor i det här fallet enligt ChatGPT
    }

    public boolean isStop(String input) { //Metod som kontrollerar om den inlästa textraden innehåller ordet "stop"
        return input.contains("stop"); //Returnerar true om den innehåller ordet "stop", annars false.
    }

    public void addLine(String input) { //Metod som lägger till den inlästa raden input till listan inputLines
        inputLines.add(input);
    }

    public int getLineCount() { //Metod som räknar raderna
        return inputLines.size();
    }

    public int getCharCount() { //Metod som räknar tecken
        int charCount = 0;
        for (int i = 0; i < inputLines.size(); i++) { //For-loopen går igenom varje rad i inputLines
            charCount += inputLines.get(i).length();
        }//I variabeln charCount adderas antal tecken för varje rad
        return charCount;
    }

    public int getWordCount() {
        int wordCount = 0;
        for (String line : inputLines) { //For-each-loopen går igenom varje rad i inputLines
            String[] words = line.trim().split("\\s+"); //Skapar en ny array av ord genom att dela upp raden vid mellanslag.
            // trim() tar bort eventuella  mellanslag före och efter en rad.
            // split(" ") delar upp raden till ord baserat på mellanslag. \\s+ "slår ihop" flera eventuella mellanslag efter varandra
            wordCount += words.length;  //I variabeln wordCount adderas antal ord för varje rad
        }
        return wordCount; //Returnerar totalt antal ord
    }

    public String getLongestWord() { //Metod som returnerar det längsta ordet.
        String longestWord = "";
        for (String line : inputLines) { //For-each-loopen går igenom varje textrad i inputLines
            String[] words = line.trim().split("\\s+"); //En ny array delar upp raden i ord.
            for (String word : words) { //En nästlad for-each-loop går igenom varje ord i arrayn
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord; //Returnerar det längsta ordet.
    }
}

