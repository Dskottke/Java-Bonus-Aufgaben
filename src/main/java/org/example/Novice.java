package org.example;

public class Novice {
    public static void main(String[] args) {
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

}