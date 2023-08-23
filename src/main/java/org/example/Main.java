package org.example;
import java.util.Scanner;  // Import the Scanner class



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

        //Schritt 5: Führe eine elementweise Addition beider Arrays durch und speichere das Ergebnis in einem dritten Array. Gib das Ergebnis-Array auf der Konsole aus.
        System.out.println("--elementweise Addition beider Arrays--");
        int[] number3 = addArrayElements(numbers1, numbers2);

        for (int number: number3) {
            System.out.println(number);
        }

        //Implementiere ein Programm, das einen Text von der Konsole einliest und anschließend die Buchstaben einzeln ausgibt. Tipp : Erkundigt euch über die Klasse Scanner.
        for (String character: wrapUserInput1by1()) {
            System.out.println(character);
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

    public static int[] addArrayElements(int [] array1, int [] array2){
        int [] numbers3 = new int [10];

        //---In Case one Array is longer than the other ---
        int arrayLenght;
        if(array1.length < array2.length){
            arrayLenght = array1.length;
        }else{
            arrayLenght = array2.length;
        }

        for(int x = 0; x < arrayLenght; x++){
            numbers3[x] = array1[x]+array2[x];
        }

        return numbers3;
    }


    public static String[] wrapUserInput1by1 (){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userInput = myObj.nextLine();  // Read user input
        String[] result = userInput.split("");
        return result;

    }
}