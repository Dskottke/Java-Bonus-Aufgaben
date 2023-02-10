package org.example;

import java.util.Arrays;

public class Expert {
    public static void main(String[] args) {
        //Aufgabe 1
        String testString = "peter";
        System.out.println(reverseString(testString));
        //Aufgabe 2
        int[] intArray = {6, 2, 8, 3, 9, 6};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        //Aufgabe 3
        String stringToSeperate = "Hallo, wie ,geht, es, dir?";
        String[] seperatedStringArray = seperateStringToArray(stringToSeperate);
        System.out.println(Arrays.toString(seperatedStringArray));
        //Aufgabe 4
        System.out.println(getCheckSum(123));
        //Aufgabe 5
        System.out.println(getRomanianNumber(42));
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
