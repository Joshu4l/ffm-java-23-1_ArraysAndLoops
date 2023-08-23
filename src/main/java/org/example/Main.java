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

        //Schritt 3: Finde die größte Zahl im Array und gib sie auf der Konsole aus.//
        System.out.println("Max: " + searchMaximum(numbers1));

        //Schritt 4: Erstelle ein zweites Array mit den Zahlen von 11 bis 20.
        System.out.println("----");
        int[] numbers2 = new int[10];

        for(int i=0; i<numbers2.length; i++) {
            numbers2[i] = 11+i;
        }
        for (int number: numbers2) {
            System.out.println(number);
        }

    }
    public static int searchMaximum(int[] searchArray){
        int returnMax = 0;
        for(int search : searchArray){
            if(returnMax < search){
                returnMax = search;
            }
        }
        return returnMax;
    }


}