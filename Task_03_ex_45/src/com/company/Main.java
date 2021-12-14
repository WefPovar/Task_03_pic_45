package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Picture picture = new Picture(new VerticalParabola(4, -1, 0.25),
                new VerticalParabola(1, 4, -0.5),
                new Circle(-4, -4, 5));

        checkTests(picture);

        System.out.println(" ");

        double x = readNum("X:");
        double y = readNum("Y:");

        printColorForPoint(picture, x, y);

    }

    public static void printColorForPoint(Picture picture, double x, double y) {
        System.out.println(picture.getColor(x, y));
    }

    private static double readNum(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        if (num < -10 || num > 10) {
            System.out.println("Error,you need to input > -10 and(or) < 10 ");
        }
        return num;
    }

    private static void checkTests(Picture picture) {
        Tests test = new Tests();

        if (test.programTests(picture)) {
            System.out.println("All tests completed");
        } else {
            System.out.println("Gg");
        }
    }
}
