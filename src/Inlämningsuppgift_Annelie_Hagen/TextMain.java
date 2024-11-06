package Inlämningsuppgift_Annelie_Hagen;

import java.util.Scanner;

public class TextMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in text rad för rad, avsluta med ordet stop: ");

        TextClass text = new TextClass();//Nytt objekt skapas

        while (true){
            String input = scanner.nextLine(); //Läser in en rad med text och sparar den i variabeln input
            if (text.isStop(input)){ //Om textobjektet som anropar metoden 'isStop' returnerar att den inlästa raden innehåller "stop"
                break; //Då bryts loopen
            }
            text.addLine(input); //Annars lägg till den inlästa raden i textobjektet.
        }
        scanner.close();

        System.out.println("Antal rader, exkl raden med ordet 'stop', är: " + text.getLineCount());
        System.out.println("Antal tecken är: " + text.getCharCount()); //Skriver ut antal tecken inkl mellanslag i raderna ovan.
        System.out.println("Antal ord är: " + text.getWordCount()); //Skriver ut antal ord i raderna ovan
        System.out.println("Det längsta ordet är: " + text.getLongestWord()); //Skriver ut längsta ordet
    }
}