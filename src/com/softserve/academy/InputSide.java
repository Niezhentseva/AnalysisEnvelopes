package com.softserve.academy;

import java.util.Scanner;

public class InputSide {
    private double[] sides = new double[4];

    // the method writes sides from the console and return the array with sides
    double[] getInputSide() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sides.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Envelope 1\nside1: ");
                    break;
                case 1:
                    System.out.print("side2: ");
                    break;
                case 2:
                    System.out.print("Envelope 2\nside1: ");
                    break;
                case 3:
                    System.out.print("side2: ");
            }
            sides[i] = scanner.nextDouble();
        }
        return sides;
    }
}