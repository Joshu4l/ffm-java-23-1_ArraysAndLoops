package org.example;



public class Main {

    public static void main(String[] args) {

        // Schritt 1: Erstelle ein Array mit den Zahlen von 1 bis 10 und gib es auf der Konsole aus.
        int[] numbers1 = new int[10];

        for(int i=0; i<numbers1.length; i++) {
            numbers1[i] = i+1;
        }

        for (int number: numbers1) {
            System.out.println(number);
        }

        //Schritt 2: Berechne die Summe aller Zahlen im Array und gib das Ergebnis auf der Konsole aus.
        int sum = 0;

        for(int number: numbers1) {
            sum += number;
        }
        System.out.println(sum);
    }
}