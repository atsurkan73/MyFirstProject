package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Enter number1 1...10: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();

        System.out.println("Enter number2 1...10: ");
        int number2 = scan.nextInt();

        System.out.println("Enter your name : ");
        Scanner scanText = new Scanner(System.in);
        String name = scanText.nextLine();
        int result = number1 + number2;

        System.out.println(name + " " + result);
    }
}