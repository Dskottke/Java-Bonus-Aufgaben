package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Level Novice

        //Aufgabe 1
        String name = "John";
        System.out.println(name);
        //Aufgabe 2
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
        //Aufgabe 3
        System.out.println(isGreater0(1));
        //Aufgabe 4
        System.out.println(square(2));
        //Aufgabe 5
        String inputName = new java.util.Scanner(System.in).nextLine();
        sayName(inputName);
        //Intermediate

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
        //Aufgabe 5
        String testString = "peter";
        System.out.println(reverseString(testString));
        //Aufgabe 6
        int[] intArray = {6, 2, 8, 3, 9, 6};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        //Aufgabe 7
        String stringToSeperate = "Hallo, wie ,geht, es, dir?";
        String[] seperatedStringArray = seperateStringToArray(stringToSeperate);
        System.out.println(Arrays.toString(seperatedStringArray));
        //Aufgabe 8
        System.out.println(getCheckSum(123));
        //Aufgabe 9
        System.out.println(getRomanianNumber(42));
    }

    public static void sayName(String name) {
        System.out.println("Hello " + name);
    }

    public static boolean isGreater0(int number) {
        return number > 0;
    }

    public static int square(int number) {
        return number * number;
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

    public static String reverseString(String string) {
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }

    public static String[] seperateStringToArray(String string) {
        return string.split(",");
    }

    public static int getCheckSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static String getRomanianNumber(int i) {
        String romanianNumber = "";
        if (i <= 0) {
            return "Die Zahl muss größer als 0 sein";
        }

        while (i >= 100) {
            romanianNumber += "C";
            i -= 100;
        }
        while (i >= 90) {
            romanianNumber += "XC";
            i -= 90;
        }
        while (i >= 50) {
            romanianNumber += "L";
            i -= 50;
        }
        while (i >= 40) {
            romanianNumber += "XL";
            i -= 40;
        }
        while (i >= 10) {
            romanianNumber += "X";
            i -= 10;
        }
        while (i >= 9) {
            romanianNumber += "IX";
            i -= 9;
        }
        while (i >= 5) {
            romanianNumber += "V";
            i -= 5;
        }
        while (i >= 4) {
            romanianNumber += "IV";
            i -= 4;
        }
        while (i >= 1) {
            romanianNumber += "I";
            i -= 1;
        }


        return romanianNumber;
    }

}