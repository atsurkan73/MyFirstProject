package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Test3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 16;

        System.out.println("Enter any phrase not more that 1000 letters: ");
        Scanner scanText = new Scanner(System.in);
        String text = scanText.nextLine();

        System.out.println("Enter any number 1.0...1000.0: ");
        Scanner scanNum = new Scanner(System.in);
        double number3 = scanNum.nextDouble();
        System.out.println("You entered: " + text);
        System.out.println("You entered: " + number3);
    }
}
