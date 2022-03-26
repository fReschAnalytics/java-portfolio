package com.freschanalytics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // initialize the necessary variables as doubles
        double inputPounds, outputKgs;

        // ask user for input weight in pounds
        Scanner in = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        inputPounds = in.nextDouble();

        // calculate weight in kgs
        outputKgs = inputPounds * 0.45359237;

        System.out.println("The mass in kilograms is: " + outputKgs);
    }
}
