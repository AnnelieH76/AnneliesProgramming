package Inlämningsuppgift_Annelie_Hagen;

import java.util.ArrayList;

public class TextClass {

    private ArrayList<String> inputLines; //Array med dynamisk storlek.

    public TextClass() { //Konstruktor
        this.inputLines = new ArrayList<>(); /*Skapar en ny tom ArrayList som startvärde för inputLines,
        vilket är att föredra framför en vanlig konstruktor i det här fallet enligt ChatGPT*/
    }

    public boolean isStop(String input) { //Metod som kontrollerar om den inlästa textraden innehåller ordet "stop"
        return input.contains("stop"); //Returnerar true om den innehåller ordet "stop", annars false.
    }

    public void addLine(String input) { //Metod som lägger till den inlästa raden input till listan inputLines
        inputLines.add(input);
    }

    public int lineCount() { //Metod som räknar antal rader
        return inputLines.size();
    }

    public int charCount() { //Metod som räknar antal tecken
        int charCount = 0;
        for (int i = 0; i < inputLines.size(); i++){ //For-loopen går igenom varje rad i inputLines
            charCount += inputLines.get(i).length();}//Adderar antal tecken för varje rad
        return charCount;
    }

    public int wordCount() { //Metod som räknar antal ord
        int wordCount = 0;
        for (int i = 0; i < inputLines.size(); i++) {
            String line = inputLines.get(i);//Hämtar raden från listan
            String[] words = line.trim().split("\\s+"); //Skapar en ny array av ord genom att dela upp raden vid mellanslag.
            // trim() tar bort eventuella mellanslag före och efter en rad.
            // split(" ") delar upp raden till ord baserat på mellanslag. \\s+ hanterar flera eventuella mellanslag efter varandra
            wordCount += words.length;  //Adderar antal ord för varje rad
        }
        return wordCount;
    }

    public String longestWord() { //Metod som returnerar det längsta ordet.
        String longestWord = "";
        for (String line : inputLines) { //For-each-loop som har lite kortare syntax än vanlig for-loop
            String[] words = line.trim().split("\\s+"); //Skapar array av ord
            for (String word : words) { //En nästlad for-each-loop går igenom varje ord i arrayn
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}