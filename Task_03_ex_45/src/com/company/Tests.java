package com.company;

public class Tests {

    public boolean programTests(Picture picture) {
        if (picture.getColor(1.5, 2.2) == SimpleColor.ORANGE) {
            System.out.println("Test 1 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(1, 0) == SimpleColor.YELLOW) {
            System.out.println("Test 2 completed");
        } else {
            System.out.println("Error");
            return false;
       }
        if (picture.getColor(0, -3) == SimpleColor.ORANGE) {
            System.out.println("Test 3 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(3, -2) == SimpleColor.YELLOW) {
            System.out.println("Test 4 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(0, -5) == SimpleColor.ORANGE) {
            System.out.println("Test 5 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-3, 5) == SimpleColor.ORANGE) {
            System.out.println("Test 6 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(-3, 0) == SimpleColor.YELLOW) {
            System.out.println("Test 7 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(9, 2) == SimpleColor.GREEN) {
            System.out.println("Test 8 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(0, 3.3) == SimpleColor.ORANGE) {
            System.out.println("Test 9 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        if (picture.getColor(4, 3) == SimpleColor.ORANGE) {
            System.out.println("Test 10 completed");
        } else {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}
