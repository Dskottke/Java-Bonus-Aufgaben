package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        //Aufgabe 1
        String[] names = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

        //Aufgabe 2
        printNumberAsString(4);

        //Aufgabe 3
        printNumbersTo100();

        //Aufgabe 4
        String[] stringArray = new String[0];
        String[] stringNewArray = addNamesToArrayWithScanner(stringArray);
        System.out.println(Arrays.toString(stringNewArray));
    }

    public static void printNumbersTo100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("#$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            }
        }
    }

    public static void printNumberAsString(int number) {
        switch (number) {
            case 1 -> System.out.println("Eins");
            case 2 -> System.out.println("Zwei");
            case 3 -> System.out.println("Drei");
            case 4 -> System.out.println("Vier");
            case 5 -> System.out.println("Fünf");
            case 6 -> System.out.println("Sechs");
            case 7 -> System.out.println("Sieben");
            case 8 -> System.out.println("Acht");
            case 9 -> System.out.println("Neun");
        }

    }
    public static String[] addNamesToArrayWithScanner(String[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie einen Namen ein oder beenden sie mit stop");
        String input = scanner.nextLine();
        if (input.equals("stop")) {
            return array;
        } else {
            System.out.println(input);
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = input;
            return addNamesToArrayWithScanner(array);
        }
    }


}
